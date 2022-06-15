package STACK_QUESTIONS;

public class _3_K_STACK {

// NOT ABLE TO DO

    public static void main(String[] args) {


        _3_K_STACK obj = new _3_K_STACK();

        obj.push(10, 1);
        obj.push(20, 1);
        obj.push(30, 1);

        obj.push(99,2);
        obj.push(88,2);
        obj.push(77,2);

        obj.push(111,3);
        obj.push(222,3);
        obj.push(333,3);

        obj.show();

    }

    int n = 18;
    int top = -1;
    int dummy;
    int[] stack = new int[n];

    int length = n / 3;
    int temp = length + length;

    int[] newstack = new int[length];
    int TOP_2 = length;
    int[] tempstack = new int[temp];

    int TOP_3=temp;


    public void push(int data, int sn) {

        if (sn == 1) {

            top++;
            newstack[top] = data;

            System.arraycopy(newstack, 0, stack, 0, length);


        } else if (sn == 2) {

            tempstack[TOP_2] = data;
            TOP_2++;


            for (int i = 3; i <= 5; i++) {

                stack[i] = tempstack[i];

            }
        } else {

            stack[TOP_3]=data;
            TOP_3++;

        }
    }


    private void expand_1() {


//

//        System.arraycopy(newstack,0,stack,0,length);

    }

    private void expand_2() {


    }


    public void show() {

        System.out.print("{");
        for (int t : stack) {

            System.out.print(t + ", ");
        }
        System.out.print("}");

    }
}
