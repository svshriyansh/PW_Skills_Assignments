//Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
// of every digit in that number raised to the power of total digits in that number is equal to the number.
package Recursion;

public class ques5 {
    public static boolean armstrong(int num, int orignal, int len, int sum) {
        if (num == 0) {
            return sum == orignal;
        }
        // multiply the digit with the length of the number
        int lastdigit = num % 10;
        sum += Math.pow(lastdigit, len);
        return armstrong(num / 10, orignal, len, sum);

    }

    public static void main(String[] args) {
        int n = 134;
        boolean val = armstrong(n, n, 3, 0);
        System.out.println(val);

    }
}
