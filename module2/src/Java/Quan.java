package Java;

public class Quan extends SinhVien{
    private String  masv = "20IT951";
    private String tensv = "quan";
    private String nganh = "CNTT";

    public Quan(int id, String tenTruong, int khoa, String masv, String tensv, String nganh) {
        super(id, tenTruong, khoa);
        this.masv = masv;
        this.tensv = tensv;
        this.nganh = nganh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public void say(){
        System.out.println("HELO JAVA");
    }
    public void eat(){
        System.out.println("MAM MAM");
    }
    public void learn(){
        System.out.println("HOC JAVA");
    }

    @Override
    public String toString() {
        return "Quan{" +
                super.toString() +
                "masv='" + masv + '\'' +
                ", tensv='" + tensv + '\'' +
                ", nganh='" + nganh + '\'' +
//                ", masv=" +  getMasv() +'\'' +
//                ", tensv=" + getTensv() + '\'' +
//                ", nganh =" + getNganh() + '\'' +

                '}';
    }
}
