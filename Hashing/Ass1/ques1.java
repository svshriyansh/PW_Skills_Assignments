package Hashing.Ass1;

import java.util.HashMap;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key value pair ");
        int n = sc.nextInt();
        System.out.println("Enter key value pair");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            hashmap.put(key, val);
        }
        System.out.println(hashmap);
        sc.close();
    }
}
