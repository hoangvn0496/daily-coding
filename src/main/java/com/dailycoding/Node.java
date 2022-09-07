package com.dailycoding;

public class Node {

    int val;
    Node next;
    
    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node addHead(Node head, int value) {
        Node temp, p;
        temp = new Node(value);
        if (head == null) {
            head = temp;
        } else {
            p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = temp;
        }
        return head;
    }

    public Node mockNode() {
        Node n = new Node(5);
        n.addHead(n, 4);
        n.addHead(n, 3);
        n.addHead(n, 7);
        n.addHead(n, 9);
        n.addHead(n, 1);
        n.addHead(n, 9);
        n.addHead(n, 3);
        n.addHead(n, 7);
        return n;
    }

}
