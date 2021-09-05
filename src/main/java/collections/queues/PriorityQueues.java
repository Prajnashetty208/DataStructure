package collections.queues;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args){
        PriorityQueue q= new PriorityQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.offer(4));
        System.out.println(q);
        q.add(1);
        System.out.println(q);
        q.remove(2);
        System.out.println(q.peek());
        System.out.println(q);
    }

}
