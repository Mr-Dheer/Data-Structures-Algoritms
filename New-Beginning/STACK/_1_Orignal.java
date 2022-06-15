package STACK;

import java.util.Stack;

public class _1_Orignal {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


//        System.out.println(stack.search(10));
//
//
//
//
//        System.out.println(stack.peek());;
        System.out.println(stack.search(2));

//        if(stack.empty()==true){
//
//            System.out.println("true");
//        }
//        else {
//
//            System.out.println("False");
//        }


        System.out.println(stack);


    }
}
