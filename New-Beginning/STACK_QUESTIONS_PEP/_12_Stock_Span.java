package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.Stack;

public class _12_Stock_Span {

    public static void main(String[] args) {

        int[] arr = {2, 7, 8, 99, 1, 15, 10, 5, 22};

        int[] span = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        span[0] = 1;

        stack.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {

                stack.pop();
            }

            if (stack.size() == 0) {

                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);

        }

        System.out.println(Arrays.toString(span));
    }
}
