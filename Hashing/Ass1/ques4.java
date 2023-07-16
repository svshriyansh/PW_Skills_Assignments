// Q4. Given an array nums of size n, return the majority element.
package Hashing.Ass1;

import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            map.put(arr[i], 1);
        }
        System.out.println("Biggest element is " + map.lastEntry().getKey());
        sc.close();
    }
}
