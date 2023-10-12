-- task 9
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi
-- tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
use db_resort_furama;
select hop_dong.ngay_len_hop_dong, count(hop_dong.ma_hop_dong) as "so lan dat" from hop_dong
where year(ngay_len_hop_dong) = 2021
group by ma_hop_dong;