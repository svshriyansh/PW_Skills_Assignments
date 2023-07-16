//Q5. Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
// letters from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.
package Hashing.Ass1;

import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> ransomNote = new HashMap<>();
        HashMap<Character, Integer> magazine = new HashMap<>();
        System.out.println("Enter thr string");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (ransomNote.containsKey(key)) {
                ransomNote.put(key, ransomNote.get(key) + 1);
            } else {
                ransomNote.put(key, 1);
            }
        }

        System.out.println("Enter thr string");
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (magazine.containsKey(key)) {
                magazine.put(key, magazine.get(key) + 1);
            } else {
                magazine.put(key, 1);
            }
        }
        int flag = 0;
        for (Map.Entry<Character, Integer> e : magazine.entrySet()) {
            if (ransomNote.containsKey(e.getKey())) {
                if (e.getValue() != ransomNote.get(e.getKey())) {
                    flag = 1;
                    System.out.println("Flase");
                    break;
                }
            } else {
                flag = 1;
                System.out.println("Flase");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("True");
        }
    }
}
