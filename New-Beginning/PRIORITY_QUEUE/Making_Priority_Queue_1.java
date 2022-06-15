package PRIORITY_QUEUE;

import org.xml.sax.helpers.ParserAdapter;

public class Making_Priority_Queue_1 {
    public static void main(String[] args) {

        /*
        AGER SABSE PEHLA ELEMENT SABSE CHOOTA HAI TOH REMOVE VALLA
        FUNCTION SABSE CHOTA TOH RETURN KER RHA HAI BUT REMOVE NAHI
        KER RHA.
        ELSE AGER SABSE CHOOTA SABSE PEHLA ELEMENT NAHI HAI TOH
        FANTASTIC WORK KER RHA HAI FUNCTION
         */


        Making_Priority_Queue_1 obj = new Making_Priority_Queue_1();


        obj.add(10);

        obj.add(20);
        obj.add(1);
        obj.add(0);

        obj.add(30);
        obj.add(40);

        obj.add(5);


        System.out.println(obj.remove());

        System.out.println(obj.size());


    }

    class node {

        int data;
        node next;
    }

    node head = null;

    public void add(int data) {

        node nn = new node();
        nn.data = data;
        nn.next = null;


        if (head == null)
            head = nn;

        else {
            node temp = head;

            while (temp.next != null) {


                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public void show() {

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public int remove() {

        int dummy = head.data;
        node temp = head;
        node temp2 = head;

        while (temp.next != null) {
            temp = temp.next;

            if (temp.data < dummy) {
                dummy = temp.data;
            }
        }
        temp = head;

        while (temp.next != null) {

            temp = temp.next;


            if (temp.data == dummy) {


                temp2.next = temp2.next.next;
                break;

            }
            temp2 = temp2.next;

        }
        return dummy;
    }

    public int size() {

        int count = 0;
        for (node temp = head; temp != null; temp = temp.next) {

            count++;
        }
        return count;

    }

    public int peek() {

        node temp = head;
        int dummy = head.data;

        while (temp.next != null) {

            temp = temp.next;

            if (temp.data < dummy) {
                dummy = temp.data;
            }
        }

        return dummy;


    }


}
