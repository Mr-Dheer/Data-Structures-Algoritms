package STACK;

import java.util.Stack;

public class PRACTICE {
    public static void main(String[] args) {

        PRACTICE obj = new PRACTICE();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
//        obj.push(50);
//
//
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.size();
//        System.out.println(obj.empty());
//        obj.show();

        System.out.println(obj.peek());


    }

    static int[] stack = new int[5];
    static int top = -1;

    public static void push(int data) {

        if (top == 4)
            System.out.println("Stack Overflow");
        else {

            top++;
            stack[top] = data;
        }
    }

    public void pop() {

        if (top == -1)
            System.out.println("Stack is Empty");
        else {

            int temp = stack[top];
            stack[top]=0;
            top--;
            System.out.println("The Element popped is " + temp);
        }
    }

    public void size() {

        top++;
        System.out.println(top);
    }

    public boolean empty() {

        if (top == 0)
            return true;
        else
            return false;
    }

    public void show() {

        for (int i = 0; i < stack.length; i++) {

            System.out.print(stack[i] + " ");

        }
    }

    public int peek(){

        return stack[top];

    }
}
