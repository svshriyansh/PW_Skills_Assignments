//Find the sum of the values of the array [92, 23, 15, -20, 10].
package Recursion;

public class ques4 {
    public static int canculateSum(int[] arr, int sum, int index) {
        if (index == arr.length) {
            return sum;
        }
        sum += arr[index];
        return canculateSum(arr, sum, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 92, 23, 15, -20, 10 };
        int sum = canculateSum(arr, 0, 0);
        System.out.println(sum);

    }
}
