package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _7_Next_Smaller_On_Right_2 {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 10, 15, 1, 3, 19, 7, 66};

        int[] gre = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {

                int temp = stack.peek();
                gre[temp] = arr[i];
                stack.pop();

            }

            stack.push(i);

        }

        while (stack.size() > 0) {

            int temp = stack.peek();
            gre[temp] = -1;
            stack.pop();
        }

        System.out.println(Arrays.toString(gre));

    }
}
