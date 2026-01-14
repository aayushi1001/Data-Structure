package DataStructure.LinkedList.OneDLinkedListBasic;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class Delete {

    public static Node deleteElement(Node head, int k) {
        if(k == 1) {
            return head.next;
        }
        Node temp = head;
        int pos = 1;

        while(temp != null) {
            if(pos == k-1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            pos++;
        }

        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(30);
        Node second = new Node(20, first);
        Node third = new Node(10, second);

        Node it = deleteElement(third, 1);

        while (it != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }
}
