//Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
// number of times except one which appears an odd number of times. Find that odd appearing
package NumberSystem;

import java.util.Scanner;

public class Duplictes {
    public static int duplicates(int[] arr) {
        int xor = 0;
        for (int n : arr) {
            xor = xor ^ n;
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = duplicates(arr);
        System.out.println("Odd duplicate element is :");
        System.out.println(val);
        sc.close();
    }

}
