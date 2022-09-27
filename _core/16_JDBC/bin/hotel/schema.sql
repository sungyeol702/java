use javadb;

drop table if exists room;

create table if not exists room (
rno varchar(4) primary key,
guest_name varchar(100),
guest_tel varchar(20) not null,
guest_age int(3),
guest_gen tinyint(1),
is_empty tinyint(1) default 0,
check_in_time datetime,
check_out_time datetime
);

desc room;


insert into room(rno,guest_tel) 
values ('101호',0)

select * from room;

select * from product where rno = '101호';

update room set guest_name = ?,
guest_tel= 010, 
guest_age = 32,
guest_gen = 'm',
is_empty = 1,
check_in_time = now()
where rno = '101호';


delete from room where rno = 1;

select * from room;
