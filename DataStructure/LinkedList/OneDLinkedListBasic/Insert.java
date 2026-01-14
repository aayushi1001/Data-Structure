package DataStructure.LinkedList.OneDLinkedListBasic;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class Insert {
    public static Node insertElement(Node head, int pos) {
        //Node to be inserted
        Node newNode = new Node(100);

        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }

        // 10 -> 20 -> 30
        Node temp = head;
        int count = 1;
        while(temp != null) {
            if(count == pos - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            count++;
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
