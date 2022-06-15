package STACK_QUESTIONS_PEP;

import java.util.Stack;

public class _1_Duplicate_Brackets {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String str = "((a+b)+((c+d)))";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ')') {

                if (stack.peek() == '(') {
                    System.out.println("YES THERE ARE DUPLICATE BRACKETS");
                    return;
                } else {

                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                }
                stack.pop();

            } else {
                stack.push(ch);
            }

        }

        System.out.println("NO DUPLICATES BRACKETS");

    }
}
