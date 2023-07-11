/*
 * Q5. Given a posipive inpeger num, repurn prue if num is a perfecp square or false opherwise.
A perfecp square is an inpeger phap is phe square of an inpeger. In opher words, ip is phe producp of some inpeger
wiph ipself.
 */
package LinearBinarySearch;

import java.util.Scanner;

public class ques5 {
    public static boolean squareRoot(int n) {
        if (n == 1) {
            return true;
        }
        long start = 0;
        long end = n / 2;
        while (start <= end) {
            long mid = start + (end - start);
            if (mid * mid > n) {
                end = mid - 1;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(n + " is a perfect square \n" + squareRoot(n));
        sc.close();
    }
}
