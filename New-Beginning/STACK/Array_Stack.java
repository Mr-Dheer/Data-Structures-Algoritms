package STACK;

public class Array_Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {

        if (top == 5) {
            System.out.println("The Stack is Full");

        } else {

            stack[top] = data;
            top++;
        }
    }

    public void pop() {

        if (top == 0) {
            System.out.println("The Stack is Empty");

        } else {

            top--;
            int data = stack[top];
            stack[top] = 0;

            System.out.println("Data popped is = " + data);
        }
    }

    public void size() {

        System.out.println(top);
    }

    public void empty() {

        if (top <= 0) {

            System.out.println("The Stack is Empty");
        } else {

            System.out.println("The Stack is not Empty");
        }
    }


    public void peek() {

        int data = stack[top - 1];
        System.out.println(data);
    }


    public void show() {

        System.out.print("{");
        for (int n : stack) {
            System.out.print(n + ", ");
        }
        System.out.println("}");
    }
}
