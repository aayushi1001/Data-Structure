package DataStructure.LinkedList.DoublyLinkedList;

import DataStructure.LinkedList.DoublyLinkedList.utils.Node;

public class Reverse {
    public static Node reverseElements1(Node head) {
        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node next = curr.right;
            curr.right = curr.left;
            curr.left = next;

            prev = curr;
            curr = curr.left;
        }

        return prev;
    }

    public static Node reverseElements(Node head) {
        Node curr = head;
        while(curr != null) {
            Node prev = curr.left;
            curr.left = curr.right;
            curr.right = prev;

            if(curr.left == null) {
                // We need to return the last node
                // If we go to the next iteration we will have null in curr,
                // and we won't be able to traverse back

                // To improvise, we can store prev Node as well
                // Implemented above
                return curr;
            }
            curr = curr.left;
        }

        // head is at 10 and it has null in right.
        // We need to return the Node with 30 in this case.
        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20, first, null);
        Node third = new Node(30,second ,null);
        second.right = third;
        first.right = second;

        Node it = reverseElements1(first);

        while(it != null) {
            System.out.println(it.data);
            it = it.right;
        }
    }
}
