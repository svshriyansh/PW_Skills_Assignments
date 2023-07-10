//given a number ‘n’, predict whether it is a power of two or not. [medium]
package NumberSystem;

import java.util.*;

public class PowerOf2 {
    public static boolean powerOf2(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check weater its a power of 2 or not");
        int n = sc.nextInt();
        boolean val = powerOf2(n);
        System.out.println(val);
        sc.close();

    }
}
