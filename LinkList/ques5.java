/*
 * Q5. Given t>o numbers represented by t>o lists, >rite a function that returns the sum list. The sum list is a list
representation of the addition of t>o input numbers.
 */
package LinkList;

public class ques5 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        // printList(head);
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static Node addTwoList(Node list1, Node list2) {
        Node dummyNode = new Node(0);
        Node curr = dummyNode;
        int carry = 0;
        while (list1 != null || list2 != null || carry == 1) {
            int sum = 0;
            if (list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }

            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            curr.next = newNode;
            curr = curr.next;
        }

        return dummyNode.next;
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
        ques5 list1 = new ques5();
        ques5 list2 = new ques5();

        list1.insertAtEnd(5);
        list1.insertAtEnd(6);
        list1.insertAtEnd(3);

        list2.insertAtEnd(8);
        list2.insertAtEnd(4);
        list2.insertAtEnd(2);

        list1.head = reverseList(list1.head);
        list1.Displayll();
        System.out.println("2nd list");
        list2.head = reverseList(list2.head);
        list2.Displayll();
        System.out.println("Reversed list");
        Node revAns = addTwoList(list1.head, list2.head);
        Node ans = reverseList(revAns);
        printList(ans);

    }
}
