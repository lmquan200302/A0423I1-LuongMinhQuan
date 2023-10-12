-- task 8
-- Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu
-- ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.

-- cach 1
SELECT DISTINCT ho_ten
FROM khach_hang;

-- cach 2
select ho_ten from khach_hang group by ho_ten;

