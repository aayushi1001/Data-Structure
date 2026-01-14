package DataStructure.LinkedList.HardLinkedList;

import DataStructure.LinkedList.HardLinkedList.utils.NodeB;

public class FlattenListWithBottom {
    public static NodeB merge(NodeB left, NodeB right) {
        NodeB dummy = new NodeB(-1);
        NodeB head = dummy;

        while(left != null && right != null) {
            if(left.data <= right.data) {
                dummy.bottom = left;
                left = left.bottom;
            } else {
                dummy.bottom = right;
                right = right.bottom;
            }
            dummy = dummy.bottom;
        }

        if(right == null) {
            while(left != null) {
                dummy.bottom = left;
                left = left.bottom;
                dummy = dummy.bottom;
            }
        }

        if(left == null) {
            while(right != null) {
                dummy.bottom = right;
                right = right.bottom;
                dummy = dummy.bottom;
            }
        }

        return head.bottom;

    }


    public static NodeB flatten(NodeB head) {
        if(head == null) {
            return head;
        }

        NodeB curr = head;
        NodeB prev = null;

        while(curr != null) {
            NodeB next = curr.next;
            prev = merge(prev, curr);
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        NodeB a = new NodeB(5);
        a.next = new NodeB(10);

        a.bottom = new NodeB(7);
        a.bottom.bottom = new NodeB(8);
        a.bottom.bottom.bottom = new NodeB(30);

        NodeB head = flatten(a);

        while (head != null) {
            System.out.println(head.data);
            head = head.bottom;
        }
    }
}
