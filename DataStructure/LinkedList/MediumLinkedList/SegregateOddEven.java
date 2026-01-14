package DataStructure.LinkedList.MediumLinkedList;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class SegregateOddEven {

    public Node oddEvenList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node oddHead = null;
        Node evenHead = null;
        Node curr = head;
        Node tempEvenHead = null;
        int count = 1;

        while(curr != null) {
            if(count%2 == 0) {
                if(evenHead == null) {
                    tempEvenHead = curr;
                    evenHead = curr;
                } else {
                    evenHead.next = curr;
                    evenHead = evenHead.next;
                }
            } else {
                if(oddHead == null) {
                    oddHead = curr;
                } else {
                    oddHead.next = curr;
                    oddHead = oddHead.next;
                }
            }

            curr = curr.next;
            count++;
        }

        oddHead.next = tempEvenHead;
        evenHead.next = null;
        return head;
    }
}
