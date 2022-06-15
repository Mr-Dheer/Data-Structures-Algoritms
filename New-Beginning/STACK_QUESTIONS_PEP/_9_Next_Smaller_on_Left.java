package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _9_Next_Smaller_on_Left {

    public static void main(String[] args) {

        int[] arr = {22, 4, 1, 7, 8, 11, 15, 13, 9};
        int[] gre = new int[arr.length];

        gre[0] = -1;
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            while (stack.size() > 0 && arr[i] <= stack.peek()) {

                stack.pop();
            }


            if (stack.size() == 0) {

                gre[i] = -1;
            } else {
                gre[i] = stack.peek();
            }

            stack.push(arr[i]);

        }

        System.out.println(Arrays.toString(gre));
    }
}
