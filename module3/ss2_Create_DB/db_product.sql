create database db_product;
use db_product;
create table customer(
cID int primary key,
cName varchar(100),
cAge int(100)
);

create table Oder(
oID int primary key,
cID int,
oDate date,
oTotalPrice varchar(255),
foreign key(cID) references customer(cID)
);

create table OderDetail(
oID int,
pID int,
odQTY varchar(100),
foreign key(oID) references Oder(oID),
foreign key(pID) references Product(pID)
);

create table Product(
pID int primary key,
pName varchar(100),
pPrice varchar(100)
);