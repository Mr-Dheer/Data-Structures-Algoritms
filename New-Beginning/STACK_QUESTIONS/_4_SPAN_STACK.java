package STACK_QUESTIONS;

public class _4_SPAN_STACK {
    public static void main(String[] args) {

        _4_SPAN_STACK obj = new _4_SPAN_STACK();


        obj.push(15);
        obj.push(13);
        obj.push(12);
        obj.push(14);
        obj.push(16);
        obj.push(18);
        obj.push(8);


        obj.span(4);

//        obj.show();


    }


    int top = -1;
    int[] stack = new int[7];


    public void push(int data) {


        if (top == 6) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stack[top] = data;
        }
    }

    public void span(int index) {

        int count = 0;

        for (int i = 0; i <= index; i++) {

            if (stack[index] > stack[i]) {

                count++;
            } else if (i == index) {

                count++;
            }


        }
        System.out.println("The Stack Span is " + count);
    }

    public void show() {
        System.out.print("{");
        for (int n : stack) {

            System.out.print(n + ", ");

        }
        System.out.print("}");

    }
}