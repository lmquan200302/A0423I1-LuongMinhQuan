-- task 7
-- Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich,
-- so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại
-- dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng
-- chưa từng được khách hàng đặt phòng trong năm 2021.

use db_resort_furama;
select hop_dong.ma_dich_vu, 
dich_vu.ten_dich_vu, 
dich_vu.so_nguoi_toi_dat, 
dich_vu.phi_cho_thue,
loai_dich_vu.ten_loai_dich_vu
from hop_dong
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
where year(hop_dong.ngay_len_hop_dong) = "2020"

;
insert into hop_dong value
(9,"2020-1-1","2020-1-5",3000000,5,1,1);