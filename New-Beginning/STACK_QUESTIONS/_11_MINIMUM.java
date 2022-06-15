package STACK_QUESTIONS;

import java.util.Stack;

public class _11_MINIMUM {
    public static void main(String[] args) {


        _11_MINIMUM obj=new _11_MINIMUM();

        obj.minimum();


    }

    int[] arr ={1,10,2,5,30,40};
    Stack<Integer> stack=new Stack<>();


    public void minimum() {

        int min=arr[0];
        int count=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {

                if (min>arr[j]){

                    min=arr[j];
                    stack.push(min);
                    count++;
                }

            }
            break;
        }

        if (count == 0) {

            stack.push(min);
        }

        System.out.println("The Smallest Element in the Stack is =         "+stack.peek());


    }
}
