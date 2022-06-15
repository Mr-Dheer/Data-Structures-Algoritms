package STACK_QUESTIONS_PEP;

import java.util.Stack;

public class _18_Prefix_Evaluation_And_Conversion {
    public static void main(String[] args) {

        String str = "-+2/*6483";

        Stack<Integer> values = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

//               FOR VALUES
                char ops = ch;
                int v1_values = values.pop();
                int v2_values = values.pop();

                int values_answer = operations(v1_values, v2_values, ops);

                values.push(values_answer);

//                FOR INFIX

                String v1_infix = infix.pop();
                String v2_infix = infix.pop();

                String infix_answer = '(' + v1_infix + ch + v2_infix + ')';

                infix.push(infix_answer);

//                FOR POSTFIX

                String v1_postfix = postfix.pop();
                String v2_postfix = postfix.pop();

                String postfix_answer = v1_postfix + v2_postfix + ch;

                postfix.push(postfix_answer);

            } else {

                values.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch + "");
            }

        }

        System.out.println(values);
        System.out.println(infix);
        System.out.println(postfix);


    }

    public static int operations(int v1, int v2, char oprator) {

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
