package STACK_QUESTIONS;

public class _1_TWO_STACK {

    public static void main(String[] args) {

        _1_TWO_STACK obj = new _1_TWO_STACK();

        obj.push_1(10);
        obj.push_1(20);
        obj.push_1(30);
        obj.push_2(90);
        obj.push_2(80);


        obj.size_1();
        obj.size_2();

        obj.peek_1();
        obj.peek_2();


        obj.show();

    }

    int n = 6;
    int[] stack = new int[n];
    int top = -1;
    int top2 = n;
    int count = 0;


    public void push_1(int data) {

        if (top < top2 - 1) {

            top++;
            stack[top] = data;
        }

    }

    public void push_2(int data) {

        if (top < top2 - 1) {

            top2--;
            count++;
            stack[top2] = data;
        }
    }

    public void pop_1() {

        if (top < 0) {
            System.out.println("The Stack is Empty");
        } else {


            int data = stack[top];
            stack[top] = 0;
            top--;
            System.out.println("The popped Element is = " + data);
        }
    }

    public void pop_2() {

        if (top2 == 6) {

            System.out.println("The Stack is Empty");
        } else {

            int data = stack[top2];
            stack[top2] = 0;
            top2++;
            System.out.println("The popped Element is = " + data);

        }

    }

    public void size_1() {

        top++;
        System.out.println("The total elements are = " + top);
    }

    public void size_2() {


        System.out.println("The Total Elements are = " + count);


    }

    public void peek_1() {

        System.out.println("The element at the Top is= " + stack[top - 1]);
    }

    public void peek_2() {

        System.out.println("The element at the Top is= " + stack[top2]);
    }


    public void show() {

        System.out.print("{");
        for (int n : stack) {


            System.out.print(n + ", ");
        }
        System.out.print("}");

    }
}
