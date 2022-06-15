package PRIORITY_QUEUE_QUESTIONS;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1_K_Largest {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 9, 10};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number Paaji");
        int n = s.nextInt();

        for (int var : arr) {
            pq.add(var);
        }

        for (int i = 0; i < n; i++) {

            System.out.println(pq.peek());
            pq.remove();
        }


    }
}
