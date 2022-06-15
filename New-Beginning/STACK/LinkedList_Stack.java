package STACK;

public class LinkedList_Stack {

    class node {

        int data;
        node next;

    }

    node head = null;

    public void push(int data) {

        node nn = new node();
        nn.data = data;
        nn.next = null;


        if (head == null) {
            head = nn;
        } else {

            node temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public void pop() throws Exception {

        node temp = head;
        if (head == null) {

            throw new Exception("The Stack is Empty");
        } else if (temp.next == null) {

            int data = temp.data;
            head = null;
            System.out.println("The Popped element is =" + data);
        } else {
            temp = head;

            while (temp.next.next != null) {

                temp = temp.next;
            }
            int data = temp.next.data;
            temp.next = null;
            System.out.println("The Popped Element is = " + data);

        }
    }


    public void empty() {

        if (head == null) {

            System.out.println("The Stack is Empty");
        } else {
            System.out.println("The Stack is not Empty");
        }
    }

    public void peek() {

        if (head == null) {

            System.out.println("The Stack is empty");

        } else {

            node temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            System.out.println("The element at Top is= " + temp.data);
        }
    }

    public void size() {

        int count = 0;
        for (node temp = head; temp != null; temp = temp.next) {
            count++;

        }
        System.out.println("The total number of elememts in Stack are= " + count);
    }

    public void show() {

        node temp = head;
        System.out.print("{");
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("}");
    }


}
