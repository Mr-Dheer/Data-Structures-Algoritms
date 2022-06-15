package PRIORITY_QUEUE_QUESTIONS;

import java.util.PriorityQueue;

public class _4_K_Sorted {
    public static void main(String[] args) {

        PriorityQueue<Integer> list_1 = new PriorityQueue<>();
        PriorityQueue<Integer> list_2 = new PriorityQueue<>();
        PriorityQueue<Integer> list_3 = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        list_1.add(10);
        list_1.add(20);
        list_1.add(30);
        list_1.add(40);

        list_2.add(1);
        list_2.add(2);
        list_2.add(3);
        list_2.add(4);
        list_2.add(5);


        list_3.add(99);
        list_3.add(88);
        list_3.add(77);
        list_3.add(66);
        list_3.add(55);

        pq.add(list_1.peek());
        pq.add(list_2.peek());
        pq.add(list_3.peek());


        int temp = list_1.size() + list_2.size() + list_3.size();

        for (int i = 0; i < temp; i++) {

            System.out.print(pq.peek() + ", ");

            if (pq.peek() == list_1.peek()) {

                pq.remove();
                list_1.remove();
                if (list_1.size() > 0)
                    pq.add(list_1.peek());
            }

            else if (pq.peek() == list_2.peek()) {

                pq.remove();
                list_2.remove();
                if (list_2.size() > 0)
                    pq.add(list_2.peek());
            }

            else {

                pq.remove();
                list_3.remove();
                if (list_3.size() > 0)
                    pq.add(list_3.peek());
            }

        }


    }
}
