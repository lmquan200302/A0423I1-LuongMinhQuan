package _13_ExceptionHandling_Debug.ThucHanh.Exceptinon_HCN;

public class ExceptionHCN extends Exception {
    public ExceptionHCN(String messger){
        super(messger);
        
    }

    public ExceptionHCN() {

    }


    public static class HCN{
        float chieudai,chieurong;


     public HCN(float chieudai, float chieurong) throws ExceptionHCN {
            this.chieudai = chieudai;
            this.chieurong = chieurong;
            if(chieudai < 0 || chieurong < 0){
                throw new ExceptionHCN("Chieu dai va Chieu rong cua HCN phai co gia tri duong");
            } else if (chieudai<chieurong) {
                throw new ExceptionHCN("Chieu dai phai lon hon chieu rong");

            }
        }
    }



}
