package STACK_QUESTIONS;

import java.util.*;

public class _9_NEXT_GREATER_STOCK_SPAN {
    public static void main(String[] args) {

        _9_NEXT_GREATER_STOCK_SPAN obj = new _9_NEXT_GREATER_STOCK_SPAN();

        obj.greater();

    }

    int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void greater() {

        arrayList.add(-1);
        stack.push(arr[arr.length - 1]);


        for (int i = arr.length - 2; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i])

                stack.pop();

            int grt = (stack.isEmpty()) ? -1 : stack.peek();
            arrayList.add(grt);
            stack.push(arr[i]);
        }
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
