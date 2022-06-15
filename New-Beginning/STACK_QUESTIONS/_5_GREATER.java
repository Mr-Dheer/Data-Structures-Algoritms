package STACK_QUESTIONS;

import java.util.Stack;

public class _5_GREATER {
    public static void main(String[] args) {


        _5_GREATER obj = new _5_GREATER();

        obj.push(15);
        obj.push(10);
        obj.push(18);
        obj.push(12);
        obj.push(4);
        obj.push(6);
        obj.push(2);
        obj.push(8);

        obj.greater();


    }

    Stack<Integer> newstack = new Stack<>();
    int[] stack = new int[8];
    int TOP = -1;
    int count = 0;


    public void push(int data) {

        if (TOP == 8) {
            System.out.println("The Stack is Full");
        } else {

            TOP++;
            stack[TOP] = data;
        }
    }


    public void greater() {


        int var = 0;

        for (int i = 0; i < 8; i++) {

            if (i == 0) {

                newstack.push(-1);
                i++;

            }

            for (int j = i - 1; j >= 0; j--) {


                if (stack[j] > stack[i]) {

                    newstack.push(stack[j]);
                    count++;
                    break;
                }

            }

            if (count == 0) {

                newstack.push(-1);
            }
            count = 0;


        }
        System.out.println(newstack);


    }
}



