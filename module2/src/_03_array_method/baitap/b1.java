package _03_array_method.baitap;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int socanxoa = scanner.nextInt();
        int vitricanxoa = timvitri(array,socanxoa);
        if(vitricanxoa == -1){
            System.out.println("Phan tu khong co trong mang");
        }
        else{
            array = xoaphantu(array,vitricanxoa);
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
    static int timvitri(int[] array, int phantu){
        int vitri = -1;
        for(int i=0; i<array.length; i++){

            if(array[i] == phantu){
                vitri = i;
                break;
            }
        }
        return vitri;
    }
    static int[] xoaphantu(int[] array, int vitri){
        int[] daysomoi = new int[array.length-1];
        for(int i=0; i<vitri; i++){
            daysomoi[i] = array[i];
        }
        for(int i=vitri+1; i<array.length; i++){
            daysomoi[i-1] = array[i];
        }
        return daysomoi;
    }
}
