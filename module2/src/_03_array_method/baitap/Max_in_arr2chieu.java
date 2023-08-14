package _03_array_method.baitap;
public class Max_in_arr2chieu {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("mang cua ban la :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
            
        }
        System.out.println("So lon nhat trong matrix la: ");
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }

            }

        }
        System.out.println(max);
    }
}
