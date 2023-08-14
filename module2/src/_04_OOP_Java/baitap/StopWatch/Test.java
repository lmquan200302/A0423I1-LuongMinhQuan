package _04_OOP_Java.baitap.StopWatch;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);
        Watch stopWatch = new Watch();

        // Start measuring time
        stopWatch.start();

        // Call the selection sort algorithm
        selectionSort(arr);

        // Stop measuring time
        stopWatch.stop();

        System.out.println("Elapsed time for sorting 100,000 numbers: " + stopWatch.getElapsedTime() + " milliseconds.");
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // Generate random numbers between 0 and 999
        }
        return arr;
    }
}
