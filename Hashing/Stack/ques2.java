/*
 * Q2. Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string],
where the encoded_string inside the square brackets is being repeated exactly k times. Note
that k is guaranteed to be a positive integer.
 */
package Hashing.Stack;

import java.util.*;

public class ques2 {
    public static String decode(String s) {
        String ans = "", temp = "";
        Stack<Character> Charstack = new Stack<>();
        Stack<Integer> IntStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (Character.isDigit(s.charAt(i))) {
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;// for getting back to the last integer digit and iterate from for loop;
                IntStack.push(count);
            } else if (s.charAt(i) == ']') {
                temp = "";
                count = 0;
                if (!IntStack.isEmpty()) {
                    count = IntStack.peek();
                    IntStack.pop();
                }
                while (!Charstack.isEmpty() && Charstack.peek() != '[') {
                    temp = Charstack.peek() + temp;
                    Charstack.pop();
                }
                if (!Charstack.isEmpty() && Charstack.peek() == '[')
                    Charstack.pop();

                for (int j = 0; j < count; j++) {
                    ans = ans + temp;
                }

                for (int j = 0; j < ans.length(); j++) {
                    Charstack.push(ans.charAt(j));
                }
                System.out.println("ans is -->" + ans);
                ans = "";
            } else if (s.charAt(i) == '[') {
                // for checking the nested character
                if (Character.isDigit(s.charAt(i - 1))) { // -1 because number is present before [
                    Charstack.push(s.charAt(i));
                } else {
                    Charstack.push(s.charAt(i));
                    IntStack.push(1);
                }
            } else {
                Charstack.push(s.charAt(i));
            }
        }
        while (!Charstack.isEmpty()) {
            ans = Charstack.peek() + ans;
            Charstack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String st = decode("3[a]2[bc]");
        System.out.println("Val is " + st);
    }
}
