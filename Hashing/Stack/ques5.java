package Hashing.Stack;

import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                ans[i] = 0;
                stack.push(i);
            } else {
                while (!stack.empty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                    ans[i] = 0;
                }
                if (!stack.empty()) {
                    ans[i] = (stack.peek() - i);
                    stack.push(i);
                } else {
                    stack.push(i);
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
