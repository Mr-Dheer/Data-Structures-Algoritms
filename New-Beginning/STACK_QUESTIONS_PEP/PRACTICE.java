package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class PRACTICE {
    public static void main(String[] args) {


//        int [] arr={1,2,3,4,5,6,7};
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int [] gre=new int[arr.length];

        Stack<Integer> stack=new Stack<>();
        gre[arr.length-1]=-1;

        stack.push(arr[arr.length-1]);

        for (int i = arr.length-2; i >=0 ; i--) {

            if (stack.size() > 0 && arr[i] >= stack.peek())
                stack.pop();


            if (stack.size() == 0) {
                gre[i]=-1;
            }
            else {
                gre[i]=stack.peek();
            }
            stack.push(i);
        }


        System.out.println(Arrays.toString(gre));




                }
            }