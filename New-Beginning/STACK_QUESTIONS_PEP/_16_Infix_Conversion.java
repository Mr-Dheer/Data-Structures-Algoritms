package STACK_QUESTIONS_PEP;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.Stack;

public class _16_Infix_Conversion {
    public static void main(String[] args) {

        String str = "a*(b-c+d)/e";

        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> character = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')
            ) {

//           THIS IS HOW WE CHARACTER IN STRING JUST BELOW
//           JAISE MENE DOUBLE QUOTES DIYE HAI
//           AFTER CH
                postfix.push(ch + "");
                prefix.push(ch + "");


            } else if (ch == '(') {

                character.push(ch);

            } else if (ch == ')') {

                while (character.peek() != '(') {

                    Character ops = character.pop();

//                    THIS IS FOR POSTFIX

                    String post_v2 = postfix.pop();
                    String post_v1 = postfix.pop();

//                   OVER HERE HUMNE STRING KO CONCATENATE
//
                    String answer_post = post_v1 + post_v2 + ops;

                    postfix.push(answer_post);

//                    THIS IS FOR PREFIX

                    String pre_v2 = prefix.pop();
                    String pre_v1 = prefix.pop();

                    String answer_pre = ops + pre_v1 + pre_v2;

                    prefix.push(answer_pre);
                }

                character.pop();


            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while ((character.size() > 0) &&
                        (character.peek() != '(') &&
                        (precedence(ch) <= precedence(character.peek()))
                ) {

                    char ops = character.pop();


                    String post_v2 = postfix.pop();
                    String post_v1 = postfix.pop();

                    String answer_post = post_v1 + post_v2 + ops;

                    postfix.push(answer_post);

                    String pre_v2=prefix.pop();
                    String pre_v1=prefix.pop();

                    String answer_pre=ops+pre_v1+pre_v2;

                    prefix.push(answer_pre);


                }
                character.push(ch);

            }


        }

        while (character.size()!=0){

            Character ops = character.pop();

//                    THIS IS FOR POSTFIX

            String post_v2 = postfix.pop();
            String post_v1 = postfix.pop();

//                   OVER HERE HUMNE STRING KO CONCATENATE
//
            String answer_post = post_v1 + post_v2 + ops;

            postfix.push(answer_post);

//                    THIS IS FOR PREFIX

            String pre_v2 = prefix.pop();
            String pre_v1 = prefix.pop();

            String answer_pre = ops + pre_v1 + pre_v2;

            prefix.push(answer_pre);
        }


        System.out.println(postfix);
        System.out.println(prefix);


    }

    public static int precedence(char oprator) {

        if (oprator == '+') {
            return 1;

        } else if (oprator == '-') {
            return 1;

        } else if (oprator == '*') {
            return 2;

        } else {
            return 2;
        }

    }
}
