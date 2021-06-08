create database db_shop;

use db_shop

create table tb_sys_user(
uid  varchar(100) primary key,
account varchar(100),
uname varchar(100),
upwd varchar(100),
stat varchar(1),
ctime datetime
);

select * from tb_sys_user
insert into `tb_sys_user` values ('1','sys','sys','sys','1',now());

create table tb_category(
cid varchar(100) primary key,
cname varchar(100),
stat varchar(1),
ctime datetime
);

insert into tb_category values ('1','西瓜','1',now());
select * from tb_category;

create table tb_good(
gid varchar(100) primary key,
gname varchar(100),
price double,
stat varchar(1),
store int,
img_src varchar(100),
cid varchar(100)
);

insert into tb_good values ('1','8424西瓜',25.00,'1',100,'','1')
select * from tb_good g,tb_category c where g.cid = c.cid;

create table tb_member(
meid varchar(100) primary key,
account varchar(100),
pwd varchar(100),
addr varchar(100)
);

insert into tb_member values ('1','jack','jack','江苏南京');

create table tb_order(
oid varchar(100) primary key,
meid varchar(100),
ctime datetime
);

create table tb_order_good(
oid varchar(100),
gid varchar(100),
`count` int
)