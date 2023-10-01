package _18_Bank;

public class TaiKhoan_TietKiem extends TaiKhoan{

    private int stk;
    private String status;

    public TaiKhoan_TietKiem(String name, String birthday, double surplus, String branch, int stk, String status) {
        super(name, birthday, surplus, branch);
        this.stk = stk;
        this.status = status;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getFileLine(){
        return getId() + "," + getName() + "," + getBirthday() + "," + getSurplus() + "," + getBranch() + "," + stk + "," +status + "\n";
    }

    @Override

    public String toString() {
        return "TaiKhoan_TietKiem{" +
                "ID=" + getId() +
                ", Name='" + getName() + '\'' +
                ", Birthday='" + getBirthday() + '\'' +
                ", Surplus=" + getSurplus() +
                ", Branch='" + getBranch() + '\'' +
                ", STK=" + stk +
                ", Status='" + status + '\'' +
                '}';
    }

}
