package DataStructure.StacksAndQueues;

import java.util.*;

class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        int size = queue.size();
        queue.add(x);
        for(int i=0; i<size; ++i) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        String a = "dckmd";
        Character b = a.charAt(0);
        Stack<Integer> c = new Stack<>();
    }
}
