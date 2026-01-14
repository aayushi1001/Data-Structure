package DataStructure.LinkedList.DoublyLinkedList;

import DataStructure.LinkedList.DoublyLinkedList.utils.Node;

public class Insert {

    public static Node insertElement(Node head, int pos) {
        Node newNode = new Node(100);
        if(pos == 1) {
            newNode.right = head;
            head.left = newNode;
            return newNode;
        }

        int count = 1;
        Node temp = head;
        while(temp != null) {
            if(count == pos -1) {
                newNode.right = temp.right;
                newNode.left = temp;
                temp.right = newNode;
                break;
            }

            count++;
            temp = temp.right;
        }

        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20, first, null);
        Node third = new Node(30,second ,null);
        second.right = third;
        first.right = second;

        Node it = insertElement(first, 4);

        while(it != null) {
            System.out.println(it.data);
            it = it.right;
        }
    }
}
