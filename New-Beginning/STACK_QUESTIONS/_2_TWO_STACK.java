package STACK_QUESTIONS;

public class _2_TWO_STACK {
    public static void main(String[] args) {

        _2_TWO_STACK obj = new _2_TWO_STACK();

        obj.push_1(10);
        obj.push_1(20);
        obj.push_1(30);
//        obj.push_1(40);

        obj.push_2(99);
        obj.push_2(88);
        obj.push_2(77);


        obj.peek_1();
        obj.peek_2();


        obj.show();


    }

    int top = 0;
    int n = 6;
    int count = n;
    int length = n / 2;
    int var = 0;
    int TOP_2 = length;
    int[] stack = new int[n];


    int dummy = n - length;

    public void push_1(int data) {

        if (top == length) {
            System.out.println("The stack is full ");

        } else {

            stack[top] = data;
            top++;
        }
    }

    public void push_2(int data) {


        if (TOP_2 == n) {

            System.out.println("The Stack is Full");
        } else {

            stack[TOP_2] = data;
            TOP_2++;
            var++;
        }
    }

    public void pop_1() {

        if (top == 0) {

            System.out.println("The Stack is Empty Now");
        } else {

            top--;
            int data = stack[top];
            stack[top] = 0;
            System.out.println("The popped element is = " + data);

        }
    }

    public void pop_2() {

        if (count == length) {

            System.out.println("The Stack is Empty now");
        } else {

            TOP_2--;
            int data = stack[TOP_2];
            stack[TOP_2] = 0;
            var--;
            count--;
            System.out.println("The popped Element is = " + data);
        }
    }

    public void size_1() {


        System.out.println("The total elements in the Stack are= " + top);
    }

    public void size_2() {

        System.out.println("The total elements in the Stack are= " + var);

    }

    public void peek_1() {

        top--;
        System.out.println("The element at the top is = " + stack[top]);
    }

    public void peek_2() {

        TOP_2--;
        System.out.println("The element at the top is = " + stack[TOP_2]);
    }


    public void show() {

        System.out.print("{");
        for (int n : stack) {

            System.out.print(n + ", ");
        }
        System.out.print("}");

    }
}
