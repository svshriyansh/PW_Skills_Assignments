//Q3. WAP to sort an array in decreasing order using insertion sort
// Input Array {3,5,1,6,0}
package Searching;

import java.util.Arrays;

public class sorting3 {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 1, 0 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
