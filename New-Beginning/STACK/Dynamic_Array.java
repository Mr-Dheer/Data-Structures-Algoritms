package STACK;

import javax.crypto.spec.PSource;

public class Dynamic_Array {


// THERE IS SOME LOGICAL MISTAKE WHICH I AM NOT ABLE TO UNDERSTAND
//    TRY MAKING A FRESH DYNAMIC ARRAY
//    AND THEN SEE THIS CODE


    int capacity = 4;
    int[] DynamicStack = new int[capacity];
    int top = 0;

    public void push(int data) {

        if (top == capacity) {

            expand();
        }

        DynamicStack[top] = data;
        top++;
    }

    private void expand() {


        int[] newStack = new int[2 * capacity];

        for (int i = 0; i < top; i++) {
            newStack[i] = DynamicStack[i];
        }
        DynamicStack = newStack;
        capacity = capacity * 2;

    }

    public void pop() {

        if (top <= 0) {

            System.out.println("The Stack is Empty");
        } else {

            top--;
            int data = DynamicStack[top];
            DynamicStack[top] = 0;
            System.out.println("The popped element is = " + data);
            shrink();
        }
    }

    private void shrink() {

        if (top <= capacity / 4) {

            capacity = capacity / 2;

        }
        int[] newStack = new int[capacity];

        for (int i = 0; i < top; i++) {

            newStack[i] = DynamicStack[i];
        }
        DynamicStack = newStack;
    }

    public void size() {

        System.out.println("The total elements in Stack are = " + top);
    }

    public void peek() {

        top--;
        System.out.println("The element at the top is =" + DynamicStack[top]);
    }

    public void empty() {

        if (top <= 0) {

            System.out.println("Stack is Empty");
        } else {

            System.out.println("Stack is not Empty");
        }
    }

    public void show() {

        System.out.print("{");
        for (int n : DynamicStack) {


            System.out.print(n + " ,");
        }
        System.out.println("}");
    }

}
