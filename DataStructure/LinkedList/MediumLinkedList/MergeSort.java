package DataStructure.LinkedList.MediumLinkedList;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class MergeSort {
    public Node merge(Node left, Node right) {
        Node dummy = new Node();
        Node dummyHead = dummy;

        while(left != null && right != null) {
            if(left.data <= right.data) {
                dummy.next = left;
                left = left.next;
            } else {
                dummy.next = right;
                right = right.next;
            }

            dummy = dummy.next;
        }

        if(left != null) {
            dummy.next = left;
        }

        if(right != null) {
            dummy.next = right;
        }

        return dummyHead.next;
    }

    public Node getMiddleElement(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;  // TO-SEE

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node middle = getMiddleElement(head);
        Node right = middle.next;
        Node left = head;
        middle.next = null;

        // The goal of this method is to return the sorted list
        // We got the sorted left and sorted right
        // Now, we will merge them in sorted order

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }
}
