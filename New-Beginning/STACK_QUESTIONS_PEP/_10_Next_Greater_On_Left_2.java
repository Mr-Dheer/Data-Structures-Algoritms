package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _10_Next_Greater_On_Left_2 {

    public static void main(String[] args) {
        int[] arr = {7, 8, 11, 3, 2, 22, 9, 1, 17, 6};
        int[] gre = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {

                int dummy = stack.peek();
                gre[dummy] = arr[i];
                stack.pop();
            }

            stack.push(i);

        }

        while (stack.size() > 0) {

            int dummy = stack.peek();
            gre[dummy] = -1;
            stack.pop();
        }

        System.out.println(Arrays.toString(gre));
    }
}
