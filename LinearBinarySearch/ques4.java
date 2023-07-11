package LinearBinarySearch;

import java.util.Scanner;

public class ques4 {
    public static int firstOccurence(int[] a, int low, int high, int target) {
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                answer = mid;
                high = mid - 1;
            } else if (a[mid] > target) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static int lastOccurange(int[] a, int low, int high, int target) {
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                answer = mid;
                low = mid + 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter thr values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value to find the occurence");
        int target = sc.nextInt();
        int first = firstOccurence(arr, 0, n - 1, target);
        int last = lastOccurange(arr, 0, n - 1, target);
        if (first == last && first == (-1)) {
            System.out.println("Targeted -> " + target + " not found");
        } else {
            System.out.println("total freuency of targeted value is " + (last - first + 1) + " times");
        }
        sc.close();
    }
}
