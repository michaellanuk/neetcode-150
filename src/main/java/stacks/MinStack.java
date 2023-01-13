package stacks;

public class MinStack {
    private Node head; // top of stack
    private int size;

    public MinStack() {
        this.head = null;
        this.size = 0;
    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }

        size++;
    }

    public void pop() {
        head = head.next;
        size--;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    public int size() {
        return size;
    }

    private static class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
