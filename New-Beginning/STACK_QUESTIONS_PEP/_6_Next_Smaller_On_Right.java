package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

/*
PEHLE WHILE MEIN DIAGRAM BANAKER POP CONDITION SOCHO
AND AGER POP KE CONDITION SOCH LE BASS PHIR
WHILE KA LOOP KHATAM KERKE BAHAR
IF AND ELSE DHEKO
 */



public class _6_Next_Smaller_On_Right {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 11, 10, 1, 20, 7};

        int[] gre = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[arr.length - 1]);
        gre[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (stack.size() > 0 && arr[i] < stack.peek()) {

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
