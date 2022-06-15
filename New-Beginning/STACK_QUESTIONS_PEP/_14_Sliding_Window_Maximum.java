package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _14_Sliding_Window_Maximum {
    public static void main(String[] args) {

        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4
                + 32, 0, 7, 19, 8, 12, 6};

        int[] window = new int[arr.length];
        int max = 0;


        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j <= i + 4; j++) {

                if (j == i + 3) {

                    Stack<Integer> stacks = new Stack<>();
                    stacks.push(i);

                    for (int k = i+1; k <= j; k++) {

                        while (stacks.size() > 0 && arr[i] > arr[stacks.peek()]) {

                            if (max < arr[i]) {
                                max = arr[i];
                            }
                            stacks.pop();
                        }

                        stacks.push(i);

                    }

                    window[i] = max;

                    while (stacks.size() > 0) {

                        stacks.pop();
                    }

                }

            }
        }


        System.out.println(Arrays.toString(window));

    }
}

