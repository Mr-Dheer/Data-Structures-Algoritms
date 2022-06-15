package STACK_QUESTIONS;

import java.util.Stack;

public class _8_next_greater {
    public static void main(String[] args) {


        _8_next_greater obj=new _8_next_greater();

        obj.greater();

    }

    int[] arr = { 10,5,4,3,2,1};
    Stack<Integer> stack = new Stack<>();

    public void greater() {

        int count = 0;




        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {


                if (arr[j] > arr[i]) {

                    System.out.print(arr[j] + ", ");
                    count++;
                    break;
                }
            }

            if (count == 0) {

                System.out.print("-1");
            }
            count = 0;

        }
    }
}
