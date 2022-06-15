package STACK_QUESTIONS_PEP;

import java.util.Arrays;
import java.util.Stack;

public class _13_Largest_Area_Histogram {

//    VERY GOOD AND IMPORTANT QUESTION

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};

        int[] nsr = new int[arr.length];

        int[] nsl = new int[arr.length];


//        NEXT SMALLER ELEMENT "INDEX" ON LEFT


        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        nsl[0] = -1;


        for (int i = 1; i < arr.length; i++) {

            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {

                stack.pop();
            }

            if (stack.size() == 0) {

                nsl[i] = arr.length;
            } else {

                nsl[i] = stack.peek();
            }

            stack.push(i);


        }


//        NEXT SMALLER ELEMENT "INDEX" ON RIGHT

        stack.push(arr.length - 1);

        nsr[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.size() == 0) {

                nsr[i] = arr.length;

            } else {

                nsr[i] = stack.peek();
            }

            stack.push(i);
        }


//        LARGEST AREA HISTOGRAM

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {

            int width = nsr[i] - nsl[i] - 1;
            int area = arr[i] * width;

            if (area > maxArea) {

                maxArea = area;
            }

        }

        System.out.println(maxArea);

    }
}
