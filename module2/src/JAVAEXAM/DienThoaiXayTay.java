package JAVAEXAM;

public class DienThoaiXayTay extends DienThoai{
    private String quocgia;
    private String trangthai;

    public DienThoaiXayTay(String ten, double gia, int soluong, String nhasx, String quocgia, String trangthai) {
        super(ten, gia, soluong, nhasx);
        this.quocgia = quocgia;
        this.trangthai = trangthai;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    public String getFileLine(){
        return getId() + "," + getTen() + "," + getGia() + "," + getSoluong() + "," + getSoluong() + "," + getNhasx() + "," + quocgia + "," + trangthai;
    }

    @Override
    public String toString() {
        return "DienThoaiXayTay{" +
                "id="+getId() + '\'' +
                ", ten=" + getTen() + '\'' +
                ", giasp=" + getGia() + '\'' +
                ", soluong=" + getSoluong() + '\'' +
                ", nha san xuat" + getNhasx() + '\'' +
                "quocgia='" + quocgia + '\'' +
                ", trangthai='" + trangthai + '\'' +
                '}';
    }
}
