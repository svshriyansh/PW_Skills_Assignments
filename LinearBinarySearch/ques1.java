/*Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
else print “Element not found in array”. Input the size of array, array from user and the element X from user.
Use Linear Search to find the element. */
package LinearBinarySearch;

import java.util.Scanner;

public class ques1 {
    public static int LinerSearch(int[] arr, int target) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int target = sc.nextInt();
        int index = LinerSearch(arr, target);
        if (arr[index] == target)
            System.out.println("Value found at index " + index);
        else {
            System.out.println("Value not found");
        }
        sc.close();
    }
}
