-- task 13
-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các
-- Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử
-- dụng nhiều như nhau).
select dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem, dich_vu_di_kem.gia, dich_vu_di_kem.don_vi, dich_vu_di_kem.trang_thai, max(so_luong) "so luong su dung" from dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by hop_dong_chi_tiet.ma_hop_dong_chi_tiet;



