package DataStructure.LinkedList.MediumLinkedList;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class AddOne {

    //  4 -> 5 -> 5 : 4 -> 5 -> 6
    //  9 -> 9 -> 9 : 1 -> 0 -> 0 -> 0

    public static int addOneUtil(Node head) {
        if(head == null) {
            return 1;
        }

        int carry = addOneUtil(head.next);
        int sum = carry + head.data;
        head.data = sum%10;
        return sum/10;
    }

    public static Node addOne(Node head) {
        int carry = addOneUtil(head);

        if(carry != 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
