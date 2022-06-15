package QUEUE;

public class _2_QUEUE_ARRAY_2 {
    public static void main(String[] args) {


        _2_QUEUE_ARRAY_2 obj = new _2_QUEUE_ARRAY_2();

//        System.out.println(obj.full());
//
//        System.out.println(obj.empty());
//
        obj.enQueue(10);
        obj.enQueue(20);
        obj.enQueue(30);
        obj.enQueue(40);

        obj.deQueue();

//        obj.show();

    }


    int cap = 4;
    int[] queue = new int[cap];
    int front = 0;
    int rear = 0;
    int size = 0;

    public boolean full() {

        return size == 4;

    }

    public boolean empty() {

        return size == 0;
    }


    public int getRear() {

        if (empty())
            return -1;

        else
            return (front + size - 1) % cap;
    }

    public int getFront() {

        if (empty())
            return -1;

        else
            return front;
    }

    public void enQueue(int data) {

        if (full())
            System.out.println("The Stack is Full");

        else {

            int rear = getRear();
            rear = (rear + 1) % cap;
            queue[rear] = data;

            size++;
        }
    }

    public void deQueue() {

        if (empty())
            System.out.println("The Stack is Empty");

        else {
            front = (front + 1) % cap;
            size--;
        }
    }


}






