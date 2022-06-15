package LINKED_LIST;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(10);


        linked_list obj = new linked_list();


        obj.addBack(10);
        obj.addBack(20);
        obj.addBack(30);
        obj.addBack(40);
        obj.addBack(50);
        obj.addBack(60);

        obj.NthNode2(3);




    }


}
