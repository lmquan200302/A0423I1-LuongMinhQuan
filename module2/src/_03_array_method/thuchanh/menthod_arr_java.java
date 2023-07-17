package _03_array_method.thuchanh;

public class menthod_arr_java {
    public static int sum(int n1, int n2){
        int ketqua=0;
        for(int i=n1;i<+n2;i++){
            ketqua = ketqua + i;

        }
        return ketqua;
    }
    public static void main(String[] args) {
        System.out.println("sum 1 to 10: " + sum(1,10));
        System.out.println("sum 20 to 30: " + sum(20,30));

    }
}
