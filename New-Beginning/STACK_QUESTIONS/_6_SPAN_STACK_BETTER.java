package STACK_QUESTIONS;

import java.util.Stack;

public class _6_SPAN_STACK_BETTER {

    public static void main(String[] args) {

        _6_SPAN_STACK_BETTER obj = new _6_SPAN_STACK_BETTER();

        obj.span();

    }

    Stack<Integer> stack = new Stack<>();
    int[] arr = {15, 13, 12, 14, 16, 8, 6, 4, 10, 30};


    public void span() {


        System.out.print("1, ");
        stack.push(0);

        for (int i = 1; i <= 9; i++) {

            while (stack.isEmpty() == false && arr[stack.peek()] <= arr[i])
                stack.pop();


            int span = (stack.isEmpty()) ? i + 1 : i - stack.peek();
            System.out.print(span + ", ");
            stack.push(i);

        }
    }
}



