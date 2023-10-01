create database quanlysv;
use quanlysv;
create table class(
class_id int auto_increment not null,
class_name varchar(60) not null,
startdate datetime not null,
class_status bit(1),
primary key(class_id)
); 
	
create table student(
student_id int auto_increment not null,
student_name varchar(30) not null,
student_address varchar(50),
student_phone varchar(20),
student_status bit,
class_id int not null,
foreign key(class_id) references class (class_id),
primary key(student_id)
);

create table subjectt(
sub_id int auto_increment not null,
sub_name varchar(30) not null,
sub_credit tinyint not null check(credit >= 1) default 1,
sub_bit bit default 1
);

create table mark(
mark_id int not null auto_increment primary key,
sub_id int not null,
student_id int not null,
mark float default 0 check ( mark  between 0 and  100),
examtime tinyint default 1
);
