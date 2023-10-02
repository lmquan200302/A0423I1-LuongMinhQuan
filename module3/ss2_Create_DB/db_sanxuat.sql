create database db_sanxuat;
use db_sanxuat;

create table PhieuXuat(
soPX int primary key,
NgayXuat date
);

create table ChiTiet_PhieuXuat(
DGXuat double,
SlXuat int,
soPX int,
MaVTU int,
primary key(soPX,MaVTU),
foreign key(soPX) references PhieuXuat(SoPX),
foreign key(MaVTU) references VatTu(MaVTU)
);

create table VatTu(
MaVTU int primary key,
tenVatTu varchar(100)
);

create table ChiTietPhieuNhap(
DGNhap double,
SlNhap int,
MaVTU int,
SoPN int,
primary key(MaVTU,SoPN),
foreign key(MaVTU) references VatTu(MaVTU),
foreign key(SoPN) references PhieuNhap(SoPN)
);

create table PhieuNhap(
SoPN int primary key,
NgayNhap date
);



create table ChiTiet_DonDH(
MaVTU int,
SoDH int,
primary key(MaVTU,SoDH),
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoDH) references DonDH(SoDH)
);
create table DonDH(
SoDH int primary key,
NgayDH date
);

create table NhaCC(
MaNCC int primary key,
TenNCC varchar(255),
DiaChi varchar(255),
SDT varchar(11),
SoDH int,
foreign key(SoDH) references DonDH(SoDH)
);



