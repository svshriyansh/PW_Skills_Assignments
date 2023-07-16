// Q3.Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
package Hashing.Ass1;

import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                flag = 1;
                break;
            } else {
                map.put(arr[i], i);
            }
        }

        if (flag == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        sc.close();

    }
}
