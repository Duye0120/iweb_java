-- ����
-- ʲô���� һЩ�еĲ�����Ҫ����ɾ�ģ� ������һ������ ��Ҫһ������
-- ΪʲôҪ���� ����˵ת���������  ����ת���˻�  ����ת���˻�
-- ������Ĵ������� ԭ���� һ���� ������ �־���
/*
1��ԭ���ԣ�Atomicity��������ʼ�����в�����Ҫôȫ�����꣬Ҫôȫ������.
2��һ���ԣ�Consistency��������ʼǰ�ͽ��������ݿ��������Լ��û�б��ƻ� .
3�������ԣ�Isolation����ͬһʱ�䣬ֻ����һ����������ͬһ���ݣ���ͬ������֮��˴�û���κθ��š�����A���ڴ�һ�����п���ȡǮ����AȡǮ�Ĺ��̽���ǰ��B���������ſ�ת�ˡ�
4���־��ԣ�Durability����������ɺ���������ݿ�����и��½������棨commit�������ݿ⣬���ܻع���
*/

-- ������﷨�� 
-- savepoint 'name' ���ûع���  rollback to 'name' �ع� commit �ύ
-- ʹ��7902�û�����
select * from emp where empno = 7902;
-- �޸Ĺ��� 4000
update emp set sal = 4000 where empno = 7902; -- ֻ�Ὣ�����Ľ�������ڱ���session��
commit;
update emp set sal = 3000 where empno = 7902;
rollback;
-- �趨�ع���
update emp set sal = 5000 where empno = 7902;
savepoint a;
update emp set sal = 6000 where empno = 7902;
savepoint b;
select * from emp where empno = 7902;
rollback to a;
select * from emp where empno = 7902;
commit;
-- �����Ե�ʵ��
-- 1. ʹ��2���ͻ��� A �� B
-- 2. A �ͻ���ִ�� 
update emp set sal = 5000 where empno = 7902;
-- 3. B �ͻ���ִ�� 
update emp set sal = 6000 where empno = 7902; -- ��ͬһ�����ݽ����޸�
-- �ᷢ�� B �ͻ�������, ��A�ͻ���commit ���� rollback��ʱ��B �ͻ��˲��ܲ���
-- �䱾�����Ǽ���

-- oracle ������ ����   ��ɾ�� -- ʹ��ͬһ���������в��� ������ʲô����
-- ������&�ֹ���
-- �����������е����뺦�ޣ� ������Ϊ�Լ��Ĳ�������ʧ�� select * from emp for update; 
-- �ֹ�������ŵĲ��´�Ь�ģ�������Ϊ�Լ���һ���ɹ� select * from emp;

-- ���� �� index ����������ݿ�Ĳ�ѯЧ��  oracle��������2�����ݽṹ λͼ��B��(Ĭ�ϵ�) 
-- ����������ԭ�� 
-- 1. �������ֶ�����
-- 2. ���� B�� 

-- ���ȷ���Ƿ�ʹ��������: ����ͨ���鿴ִ�мƻ�

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

-- ������������
create unique index idx_id on tb_stu(username,password); 
-- ɾ������
drop index idx_id;

select * from all_indexes where table_name = 'TB_STU';

-- ����������ʹ��
create unique index idx_id on tb_stu(account,email); 
select * from tb_stu where  email = '';
-- like
select * from tb_stu  where account like 'AA%';
-- in
select * from tb_stu  where account in ('AA');  

-- �������ҵ�һЩ SQL�Ż������»������� mysql  �� oracle ��һ�� ��Ҫ��֤
/*
SQL �Ż�������
1. ������������ٲ���Ҫ����
2. ��Բ�ѯʹ�ñȽ϶���ֶ�ʹ�����������򷴶��˷�����
3. ��������ɾ�ĵıȽ϶� ���ʺ�������, ÿ����ɾ�Ļᵼ����������
4. ���ڷ����������Ǿ���ʹ�� ȫƥ��ģʽ,����ǰ׺����
5. like ��ѯǰ��ʹ��ͨ����ƻ�����   name: jack aack abc adk cbd �� �ڶ����� a ��
like '_a%'  �Ż�   like 'ja%' and like 'aa%' and like 'ca%';
6. (�Ż� ��������ϵ����)����ʹ�� <=  ����   <     ���� <3  ��ͬ��  <=2   10000��3   100��2
*/

-- ��ͼ (�˽� ��������) ʲô��ͼ ��δ�����ͼ ��ͼ�ͱ������ 

-- α��(rowid) rownumber
-- rowid �����ַ
-- rownumber ��������, �仯�� , ֻ�и�����������������Ż�仯 һ����1��ʼ
select e.*,rowid,rownum from emp e order by sal;
-- �����
select * from emp where rowid = 'AAAMfPAAEAAAAAgAAA' order by empno;
-- ��ҳ
-- ������
select * from 
(select e.*,rownum rn from emp e where rownum <=10) a where a.rn>5;
-- ������
select * from
(select a.*,rownum rn  from 
(select e.* from emp e order by sal) a where rownum <=5 ) b  where b.rn>0;
select e.*,rownum rn from emp e order by sal;
-- PL/SQL ��
-- �Զ��庯�� function
-- �洢����
