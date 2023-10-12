-- task 15
-- Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten,
-- ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được
-- tối đa 3 hợp đồng từ năm 2020 đến 2021.

select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi
from nhan_vien
join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
where (year(hop_dong.ngay_len_hop_dong) between 2020 and 2021 or hop_dong.ma_hop_dong is null)
group by nhan_vien.ma_nhan_vien
having count(hop_dong.ma_hop_dong) <= 3 

;

