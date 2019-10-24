package queues.queue;

public class Queue {

    private static class QueueNode {

        private int data;
        private QueueNode next;

        private QueueNode(int data) {
            this.data = data;
        }
    }

    private QueueNode head;
    private QueueNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        QueueNode node = new QueueNode(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public int peek() {
        return head.data;
    }
}
