package JAVAEXAM;

public abstract class DienThoai {
    private static int idLast = 1;
    private int id;
    private String ten;
    private double gia;
    private int soluong;
    private String nhasx;

    public DienThoai(String ten, double gia, int soluong, String nhasx) {
        this.id =  idLast;
        idLast++;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.nhasx = nhasx;
    }

    public static int getIdLast() {
        return idLast;
    }

    public static void setIdLast(int idLast) {
        DienThoai.idLast = idLast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }
    public void  myAbstgetPhone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", nhasx='" + nhasx + '\'' +
                '}';
    }
}
