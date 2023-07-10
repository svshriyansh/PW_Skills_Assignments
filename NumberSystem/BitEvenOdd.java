//Use bit manipulation for checking even odd 
package NumberSystem;

import java.util.Scanner;

public class BitEvenOdd {
    public static String bitEvenOdd(int n) {
        if ((n & 1) == 1) {
            return "odd";
        }
        return "even";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        String s = bitEvenOdd(n);
        System.out.println(s);
        sc.close();

    }
}
