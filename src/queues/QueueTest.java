package queues;

import queues.queue.Queue;

public class QueueTest {


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(1);

        System.out.println("queue.isEmpty()=" + queue.isEmpty());
        System.out.println("queue.peek()=" + queue.peek());
        System.out.println("queue.remove()=" + queue.remove());
        System.out.println("queue.remove()=" + queue.remove());
        System.out.println("queue.remove()=" + queue.remove());
    }
}
