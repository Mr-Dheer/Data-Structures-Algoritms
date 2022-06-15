package PRIORITY_QUEUE;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1 {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 2, 1, 88, 15, 12, 3, 99};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int var : arr) {

            pq.add(var);
        }

//     THIS IS HOW WE WILL PRINT THE ARRAYS IN SORTED ORDER
        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
