use db_resort_furama;
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select *  
from nhan_vien
where SUBSTRING_INDEX(nhan_vien.ho_ten,' ',-1) like '%K' or
SUBSTRING_INDEX(nhan_vien.ho_ten,' ', -1) like '%H' or 
SUBSTRING_INDEX(nhan_vien.ho_ten,' ', -1) like '%T' 

 and length(nhan_vien.ho_ten) <= 15
;



-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *
FROM nhan_vien
WHERE (SUBSTRING_INDEX(nhan_vien.ho_ten, ' ', -1) LIKE '%K' OR
       SUBSTRING_INDEX(nhan_vien.ho_ten, ' ', -1) LIKE '%H' OR
       SUBSTRING_INDEX(nhan_vien.ho_ten, ' ', -1) LIKE '%T')
  AND LENGTH(nhan_vien.ho_ten) <= 15;


