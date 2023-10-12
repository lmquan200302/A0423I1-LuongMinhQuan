-- task 10
-- Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu
-- dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
-- ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở
-- dich_vu_di_kem).
use db_resort_furama;
select hop_dong.ma_hop_dong, hop_dong.ngay_len_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, sum(hop_dong_chi_tiet.so_luong) as "So luong dich vu di kem"
from hop_dong
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
group by ma_hop_dong;