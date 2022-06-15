package STACK_QUESTIONS_PEP;

import java.util.Stack;

public class _15_Infix_Evaluation {
    public static void main(String[] args) {


        String str = "2+(5-3*6/2)";
        Stack<Integer> digits = new Stack<>();
        Stack<Character> character = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                character.push(ch);

            } else if (Character.isDigit(ch)) {
                digits.push(ch - '0');

            } else if (ch == ')') {

                while (character.peek() != '(') {

                    char optors = character.pop();
                    int v2 = digits.pop();
                    int v1 = digits.pop();

                    int answer = operation(v1, v2, optors);

                    digits.push(answer);

                }
                character.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (character.size() > 0 && character.peek() != '(' && precedence(ch) <= precedence(character.peek())) {

                    char optors = character.pop();
                    int v2 = digits.pop();
                    int v1 = digits.pop();

                    int answer = operation(v1, v2, optors);

                    digits.push(answer);
                }
                character.push(ch);
            }

        }

        while (character.size() != 0) {
            char optors = character.pop();
            int v2 = digits.pop();
            int v1 = digits.pop();

            int answer = operation(v1, v2, optors);

            digits.push(answer);
        }

        System.out.println(digits.peek());


    }


    public static int operation(int v1, int v2, char optor) {


        if (optor == '+') {
            return v1 + v2;

        } else if (optor == '-') {
            return v1 - v2;

        } else if (optor == '*') {
            return v1 * v2;
        }
        //        THIS IS THE DIVIDE  OPERATOR
        else {
            return v1 / v2;

        }


    }


    public static int precedence(char optor) {

        if (optor == '+') {
            return 1;

        } else if (optor == '-') {
            return 1;

        } else if (optor == '*') {
            return 2;
        }
//        THIS IS THE DIVIDE OPERATOR
        else {
            return 2;
        }
    }
}
