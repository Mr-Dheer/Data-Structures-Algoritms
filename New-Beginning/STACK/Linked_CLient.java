package STACK;

import java.util.LinkedList;

public class Linked_CLient {
    public static void main(String[] args) throws Exception {


        LinkedList_Stack obj = new LinkedList_Stack();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        obj.pop();
//        obj.peek();

//        obj.empty();
//      /  obj.size();
        obj.show();


    }
}