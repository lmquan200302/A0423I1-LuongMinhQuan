create database qlsv;
use qlsv;
create table qlsv.class(
id_class int not null auto_increment primary key,
name_class varchar(100)
);
create table qlsv.teacher(
id_teacher int not null auto_increment primary key,
name_teacher varchar(100),
age int,
country varchar(100)
);
