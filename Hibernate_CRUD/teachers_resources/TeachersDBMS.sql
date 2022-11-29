drop database if exists jdbc_db;
create database jdbc_db;
use jdbc_db;

create table if not exists teachers(
	id bigint primary key auto_increment,
	name varchar(40) not null,
	subject varchar(50) not null,
	exp int not null
);

insert into teachers (name,subject,exp) values
	('Nimisha', 'Physics', 15),
	('Narren', 'Maths', 15);
    
select * from teachers;