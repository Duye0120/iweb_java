select * from all_users;
drop user jack cascade; -- ɾ���û�ͬʱɾ���û�������
select * from user_tablespaces;
drop tablespace xiaohei including contents and datafiles; -- ɾ����ռ估�ļ�

-- ������ռ�
create tablespace ts_jack
datafile 'C:\oracle\product\10.2.0\oradata\orcl\ts_jack.dbf'
size 10M 
autoextend  on next 10M 
maxsize 100M
extent management local; 

-- �����û�ָ����ռ�
create user jack identified by "123456" default tablespace ts_jack;

-- ��Ȩ
grant connect,resource to jack;





