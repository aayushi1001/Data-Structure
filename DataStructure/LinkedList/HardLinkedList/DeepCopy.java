package DataStructure.LinkedList.HardLinkedList;

import DataStructure.LinkedList.HardLinkedList.utils.NodeR;

public class DeepCopy {

    public NodeR copyRandomList(NodeR head) {
        if (head == null) {
            return null;
        }
        NodeR curr = head;
        NodeR ans = null;

        // Create copied NodeRs after each original NodeR
        while (curr != null) {
            NodeR newNodeR = new NodeR(curr.data);
            newNodeR.next = curr.next;
            curr.next = newNodeR;
            curr = newNodeR.next;
        }

        // Assign random NodeRs to copied NodeRs
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //Dis-integrate copied list
        curr = head;
        ans = head.next;
        while (curr.next != null) {
            NodeR next = curr.next;
            curr.next = next.next;
            curr = next;
        }
        
        return ans;
    }

    public static void main(String[] args) {

    }
    
}
