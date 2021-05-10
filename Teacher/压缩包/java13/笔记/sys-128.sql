select * from all_users;
drop user jack cascade; -- 删除用户同时删除用户的数据
select * from user_tablespaces;
drop tablespace xiaohei including contents and datafiles; -- 删除表空间及文件

-- 创建表空间
create tablespace ts_jack
datafile 'C:\oracle\product\10.2.0\oradata\orcl\ts_jack.dbf'
size 10M 
autoextend  on next 10M 
maxsize 100M
extent management local; 

-- 创建用户指定表空间
create user jack identified by "123456" default tablespace ts_jack;

-- 授权
grant connect,resource to jack;





