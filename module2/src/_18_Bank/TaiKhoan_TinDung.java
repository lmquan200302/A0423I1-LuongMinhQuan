package _18_Bank;

public class TaiKhoan_TinDung extends TaiKhoan {

    private int sothe;
    private String mapin;

    public TaiKhoan_TinDung(String name, String birthday, double surplus, String branch, int sothe, String mapin) {
        super(name, birthday, surplus, branch);
        this.sothe = sothe;
        this.mapin = mapin;

    }

    public int getSothe() {
        return sothe;
    }

    public void setSothe(int sothe) {
        this.sothe = sothe;
    }

    public String getMapin() {
        return mapin;
    }

    public void setMapin(String mapin) {
        this.mapin = mapin;
    }
    public String getFileLine(){
        return getId() + "," + getName() + "," + getBirthday() + "," + getSurplus() + "," + getBranch() + "," + sothe + "," + mapin + "\n";
    }


    @Override
    public String toString() {
        return "TaiKhoan_TinDung{" +
                "ID=" + getId() +
                ", Name='" + getName() + '\'' +
                ", Birthday='" + getBirthday() + '\'' +
                ", Surplus=" + getSurplus() +
                ", Branch='" + getBranch() + '\'' +
                "sothe=" + sothe +
                ", mapin='" + mapin + '\'' +
                '}';
    }
}
