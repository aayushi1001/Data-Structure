package DataStructure.LinkedList.MediumLinkedList;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class Reverse {

    // Recursive - second
    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node revHead = reverseList(head.next); // Get to the last and keep returning that
        head.next.next = head; // right's next as curr
        head.next = null; // break the old bond, cycle
        return revHead;
    }

    // Recursive - first
    public static Node reverseElements(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node next = head.next;
        head.next = null;

        Node reversedHead = reverseElements(next);
        // If we replace above, we won't be able to traverse forward.
        // So, we go to the last and keep returning that (that's the goal of this method!)
        // As we traverse backwards, we keep assigning the current node into the right node's next
        next.next = head;
        return reversedHead; // the method should return the head of the reversed list
    }

    // Iterative to understand intuition
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // the method should return the head of the reversed list
    }

    public static void main(String[] args) {
        Node first = new Node(30);
        Node second = new Node(20, first);
        Node third = new Node(10, second);

        Node it = reverse(third);

        while (it != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }
}
