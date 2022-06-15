package STACK_QUESTIONS_PEP;

import javax.swing.event.InternalFrameEvent;
import java.util.Stack;

public class _17_Postfix_Evaluation_And_Conversion {
    public static void main(String[] args) {

        String str = "264*8/+3-";

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

//               FIRST FOR THE VALUE STACK
                char oprator = ch;
                int v2_value = value.pop();
                int v1_value = value.pop();

                int answer_value = operations(v1_value, v2_value, oprator);
                value.push(answer_value);

//                NOW FOR THE INFIX STACK

//                JAISE NECHE KIYA VAISE BHEE KER SAKTA
//                OR VERNA DIRECTLY CH USE KER SAKTA HUN
//                NEECHE VALE SIRF ISLEYE KIYA TAAKI
//                SAMJH MEIN AAYE BAAD MEIN BHEE
//                VERNA MEIN DIRECTLY CH USE KER SAKTA
                String oprator_infix = Character.toString(ch);

                String v2_infix = infix.pop();
                String v1_infix = infix.pop();

                String answer_infix = '(' + v1_infix + oprator_infix + v2_infix + ')';

                infix.push(answer_infix);


//               NOW FOR THE PREFIX STACK
                String oprator_postfix = Character.toString(ch);

                String v2_prefix = prefix.pop();
                String v1_prefix = prefix.pop();

                String answer_prefix = v1_prefix + v2_prefix+oprator_postfix;

                prefix.push(answer_prefix);

            } else {

                value.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");

            }

        }

        System.out.println(value);
        System.out.println(infix);
        System.out.println(prefix);


    }

    public static int operations(int v1, int v2, int oprator) {

        if (oprator == '+') {
            return v1 + v2;

        } else if (oprator == '-') {
            return v1 - v2;

        } else if (oprator == '*') {
            return v1 * v2;

        } else {
            return v1 / v2;
        }
    }
}
