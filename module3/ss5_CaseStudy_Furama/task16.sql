-- task 16 Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019
-- đến năm 2021.
USE db_resort_furama;
delete from nhan_vien
where nhan_vien.ma_nhan_vien not in (select ma_nhan_vien from hop_dong where year(hop_dong.ngay_len_hop_dong) between 2020 and 2021);

