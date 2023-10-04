create database b1;
use b1;
create table class(
ClassId int auto_increment primary key,
ClassName varchar(100),
StartDay date,
StatusClass bit
);

insert into class value
(ClassId,"A01","2022-12-1",1),
(ClassId,"A02","2022-12-25",1),
(ClassId,"A03","2022-12-30",1),
(ClassId,"A04","2023-1-11",1),
(ClassId,"A05","2023-2-15",1),
(ClassId,"A06","2023-2-20",1)
;
create table student(
studentid int auto_increment primary key ,
studentname varchar(100),
address varchar(100),
phone varchar(20),
sex bit,
ClassId int,
foreign key(ClassId) references Class(ClassId)
);

insert into student value
(1,"Quan","Quang Nam","1111111",1,1),
(2,"Hung","Quang Nam","22222",1,1),
(3,"Nhung","Hue","33333",0,2),
(4,"Ngan","Quang Tri","44444",0,3);
insert into student value
(null,"Hong","Ha Noi","555555",0,2);


create table subjectt(
subid varchar(100) primary key,
subname varchar(100),
credit int(10),
statusSub bit
);

insert into subjectt value
('TDTC3',"The duc the chat 3",1,1),
('KTCT-MLN','Kinh te chinh tri - MacLenin',3,1),
('PTDL','Phan tich du lieu',3,1),
('HS','Hoc sau',3,1);

create table mark(
markId int primary key auto_increment,
subid varchar(100),
studentid int,
mark double,
examtime int,
foreign key(subid)references subjectt(subid),
foreign key(studentid) references student(studentid)
);

insert into mark value
(1,'HS',1,8.5,1);
insert into mark value
(2,"PTDL",2,6,1),
(3,"TDTC",3,10,1);

-- hien thi cac sinh vien co ten bat dau bang chu h, 
select * from student 
where left(studentname,1) = "h";

-- hien thi thong tin cac lop hoc co thoi gian bat dau vao thang 12

-- hien thi thong tin cac mon hoc co credit tu 2-3
select * from subjectt 
where credit between 2 and 3;

-- thay doi ma lop cua sinh vien co ten hung la 2

update student set classid = 2 where studentname = "Hung" ;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.

select student.studentname as studentname, subjectt.subname as subname, mark.mark as mark
from student
join mark on student.studentid = mark.studentid
join subjectt on subjectt.subid = mark.subid
order by mark.mark desc, student.studentname asc;













