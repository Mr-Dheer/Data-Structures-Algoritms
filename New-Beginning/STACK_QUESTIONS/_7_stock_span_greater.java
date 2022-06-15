package STACK_QUESTIONS;

import java.util.Stack;

public class _7_stock_span_greater {
    public static void main(String[] args) {

        _7_stock_span_greater obj = new _7_stock_span_greater();

        obj.greater();


    }

    Stack<Integer> stack = new Stack<>();
    int[] arr = {20, 30, 15, 5, 15};


    public void greater() {


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ", ");

        }
        System.out.println("");
        stack.push(arr[0]);
        System.out.print("-1, ");

        for (int i = 1; i < arr.length; i++) {

            while (stack.isEmpty() == false && stack.peek() <= arr[i])

                stack.pop();

            int grt = (stack.isEmpty()) ? -1 : stack.peek();
            System.out.print(grt + ", ");
            stack.push(arr[i]);
        }

    }
}
