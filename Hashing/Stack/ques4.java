/*
 * Q4. We are given an array of asteroids of integers representing asteroids in a row.For each
asteroid, the absolute value represents its size, and the sign represents its direction (positive
meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will
explode. If both are the same size, both will explode. Two asteroids moving in the same direction
 */
package Hashing.Stack;

import java.util.Stack;

public class ques4 {
    public static void main(String[] args) {
        int[] asteroids = { 10, 2, -5 };
        Stack<Integer> stack = new Stack<>();

        // We are going to traverse an array
        for (int a : asteroids) {
            while (true) {
                // if stack is empty
                if (stack.size() == 0) {
                    stack.push(a);
                    break;
                } else {
                    int prev = stack.peek();

                    if (!(prev > 0 && a < 0)) {
                        stack.push(a);
                        break;
                    }
                    // assuming that both have same value
                    else if (Math.abs(prev) == Math.abs(a)) {
                        stack.pop();
                        break;
                    } else {
                        if (Math.abs(prev) < Math.abs(a)) {
                            stack.pop();
                        } else if (Math.abs(prev) > Math.abs(a)) {
                            break;
                        }

                    }
                }

            }
        }
        int[] arr = new int[stack.size()];
        int val = stack.size();
        for (int j = val - 1; j >= 0; j--) {
            arr[j] = stack.pop();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
