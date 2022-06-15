package GENERIC_TREE;

import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    public static void main(String[] args) {


        int[] arr = {10, 20, 40, -1, 50, -1, -1, 30};
        Tree obj = new Tree();


        obj.constructor(arr);
        obj.size(root);


        //        obj.display(root);


    }


    //    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------
//    -------------------------------------------------------------

    private static class node {
        int data;
        ArrayList<node> children = new ArrayList<>();

    }


    static node root = null;


    public void constructor(int[] arr) {


        Stack<node> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1)
                stack.pop();

            else {

                node nn = new node();
                nn.data = arr[i];


                if (stack.size() > 0)
                    stack.peek().children.add(nn);
                else
                    root = nn;

                stack.push(nn);
            }

        }

    }

    public static void size(node nn) {
        int count=0;

        for (node child:nn.children){
            count++;
        }

        for (node child:nn.children)
            size(child);

        System.out.println(count);


    }

    public static void display(node nn) {

        String str = nn.data + "->";
        for (node child : nn.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        for (node child : nn.children) {
            display(child);
        }
    }
}
