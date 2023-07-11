//Given a sorted binary array, efficiently count the total number of 1’s in it.
package LinearBinarySearch;

import java.util.Scanner;

public class ques3 {
    public static int binarySearch(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (arr.length - low);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The number of one's in the given array is/are: " + binarySearch(arr, 0, n - 1));
        sc.close();
    }
}
