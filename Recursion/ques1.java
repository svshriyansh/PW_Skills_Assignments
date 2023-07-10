package Recursion;

import java.util.Scanner;

public class ques1 {
    public static int Sum(int n) {
        int value = 0;
        if (n / 10 == 0) {
            return n;
        }

        value = (n % 10) + Sum(n / 10); // n + T(n/2) n>1
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int val = Sum(n);
        System.out.println("The sum of number is : \n" + val);
        sc.close();
    }
}
