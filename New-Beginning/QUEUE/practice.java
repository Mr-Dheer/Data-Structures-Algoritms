package QUEUE;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

public class practice {

    public static void main(String[] args) {

        practice obj = new practice();

        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
//        obj.add(400);



        obj.show();

    }

    int[] arr = new int[4];
    int rear = 0;
    int front = 0;
    int size = 0;

    public void add(int data) {

        if (size == 4)
            System.out.println("The Queue is Full");


        else {
            arr[rear] = data;
            rear++;
            size++;
        }
    }


    public void delete() {

        if (size == -1)
            System.out.println("The Queue is Full");

        else {
            for (int i = 0; i < size - 1; i++) {

                arr[i] = arr[i + 1];
            }
            size--;
            arr[size] = 0;

        }
    }

    public void show() {

        for (int k : arr)
            System.out.print(k + ", ");
    }


}
