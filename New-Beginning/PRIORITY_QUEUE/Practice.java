package PRIORITY_QUEUE;

import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int var : pq) {

            pq.add(var);
        }

        while (pq.size() > 0) {

            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
