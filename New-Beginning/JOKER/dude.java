package JOKER;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class dude {

    public static void main(String[] args) {

        dude obj = new dude();

        obj.span();

    }

    Stack<Integer> stack = new Stack<>();
    int[] arr = {15, 13, 12, 14, 16, 8};

    public void span() {

        System.out.print("1,");
        stack.push(0);

        for (int i = 1; i <= 5; i++) {


            while (stack.isEmpty() == false && arr[stack.peek()] <= arr[i])
                stack.pop();


            if (stack.isEmpty() == true) {

                i++;
                System.out.print(i + ", ");
                stack.push(i);
            } else {

                int temp = i - stack.peek();
                System.out.print(temp + ", ");
                stack.push(temp);
            }
        }

    }
}