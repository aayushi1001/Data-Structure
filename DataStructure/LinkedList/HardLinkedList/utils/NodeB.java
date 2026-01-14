package DataStructure.LinkedList.HardLinkedList.utils;

public class NodeB {
    public int data;
    public NodeB next;
    public NodeB bottom;

    public NodeB(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }

    public NodeB(int data, NodeB next, NodeB bottom) {
        this.data = data;
        this.next = next;
        this.bottom = bottom;
    }
}
