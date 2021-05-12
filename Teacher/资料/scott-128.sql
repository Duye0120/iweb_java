-- 事务
-- 什么事务？ 一些列的操作（要有增删改） 看作是一个整体 需要一个事务
-- 为什么要事务？ 比如说转账这个功能  更新转出账户  更新转入账户
-- 事务的四大特征： 原子性 一致性 隔离性 持久性
/*
1、原子性（Atomicity）：事务开始后所有操作，要么全部做完，要么全部不做.
2、一致性（Consistency）：事务开始前和结束后，数据库的完整性约束没有被破坏 .
3、隔离性（Isolation）：同一时间，只允许一个事务请求同一数据，不同的事务之间彼此没有任何干扰。比如A正在从一张银行卡中取钱，在A取钱的过程结束前，B不能向这张卡转账。
4、持久性（Durability）：事务完成后，事务对数据库的所有更新将被保存（commit）到数据库，不能回滚。
*/

-- 事务的语法： 
-- savepoint 'name' 设置回滚点  rollback to 'name' 回滚 commit 提交
-- 使用7902用户测试
select * from emp where empno = 7902;
-- 修改工资 4000
update emp set sal = 4000 where empno = 7902; -- 只会将操作的结果保存在本地session中
commit;
update emp set sal = 3000 where empno = 7902;
rollback;
-- 设定回滚点
update emp set sal = 5000 where empno = 7902;
savepoint a;
update emp set sal = 6000 where empno = 7902;
savepoint b;
select * from emp where empno = 7902;
rollback to a;
select * from emp where empno = 7902;
commit;
-- 隔离性的实验
-- 1. 使用2个客户端 A 和 B
-- 2. A 客户端执行 
update emp set sal = 5000 where empno = 7902;
-- 3. B 客户端执行 
update emp set sal = 6000 where empno = 7902; -- 对同一条数据进行修改
-- 会发现 B 客户端阻塞, 当A客户端commit 或者 rollback的时候B 客户端才能操作
-- 其本质上是加锁

-- oracle 的锁是 行锁   增删改 -- 使用同一个主键进行插入 看下有什么发生
-- 悲观锁&乐观锁
-- 悲观锁（总有刁民想害朕） 总是认为自己的操作可能失败 select * from emp for update; 
-- 乐观锁（光脚的不怕穿鞋的）总是认为自己的一定成功 select * from emp;

-- 索引 ： index 可用提高数据库的查询效率  oracle的索引有2种数据结构 位图和B树(默认的) 
-- 索引的生成原理： 
-- 1. 将索引字段排序
-- 2. 建立 B树 

-- 如何确认是否使用了索引: 可以通过查看执行计划

select * from emp where empno = 7900;

create table tb_stu(
id varchar2(100),
account varchar2(100),
username varchar2(100),
password varchar2(100),
birth date,
sex varchar2(4),
email varchar2(100),
mobile varchar2(20),
create_date date,
update_date date,
description varchar2(100)
);

select count(1) from tb_stu;
-- E4BE31A6-E714-404B-99B9-22611DC9AAC6   3S
select * from tb_stu where id = 'E4BE31A6-E714-404B-99B9-22611DC9AAC6';

create unique index idx_id on tb_stu(id); -- 21S
select * from tb_stu where id = 'E4BE31A6-E714-404B-99B9-22611DC9AAC6';

-- 创建复合索引
create unique index idx_id on tb_stu(username,password); 
-- 删除索引
drop index idx_id;

select * from all_indexes where table_name = 'TB_STU';

-- 符合索引的使用
create unique index idx_id on tb_stu(account,email); 
select * from tb_stu where  email = '';
-- like
select * from tb_stu  where account like 'AA%';
-- in
select * from tb_stu  where account in ('AA');  

-- 在网上找到一些 SQL优化的文章基本上是 mysql  而 oracle 不一样 需要验证
/*
SQL 优化的问题
1. 如果数据量很少不需要索引
2. 针对查询使用比较多的字段使用索引，否则反而浪费性能
3. 如果表的增删改的比较多 不适合用索引, 每次增删改会导致索引重排
4. 对于符合索引我们尽量使用 全匹配模式,最左前缀法则
5. like 查询前面使用通配会破坏索引   name: jack aack abc adk cbd 查 第二个是 a 的
like '_a%'  优化   like 'ja%' and like 'aa%' and like 'ca%';
6. (优化 和索引关系不大)尽量使用 <=  代替   <     例如 <3  等同于  <=2   10000个3   100个2
*/

-- 视图 (了解 基本不用) 什么视图 如何创建视图 视图和表的区别 

-- 伪列(rowid) rownumber
-- rowid 物理地址
-- rownumber 虚拟的序号, 变化的 , 只有根据有索引的列排序才会变化 一定从1开始
select e.*,rowid,rownum from emp e order by sal;
-- 不变的
select * from emp where rowid = 'AAAMfPAAEAAAAAgAAA' order by empno;
-- 分页
-- 不排序
select * from 
(select e.*,rownum rn from emp e where rownum <=10) a where a.rn>5;
-- 有排序
select * from
(select a.*,rownum rn  from 
(select e.* from emp e order by sal) a where rownum <=5 ) b  where b.rn>0;
select e.*,rownum rn from emp e order by sal;
-- PL/SQL 块
-- 自定义函数 function
-- 存储过程
