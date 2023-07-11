/*
 * Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
*/
package LinkList;

public class ques4 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node reverseList(Node head2) {
        Node cur = head2;
        Node prev = null;
        Node next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head2 = prev;
        System.out.println("Reversed list");
        // printing 2nd list
        Node current = head2;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        return head2;

    }

    public boolean comparator(Node head1, Node head2) {
        int flag = 0;

        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                flag = 1;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return flag == 0;
    }

    public Node middleNode() {
        Node slow = head;
        Node fast = head;
        Node prev_of_slow = null;
        Node middleNode = null;
        while (fast != null && fast.next != null) {
            prev_of_slow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev_of_slow.next = null;
        middleNode = slow;
        System.out.println("Middle node is " + middleNode.data);
        Node head2 = reverseList(middleNode);
        return head2;
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

    // Display ll
    public void Displayll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        return;
    }

    public static void main(String[] args) {
        ques4 list = new ques4();
        list.insertAtEnd(1);
        // list.insertAtEnd(2);
        // list.insertAtEnd(3);
        // list.insertAtEnd(5);
        // list.insertAtEnd(2);
        // list.insertAtEnd(1);
        System.out.println("orignal list");
        list.Displayll();
        if (list.head.next == null) {
            System.out.println("True");
        } else {

            Node head2 = list.middleNode();
            System.out.println();
            list.Displayll();
            boolean isPalindrome = list.comparator(list.head, head2);
            System.out.println(isPalindrome);
        }

    }
}
