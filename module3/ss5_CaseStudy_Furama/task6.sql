-- Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
-- ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng
-- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
use db_resort_furama;

insert into hop_dong value 
(6,"2021-1-12","2021-1-15",100000,3,3,2),
(7,"2021-2-20","2021-2-25",50000,2,4,3),
(8,"2021-3-1","2021-3-5",2000000,2,1,1);
select hop_dong.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.phi_cho_thue, loai_dich_vu.ten_loai_dich_vu
from hop_dong
left join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
where year(hop_dong.ngay_len_hop_dong) = "2021" and month(hop_dong.ngay_len_hop_dong) = "1" or
year(hop_dong.ngay_len_hop_dong) = "2021" and month(hop_dong.ngay_len_hop_dong) = "2" or
year(hop_dong.ngay_len_hop_dong) = "2021" and month(hop_dong.ngay_len_hop_dong) = "3	"

;

