package _13_ExceptionHandling_Debug.ThucHanh.Exceptinon_HCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionHCN {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chieu dai HCN: ");
            float chieudai = scanner.nextInt();
            System.out.printf("Nhap chieu rong HCN: ");
            float chieurong = scanner.nextInt();

            ExceptionHCN.HCN hcn = new ExceptionHCN.HCN(chieudai,chieurong);
            System.out.println("Chieu dai HCN la: " + hcn.chieudai);
            System.out.println("Chieu rong HCN la: " + hcn.chieurong);
        }catch (ExceptionHCN e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println("gia tri nhap vao khong hop le");
        };



    }
}
