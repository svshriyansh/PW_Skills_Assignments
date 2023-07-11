//Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
package LinkList;

public class ques1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        // check if ll is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // ll is not empty
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }

    public boolean checkNum(int target) {
        Node temp = head;
        int flag = 0;
        while (temp != null) {
            if (temp.data == target) {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        return flag == 1;
    }

    public static void main(String[] args) {
        ques1 list = new ques1();
        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(11);
        list.insertAtEnd(30);
        list.insertAtEnd(10);

        int target = 13;
        boolean ans = list.checkNum(target);
        System.out.println(ans);
    }
}
