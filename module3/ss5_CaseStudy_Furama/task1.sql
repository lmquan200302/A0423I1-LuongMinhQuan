use db_resort_furama;

-- Task 1 : Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thoả mãn các yêu cầu bên dưới.
insert into nhan_vien value 
(1,"Quan","2002-3-20",1,3243412,6000000,0834401440,"quan@gmail.com","Quang Nam",1,3,1),
(2,"Khang","1999-1-1",1,4341241,5000000,0969230045,"khang@gmai.com","Da Nang",2,1,1),
(3,"Thinh","1998-5-10",1,634234,7000000,0198367927,"tinh@gmail.com","Quang Tri",3,2,1),
(4,"Hoa","2000-10-11",0,43243431,5000000,0986789276,"hoa@gmail.com","Da Nang",2,1,1),
(5,"Thuong","2002-5-22",0,12341242,8500000,0327898767,"thuong@gmail.com","Da Nang",5,3,1),
(6,"Khanh","2002-10-12",0,53454324,9000000,0986789865,"khanh@gmail.com","Quang Tri",6,3,4)
;
insert into nhan_vien value (7,"Nguyen Thi Khanh","2002-10-12",0,53454324,9000000,0986789865,"khanh@gmail.com","Quang Tri",6,3,4);

delete from nhan_vien;

insert into vi_tri value
(1,"Le tan"),
(2,"Phuc vu"),
(3,"Chuyen vien"),
(4,"Giam sat"),
(5,"Quan ly"),
(6,"Giam doc");


insert into trinh_do value
(1,"Trung cap"),
(2,"Cao Dang"),
(3,"Dai Hoc"),
(4,"Sau dai hoc");

insert into bo_phan value
(1,"Sale - Marketing"),
(2,"Hanh chinh"),
(3,"Phuc vu"),
(4,"Quan ly");

insert into khach_hang value
(1,1,"Nguyen Van A","5000-10-9",1,8136843,0967453893,"A@gmail.com","Quang Nam")
;
insert into khach_hang value 
(2,2,"Nguyen Van B","1970-9-1",1,423424,0356987109,"B@gmail.com","Da Nang"),
(3,3,"Nguyen Van C","1990-4-1",1,234327,0387491872,"C@gmail.com","Quang Tri"),
(4,4,"Nguyen Thi D","2000-1-10",0,2132143,0987654321,"D@gmail.com","Da Nang");
insert into khach_hang value 
(5,1,"Luong Minh Thanh","1990-5-5",1,123133,0978761872,"thanh@gmail.com","Da Nang"),
(6,1,"Ngo Thi Dieu","2000-3-10",0,12313,099991213,"dieu@gmail,com","Vinh");

insert into khach_hang value 
(7,1,"Luong Minh Thanh","2000-1-5",1,1765756,067127128,"thanh@gmail.com","Ha Noi"),
(8,2,"Nguyen Van A","1978-5-5",1,1312313,09788172,"a@gmail.com","TP Ho Chi Minh"),
(9,1,"Nguyen Van C","2002-10-5",1,767345,09812376578,"c@gmail.com","Da Nang");


insert into loai_khach value 
(1,"Diamond"),
(2,"Platinium"),
(3,"Gold"),
(4,"Siver"),
(5,"Member");

insert into hop_dong value 
(1,"2023-10-1","2023-10-10",5000000,1,1,1)
;

insert into loai_dich_vu value
(1,"Villa"),
(2,"House"),
(3,"Room");

insert into dich_vu value
(1,"Villa",100,5500000,5,1,1," Tieu chuan khach san 5 sao","Villa xanh sach dep",20,4),
(2,"House",50,2000000,10,2,2,"Tieu chuan nha dep ","Rat ok",null,2),
(3,"Room",20,500000,20,3,3,"Tieu chuan nha dep","Phong bay lac",null,null);


insert into kieu_thue value
(1,"Thue_Villa"),
(2,"Thue_House"),
(3,"Thue_Room");


insert into dich_vu_di_kem value 
(1,"Massage",300000,"VND","ok"),
(2,"Karaoke",200000,"VND","ok"),
(3,"Thuc an - Nuoc uong",100000,"VND","ok"),
(4,"Thue xe","1000000","VND","ok");

insert into hop_dong value
(1,"2023-5-4","2023-5-10",3000000,1,2,1),
(2,"2023-6-10","2023-6-15",2000000,2,2,2),
(3,"2023-7-10","2023-7-15",3000000,3,2,1),
(4,"2023-7-20","2023-7-25",3000000,1,3,1),
(5,"2023-7-22","2023-7-27",1500000,4,4,3);
insert into hop_dong value
(10,"2023-10-1","2023-10-10",200000,5,5,3),
(11,"2023-12-10","2023-12-15",30000,5,6,3);
insert into hop_dong value
(12,"2023-12-20","2023-12-30",5000,4,1,3);

insert into hop_dong_chi_tiet value
(1,1,null,3),
(2,2,null,1),
(3,3,2,1);

insert into hop_dong_chi_tiet value
(4,12,4,3);
insert into hop_dong_chi_tiet value
(5,12,2,1)



