package STACK_QUESTIONS_PEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class _4_Next_Greater_Element_On_Right_2 {
    public static void main(String[] args) {


//       IMPORTANT REMEMBER THIS TECHNIQUE BELOW

        /*
        REMEMBER THIS SMALL TECHNIQUE THAT
        AGER SMALLER ELEMENT HAI TOH
        ARR[PEEK] YA PEEK KO POP KERNA HAI NO MATTER KONSA
        MEATHOD HAI[INDEX OR VALUE]

        AND AGER GREATEST ELEMENT HAI TOH
        HAMESHA ARR[I] KO HE POP KERNA HAI
        NO MATTER KONSA METHOD HAI

        */


        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] gre = new int[arr.length];

        Stack<Integer> stk = new Stack<>();

        gre[arr.length - 1] = -1;
        stk.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (stk.size() > 0 && arr[i] >= stk.peek()) {

                stk.pop();
            }

            if (stk.size() == 0) {
                gre[i] = -1;
            } else {
                gre[i] = stk.peek();

            }
            stk.push(arr[i]);


        }


        System.out.println(Arrays.toString(gre));


    }
}
