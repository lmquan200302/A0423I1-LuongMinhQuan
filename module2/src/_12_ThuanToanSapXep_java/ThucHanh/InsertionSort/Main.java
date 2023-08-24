package _12_ThuanToanSapXep_java.ThucHanh.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,1,3,2,5,7,6,10,8,9};
        insertionSort(array);
        System.out.println("Mang sau khi duoc sap xep la: ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }

    }

    public static void insertionSort(int[] array){
        int temp,x;
        for( int i=1; i<array.length; i++)
        //so sanh tu vi tri array[1] voi array[0]
        {
            x = array[i];
            temp = i;
            while(temp > 0 && x<array[temp-1]){
                array[temp] = array[temp-1]; //swap
                temp--;
            }
            array[temp] = x;


        }
    }

}
