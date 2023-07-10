//Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
package Recursion;

public class ques3 {
    public static int maxValue(int[] arr, int max, int index) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return maxValue(arr, max, index + 1);

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 13, 1, 3, 22, -51 };
        int value = maxValue(arr, arr[0], 0);
        System.out.println(value);

    }
}
