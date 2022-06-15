package PRIORITY_QUEUE_QUESTIONS;

import java.util.PriorityQueue;

public class _2 {
    public static void main(String[] args) {

//   ISME HARR ARRAY KE POSITION PER JO VALUE THEE USSE
//    UPTO 2 POSITION CHANGE KER DIYA HUMNE AAGE YA PEECH
//    YEH QUESTION HAI.
        

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int var : arr) {

            pq.add(var);
        }

        int dummy = 0;
        int temp2 = 0;
        int temp = 0;


        for (int i = 0; i < arr.length; i++) {

            while (pq.size() > 0) {

                temp = pq.peek();
                pq.remove();

                if (pq.size() == 0) {
                    break;
                }

                dummy = pq.peek();
                pq.remove();


                temp2 = pq.peek();
                pq.remove();


                System.out.println(temp2 + "," + temp + ", " + dummy);
            }
        }
        System.out.print(temp);


    }
}

