package STACK_QUESTIONS;

import java.util.Stack;

public class _12_MINIMUM_2 {
    public static void main(String[] args) {


        _12_MINIMUM_2 obj=new _12_MINIMUM_2();

        obj.minimum();

    }

    int[] arr = {1,10, 20, 5, 2, 99, 100};
    Stack<Integer> stack = new Stack<>();

    public void minimum() {

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (stack.peek() >= arr[i]) {
                stack.push(arr[i]);
            }
        }

        System.out.println(stack.peek());
    }
}
