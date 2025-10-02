package DataStructure.OneDLinkedListBasic;

import DataStructure.OneDLinkedListBasic.utils.Node;

public class Insert {
    public static Node insertElement(Node head, int k) {
        //Node to be inserted
        Node newNode = new Node(100);
        if(k == 1) {
            newNode.next = head;
            return newNode;
        }

        int pos = 1;
        Node temp = head;
        while(temp != null) {
            if(pos == k) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            pos++;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(30);
        Node second = new Node(20, first);
        Node third = new Node(10, second);

        Node it = insertElement(third, 4);

        while (it != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }
}
