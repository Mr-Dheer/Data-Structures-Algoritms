package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _5_NextGreater_3 {
    public static void main(String[] args) {

//       SEE PEP CODING SOLUTION(ALTERNATIVE) GOOD QUESTION
//        BUT KHUD SE DRY RUN YOU WILL UNDERSTAND
//        SAARA KHEL ISMEE INDEX KE POSITION KA HAI




        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] gre = new int[arr.length];

        Stack<Integer> stk = new Stack<>();

        stk.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (stk.size() > 0 && arr[i] > arr[stk.peek()]) {

                gre[stk.peek()] = arr[i];
                stk.pop();
            }
            stk.push(i);

        }

        while (stk.size() > 0) {

            gre[stk.peek()] = -1;
            stk.pop();
        }

        System.out.println(Arrays.toString(gre));


    }
}
