//given a number, print its binary representation. [easy]
package NumberSystem;

import java.util.*;

public class NumToBin {
    public static ArrayList<Integer> numToBinary(int n) {
        int rem = n;
        ArrayList<Integer> val = new ArrayList<Integer>();
        while (n != 0) {
            rem %= 2;
            n /= 2;
            val.add(0, rem);
            rem = n;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        ArrayList<Integer> val = numToBinary(n);
        for (int i = 0; i < val.size(); i++) {
            System.out.print(val.get(i) + " ");
        }
        sc.close();

    }
}