package Searching;

import java.util.*;

public class sorting1 {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
