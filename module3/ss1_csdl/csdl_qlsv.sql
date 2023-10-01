create database csdl_qlsv;
use csdl_qlsv;
create table class(
id_class int not null auto_increment primary key,
name_class varchar(100)
);
create table teacher(
id_teacher int not null auto_increment primary key,
name_teacher varchar(100),
age int,
country varchar(100)
);
