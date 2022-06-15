package QUEUE;

import java.io.Serializable;

public class _1_QUEUE_ARRAY {

    public static void main(String[] args) {

        _1_QUEUE_ARRAY obj = new _1_QUEUE_ARRAY();

        obj.enQueue(10);
        obj.enQueue(20);
        obj.enQueue(30);
        obj.enQueue(40);


        obj.deQueue();
        obj.deQueue();

        obj.enQueue(99);

//        obj.rear();

//        obj.front();

        obj.show();
    }


    int[] queue = new int[4];
    int size = 0;


    public void enQueue(int data) {

        if (size == 4)
            System.out.println("The Stack is Full");

        else {

            queue[size] = data;
            size++;
        }
    }

    public void deQueue() {

        if (size == 0)
            System.out.println("Queue is Empty");

        else {

            for (int i = 0; i < size - 1; i++) {

                queue[i] = queue[i + 1];

            }
            size--;
            queue[size] = 0;

        }
    }

    public boolean empty() {

        if (size == 0)
            return true;

        else
            return false;
    }


    public void peek() {

        System.out.println("The Total Elements are = " + size);
    }

    public void front() {

        System.out.println("The Element at the Front is = " + queue[0]);
    }

    public void rear() {

        System.out.println("The Element at the Rear is = " + queue[size - 1]);

    }


    public void show() {

        System.out.print("{");
        for (int k : queue) {

            System.out.print(k + ", ");
        }
        System.out.print("}");

    }
}
