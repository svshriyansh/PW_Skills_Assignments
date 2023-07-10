//Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
package Recursion;

import java.util.Scanner;

public class ques2 {
  public static int sumNumber(int n, int i, int sum) {
    if (i == n + 1) {
      return sum;
    }

    if (i % 2 != 0) {
      sum += i;
    } else {
      sum += (-i);
    }
    return sumNumber(n, i + 1, sum);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int sum = sumNumber(n, 1, 0);
    System.out.println(sum);
    sc.close();
  }
}
