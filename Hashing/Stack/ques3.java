/*
 * Q3. You are keeping the scores for a baseball game with strange rules. At the beginning of the
game, you start with an empty record.
An integer x. -> Record a new score of x.
'+'. -> Record a new score that is the sum of the previous two scores.
'D'. -> Record a new score that is the double of the previous score.
'C'. -> Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.
 */
package Hashing.Stack;

import java.util.Stack;

public class ques3 {

    public static void main(String[] args) {
        String[] operations = { "1", "C" };
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int sum = temp1 + temp2;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(sum);
            } else if (operations[i].equals("D")) {
                int temp1 = stack.peek();
                stack.push(2 * temp1);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                int temp = Integer.parseInt(operations[i]);
                stack.push(temp);
            }
        }
        while (!stack.empty()) {
            ans += stack.pop();
        }
        System.out.println(ans);
    }
}
