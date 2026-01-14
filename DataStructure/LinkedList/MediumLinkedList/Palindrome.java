package DataStructure.LinkedList.MediumLinkedList;

import DataStructure.LinkedList.OneDLinkedListBasic.utils.Node;

public class Palindrome {
    public Node getMiddleElement(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = getMiddleElement(head);
        Node secondHalf = reverse(middle);
        Node firstHalf = head;

        Node secondHalfCopy = secondHalf;
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverse(secondHalfCopy);

        return isPalindrome;
    }

    public static void main(String[] args) {
        
    }
}
