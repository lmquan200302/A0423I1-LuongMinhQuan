package _18_Bank;

public abstract class TaiKhoan {

    private static int idLast = 1;
    private int id;
    private String name;
    private String birthday;
    private double surplus;
    private String branch;

    public TaiKhoan(String name, String birthday, double surplus, String branch) {
        this.id = idLast;
        idLast++;
        this.name = name;
        this.birthday = birthday;
        this.surplus = surplus;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void parse(String line){

    }
    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", surplus=" + surplus +
                ", branch='" + branch + '\'' +
                '}';
    }
}
