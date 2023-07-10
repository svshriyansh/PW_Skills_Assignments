//Find out the number of iterations to sort the array in descending order using selection sort.
// Input Array {3,5,1,6,0}
package Searching;

public class sorting5 {
    public static int selectionSort(int[] arr) {
        int iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = 0 + i; j < arr.length; j++) {
                if (arr[minIndex] < arr[j]) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                    iterations += 1;
                }
            }
        }
        return iterations;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        int iterations = selectionSort(arr);
        System.out.println(iterations);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
