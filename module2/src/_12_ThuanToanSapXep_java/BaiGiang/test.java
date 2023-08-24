package _12_ThuanToanSapXep_java.BaiGiang;

public class test {
    public static void main(String[] args) {
        int[] array = { 5,1,3,7,2,9,10};
        for(int i=0; i<array.length; i++){
            for(int j = array.length; j>i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

}
