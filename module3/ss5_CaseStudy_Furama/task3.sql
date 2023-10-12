use db_resort_furama;
-- task 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang

where dia_chi = "Da Nang" or
dia_chi = "Quang Tri" and
2023 - year(ngay_sinh) between 18 and 50;