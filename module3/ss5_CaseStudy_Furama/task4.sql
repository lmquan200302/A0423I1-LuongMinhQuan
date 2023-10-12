use db_resort_furama;
-- task 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
-- lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
-- “Diamond”.

select khach_hang.ma_khach_hang, loai_khach.ten_loai_khach, khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as "So lan dat" from khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_khach_hang
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where loai_khach.ten_loai_khach = "platinium"
group by (hop_dong.ma_khach_hang)
order by khach_hang.ma_khach_hang desc;

