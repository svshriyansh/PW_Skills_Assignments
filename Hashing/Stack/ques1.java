/*Q1. Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and
return its area.*/
package Hashing.Stack;

import java.util.*;

public class ques1 {

    public static int largestRectange(char[][] arr) {
        int maxArea = 0;
        int[] col = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                col[j] = Character.getNumericValue(arr[i][j]) == 1 ? col[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, maxAreaInHistogram(col));
        }
        return maxArea;
    }

    public static int maxAreaInHistogram(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        int[] previousMin = new int[arr.length];
        int[] nextMin = new int[arr.length];
        int width = 0;
        for (int i = 0; i < arr.length; i++) {
            // inserting integer in the stack
            if (stack.isEmpty()) {
                previousMin[i] = -1;
                stack.push(i);
            } else {
                while (!stack.isEmpty()) {
                    if (arr[stack.peek()] < arr[i]) {
                        previousMin[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                        previousMin[i] = -1;
                    }
                }
            }
            stack.push(i);

        }
        while (!stack.isEmpty()) {
            stack.pop();
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (stack.isEmpty()) {
                nextMin[j] = arr.length;
            } else {
                while (!stack.isEmpty()) {
                    if (arr[stack.peek()] < arr[j]) {
                        nextMin[j] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                        nextMin[j] = arr.length;
                    }
                }
            }
            stack.push(j);
        }
        for (int i = 0; i < arr.length; i++) {
            width = (nextMin[i] - previousMin[i]) - 1;
            area = Math.max(area, width * arr[i]);
        }
        System.out.println("Area is " + area);
        return area;
    }

    public static void main(String[] args) {
        char[][] arr = {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' }
        };
        System.out.println("The max area is " + largestRectange(arr));
    }
}
