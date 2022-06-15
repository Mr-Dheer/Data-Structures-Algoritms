package STACK_QUESTIONS_PEP;

import java.util.Stack;

public class _2_Balanced_Brackets {
    public static void main(String[] args) {

        String str = "[()]{}{[()()]()}";
//        String str = "[{()}]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            }

            else if (ch == ')')
            {
                if (stack.size() == 0) {
                    System.out.println("FALSE");
                    return;
                }
                if (stack.peek() != '(') {
                    System.out.println("FAlSE");
                    return;
                } else {
                    stack.pop();
                }

            }

            else if (ch == '}') {

                if (stack.size() == 0) {
                    System.out.println("FALSE");
                    return;
                } else if (stack.peek() != '{') {
                    System.out.println("FALSE");
                    return;
                } else {
                    stack.pop();
                }
            }

            else if (ch == ']') {

                if (stack.size() == 0) {
                    System.out.println("FALSE");
                    return;

                } else if (stack.peek() != '[') {
                    System.out.println("FALSE");
                    return;

                } else {
                    stack.pop();
                }
            }
        }


        if (stack.size() > 0)
            System.out.println("FALSE");

        else
            System.out.println("TRUE");
    }

}


