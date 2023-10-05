create database b2;
use b2;
create table customer(
cID int primary key auto_increment,
cName varchar(255),
cAge int
);

insert into customer value
(1,"Quan",21),
(2,"Ngo",21),
(3,"Hai",28),
(4,"Khang",18),
(5,"Dan",21);

create table odrer(
oID int auto_increment primary key,
cID int,
oDate date,
oTalPrice double,
foreign key(cId) references customer(cID)
);

insert into odrer value 
(1,1,"2006-3-21",null),
(2,2,"2006-3-23",null),
(3,1,"2006-3-16",null);

create table product(
pID int primary key auto_increment,
pName varchar(255),
pPrice int
);

insert into product value 
(1,"Iphone 15 Promax",30000),
(2,"KIA Sportage 2023", 7000000),
(3,"SH 300i ABS 2023",80000),
(4,"Mi an lien hao hao chua cay", 500),
(5,"Thuoc tang cuong sinh ly nam",1000);

create table ordertail(
oID int,
pID int,
odQTY int,
foreign key(oID) references odrer(oID),
foreign key(pID) references product(pID)
);

insert into ordertail value
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4);

-- hHiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select * from odrer;  
select * from 


-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
-- id khach hang, ten khach , id sp, name sp
select customer.cID as cID, customer.cName as cName, product.pID as pID, product.pName as pName
from customer
join odrer on customer.cid = odrer.cid
join ordertail on odrer.oid = ordertail.oid
join product on ordertail.pid = product.pid; 

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- cid , cname
select customer.cID as cID, customer.cName as cName
from customer
left join odrer on customer.cID = odrer.cid where odrer.oid is null
;
select * from odrer;
select * from customer;
select * 
from customer
left join odrer on customer.cID = odrer.cid 
;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select odrer.oid as oID, odrer.oDate as oDate, sum(product.pPrice * ordertail.odQTY) as pPrice
from odrer
join ordertail on odrer.oid = ordertail.oid
join product on ordertail.pID = product.pID
group by odrer.oID
;
select odrer.oid as oID, odrer.oDate as oDate, sum(product.pPrice * ordertail.odQTY) as pPrice
from odrer
join ordertail on odrer.oid = ordertail.oid
join product on ordertail.pID = product.pID
group by odrer.oid
;













