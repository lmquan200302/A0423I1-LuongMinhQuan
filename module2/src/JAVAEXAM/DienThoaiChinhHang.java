package JAVAEXAM;

public class DienThoaiChinhHang extends DienThoai {
    private int thoigianbh;
    private String phamvibh;

    public DienThoaiChinhHang(String ten, double gia, int soluong, String nhasx, int thoigianbh, String phamvibh) {
        super(ten, gia, soluong, nhasx);
        this.thoigianbh = thoigianbh;
        this.phamvibh = phamvibh;
    }

    public int getThoigianbh() {
        return thoigianbh;
    }

    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public String getPhamvibh() {
        return phamvibh;
    }

    public void setPhamvibh(String phamvibh) {
        this.phamvibh = phamvibh;
    }
    public String getFileLine(){
        return getId() + "," + getTen() + "," + getGia() + "," + getSoluong() + "," + getSoluong() + "," + getNhasx() + "," + thoigianbh + "," + phamvibh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" +
                 "id="+getId() + '\'' +
                ", ten=" + getTen() + '\'' +
                ", giasp=" + getGia() + '\'' +
                ", soluong=" + getSoluong() + '\'' +
                ", nha san xuat" + getNhasx() + '\'' +
                ", thoigianbh=" + thoigianbh +
                ", phamvibh='" + phamvibh + '\'' +
                '}';
    }
}
