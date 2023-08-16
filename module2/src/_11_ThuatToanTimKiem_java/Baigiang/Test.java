package _11_ThuatToanTimKiem_java.Baigiang;

public class Test {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Vi tri phan tu ban tim la: " + TimKiemNhiPhan(array,7));


    }
    public static int TimKiemNhiPhan(int arrray[] ,int x){
        int left = 0;
        int right = arrray.length - 1; // chi dinh ve vi tri cuoi cung cua phan tu trong mang
        while (left <= right){
            int mid =  (right + left) / 2;
            if(arrray[mid] == x){
                return mid;
            } else if (arrray[mid] > x) {
                right = mid - 1;

            }else {
                left = mid + 1;
            }

        }
    return -1;
    }
}
