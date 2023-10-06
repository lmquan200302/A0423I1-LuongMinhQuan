CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;
CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    Status    BIT
);
CREATE TABLE Student
(
    StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    Status      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE Subject
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);

CREATE TABLE Mark
(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);

insert into class value
(1,"A01","2022-5-1",1),
(2,"A02","2022-6-5",1),
(3,"A03","2022-7-5",1),
(4,"A04","2022-8-5",1);

insert into mark value 
(1,1,1,8,1),
(2,1,2,9,1),
(3,2,1,5,1),
(4,4,3,7,1);

insert into student value 
(1,"Quan","Quang nam","11111",1,1),
(2,"Hoai","Hue","222222",1,1),
(3,"Thuan","Dak Lak","333333",1,2),
(4,"Huy","Da Nang","44444",1,2);

insert into subject value 
(1,"SQL",3,1),
(2,"JAVA",2,1),
(3,"JAVASCRIP",2,1),
(4,"PHP",2,1);

-- hien thi sinh vien o tung noi
select studentid, studentname, address from student;

select address, count(studentid) as 'so luong hoc vien' from student group by(studentid);

-- hien thi diem trung binh cua hoc vien
select student.studentid, student.studentname , avg(mark.mark) as "Diem trung trinh mon hoc" 
from student
join mark on student.studentid = mark.studentid
group by student.studentid, student.studentname
;

-- hien thi hoc vien co diem trung binh lon hon 5
select student.studentid, student.studentname , avg(mark) as "Diem trung binh "
from student
join mark on student.studentid = mark.studentid
group by student.studentid, student.studentname
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);
;

-- hien thi mon hoc co credit lon nhat
select * from subject 
 where Credit = (select max(credit) from subject) ;

-- hien thi thong tin mon hoc co diem thi lon nhat
select subject.subid , subject.subname , mark.mark
from subject
join mark on subject.subid = mark.subid
where mark = (select max(mark) from mark);

-- hien thi sinh vien va diem trung binh moi sinh vien sap xep giam dan
select student.studentid, student.studentname, avg(mark) as Diem_tb
from student
join  mark on student.studentid = mark.studentid
group by student.studentid, student.studentname
 order by Diem_tb asc;







