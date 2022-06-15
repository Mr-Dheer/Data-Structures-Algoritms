package PRIORITY_QUEUE_QUESTIONS;

import java.util.Collections;
import java.util.PriorityQueue;

public class _3_Median_Priority_Queue {
    public static void main(String[] args) {


//        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> right = new PriorityQueue<>();
        _3_Median_Priority_Queue obj = new _3_Median_Priority_Queue();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        System.out.println(obj.median());
        System.out.println(obj.remove());
        System.out.println(obj.size());

    }

    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();

    public void add(int n) {

        if (right.size() > 0 && n > right.peek())
            right.add(n);

        else
            left.add(n);

        if (right.size() - left.size() == 2)
            left.add(right.remove());

        else if (left.size() - right.size() == 2)
            right.add(left.remove());


    }

    public int median() {

        if (this.size() == 0) {
            System.out.println("The Queue is Empty");
            return -1;
        } else if (left.size() >= right.size())
            return left.peek();

        else
            return right.peek();
    }

    public int remove() {

        if (this.size() == 0) {

            System.out.println("The Queue is Empty");
            return -1;
        } else if (left.size() >= right.size())
            return left.remove();

        else
            return right.remove();


    }

    public int size() {

        return right.size() + left.size();
    }


}
