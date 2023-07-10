//Q4. Given a number, count the number of set bits in that number without using an extra space.
package NumberSystem;

import java.util.Scanner;

public class SetBit {
    public static int setBit(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int val = setBit(n);
        System.out.println(val);
        sc.close();
    }
}
