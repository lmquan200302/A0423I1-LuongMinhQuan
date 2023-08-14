package _03_array_method.baitap;

public class gopmang_java {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];
        int index = 0;

        for(int i=0; i<arr1.length; i++){
            arr3[index] = arr1[i];
            index++;
        }
        for(int i=0; i< arr2.length; i++){
            arr3[index] = arr2[i];
            index++;
        }

        System.out.print("Mang cua ban sau khi gop lai la: ");
        for(int i=0; i< arr3.length;i++){
            System.out.println(arr3[i] + " ");
        }
    }

}

