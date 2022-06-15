package GENERIC_TREE;

public class Client {
    public static void main(String[] args) {

        Tree obj = new Tree();

        int[] arr = {10, 20, 40, -1, 50, -1, -1, 30};

        obj.constructor(arr);

//        Tree.display();


    }
//    public static void display(Tree.node nn) {
//
//        String str = nn.data + "->";
//        for (Tree.node child : nn.children) {
//            str += child.data + ",";
//        }
//        str += ".";
//        System.out.println(str);
//
//        for (Tree.node child : nn.children) {
//            display(child);
//        }
//    }
}
