package com.dailycoding;

public class Problem765 {

    private Node removeNthFromEnd(Node head, int n) {
        Node nextOfNextNode = null;
        Node previous = null;
        Node currentLoop = head;

        while (currentLoop != null) {
            if (currentLoop.next != null && currentLoop.next.val == n) {
                previous = currentLoop;
                nextOfNextNode = currentLoop.next.next;
            }
            currentLoop = currentLoop.next;
        }
        if (previous != null) {
            previous.next = nextOfNextNode;
        }
        if (previous == null && head.val == n) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n = new Node();
        Problem765 p = new Problem765();
        Node deleted = p.removeNthFromEnd(n.mockNode(), 5);
        System.out.println();
    }

}
