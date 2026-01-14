package DataStructure.LinkedList.HardLinkedList.utils;

public class NodeR {
    public int data;
    public NodeR next;
    public NodeR random;

    public NodeR(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }

    public NodeR(int data, NodeR next, NodeR random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}
