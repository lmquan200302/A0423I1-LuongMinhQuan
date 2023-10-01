package PHONE_EXAM;

public class AuthenticPhone extends Phone{
    private int granteeByYear;
    private String granteeCode;

    public AuthenticPhone(int id, String name, Double price, String manufacture, int granteeByYear, String granteeCode) {
        super(id, name, price, manufacture);
        this.granteeByYear = granteeByYear;
        this.granteeCode = granteeCode;
    }

    public int getGranteeByYear() {
        return granteeByYear;
    }

    public void setGranteeByYear(int granteeByYear) {
        this.granteeByYear = granteeByYear;
    }

    public String getGranteeCode() {
        return granteeCode;
    }

    public void setGranteeCode(String granteeCode) {
        this.granteeCode = granteeCode;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "granteeByYear=" + granteeByYear +
                ", granteeCode='" + granteeCode + '\'' +
                "} " + super.toString();
    }

    @Override
    Phone toPhone() {
        return null;
    }
}
