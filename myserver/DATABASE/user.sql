create table users(
id       varchar2(8) primary key,
password varchar2(8),
name     varchar2(20),
role     varchar2(5));

insert into users values('test','test123','홍길동','Admin');
insert into users values('user1','user1','나훈아','User');

commit;