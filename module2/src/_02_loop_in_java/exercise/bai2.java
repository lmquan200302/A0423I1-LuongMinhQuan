import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.next());
        int count = 0;
        int N = 2;

        while (count < number) {
            boolean isPrime = true;

            // Kiểm tra N có phải là số nguyên tố hay không
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu N là số nguyên tố, in ra giá trị của N và tăng giá trị count lên 1
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }

            // Tăng giá trị của N lên 1 để kiểm tra số tiếp theo
            N++;
        }
    }
}
