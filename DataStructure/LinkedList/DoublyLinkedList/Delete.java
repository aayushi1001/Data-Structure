package DataStructure.LinkedList.DoublyLinkedList;

import DataStructure.LinkedList.DoublyLinkedList.utils.Node;

public class Delete {

    public static Node deleteElements(Node head, int pos) {
        if(pos == 1) {
            head.right.left = null;
            return head.right;
        }

        int count = 1;
        Node temp = head;

        // 10 -> 20 -> 30
        while(temp != null && count != pos) {
            temp = temp.right;
            count++;
        }

        if(temp != null) {
            temp.left.right = temp.right;
            if(temp.right != null) {
                temp.right.left = temp.left;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20, first, null);
        Node third = new Node(30,second ,null);
        second.right = third;
        first.right = second;

        Node it = deleteElements(first, 3);

        while(it != null) {
            System.out.println(it.data);
            it = it.right;
        }
    }
}
