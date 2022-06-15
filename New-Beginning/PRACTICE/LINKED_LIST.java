package PRACTICE;

import java.util.ArrayList;

public class LINKED_LIST {

    private class node {

        int data;
        node next;
    }

    node head = null;
    node head2 = null;

    public void show() {

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public void peeche(int data) {
        node nn = new node();
        nn.data = data;
        nn.next = null;

        if (head == null) {
            head = nn;
        } else {

            node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public void aagesee(int data) {
        node nn = new node();
        nn.data = data;
        nn.next = null;

        nn.next = head;
        head = nn;
    }

    public void kahibhee(int data, int index) {

        node nn = new node();
        nn.data = data;
        nn.next = null;

        node temp = head;

        if (index == 0) {
            nn.next = head.next;
            head = nn;
        }

        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public void hatao(int index) {

        node temp = head;

        if (index == 0) {
            head = head.next;
        }

        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public void reverse() {

        node temp = head;
        node current = null;
        node previous = null;

        while (temp != null) {

            current = temp.next;
            temp.next = previous;
            previous = temp;
            temp = current;
        }
        head = previous;

    }

    public void peechanVaa(int number) {

        node temp = head;
        int count = 0;

        for (temp = head; temp != null; temp = temp.next) {
            count++;
        }

        if (number > count) {
            System.out.println("You have entered wrong number");

        } else {
            temp = head;

            for (int i = 1; i < count + 1 - number; i++) {

                temp = temp.next;

            }
            System.out.println(temp.data);
        }

    }


    public void doosra(int number) {

        node temp = head;

        for (int i = 0; i < number; i++) {

            temp = temp.next;

        }
        node temp2 = head;

        while (temp != null) {

            temp2 = temp2.next;
            temp = temp.next;
        }
        System.out.println(temp2.data);
    }

    public void golla() {

        node slow = head;
        node fast = head;
        int count = 0;

        while (fast != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                System.out.println("loop is there");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("No loop found");

        }

    }

    public void golla_2() {

        node dummy = new node();

        node temp = head;
        node temp2 = head;

        while (temp2 != null) {

            temp2 = temp2.next;
            temp.next = dummy;
            temp = temp2;

            if (temp2 == dummy) {

                System.out.println("Loop is there");
                break;

            } else if (temp2 == null) {
                System.out.println("No loop");
            }
        }
    }

    public void letsSee() {

        node temp = head;
        node current = head;
        int count = 0;
        int var = 0;

        for (temp = head; temp != null; temp = temp.next.next) {

            if (temp.next.next == null) {
                System.out.println("Golla itho nahi ho");
                break;
            }

            for (current = head; current != temp; current = current.next) {

                count = count + 1;
            }
            current = head;

            for (int i = 1; i < count; i++) {

                if (current == temp) {

                    System.out.println("Golla mil gayo");
                    var = var + 1;
                    break;
                }
                current = current.next;

            }
            if (var > 0) {
                break;
            }
        }


    }

    public void gollaHatao() {

        node temp = head;
        node current = head;
        int count = 0;
        int var = 0;

        for (temp = head; temp != null; temp = temp.next.next) {

            if (temp.next.next == null) {

                System.out.println("Golla na milo");
                break;
            }

            for (current = head; current != temp; current = current.next) {

                count++;
            }
            current = head;

            for (int i = 1; i < count; i++) {

                if (current == temp) {
                    System.out.println("Golla itho hai aur hatha bhee diyo ");
                    temp.next = null;
                    var++;
                    break;
                }
                current = current.next;

            }
            if (var > 0) {
                break;
            }

        }
    }

    public void gollaHato_2() {

        node fast = head;
        node slow = head;
        int var = 0;


        while (fast != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                System.out.println("golla mil gayo");
                var++;
                break;
            } else if (fast == null) {

                System.out.println("Golla itho nahi hoo");
            }

        }

        if (var > 0) {

            node dummy = fast;
            slow = head;

            while (slow.next != fast.next) {

                slow = slow.next;
                fast = fast.next;
                dummy = dummy.next;
            }
            dummy.next = null;

        }
    }

    public void oddEven() {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        node temp = head;

        while (temp != null) {

            if (temp.data % 2 == 0) {
                oddList.add(temp.data);
            } else {
                evenList.add(temp.data);

            }
            temp = temp.next;


        }

        System.out.print(oddList);
        System.out.println();
        System.out.print(evenList);


    }

    public void dilbagh() {

        node temp = head;
        node current = head2;
        int count = 0;

        while (temp != null && current != null) {

            if (temp.data == current.data) {

                System.out.println("Dilbagh found");
                System.out.println(temp.data);
                count++;
            }

            temp = temp.next;
            current = current.next;
        }
        if (count == 0) {
            System.out.println("No Dilbagh found");


        }
    }


    public void check() {

        node _1 = new node();
        node _2 = new node();
        node _3 = new node();
        node _4 = new node();
        node _5 = new node();
        node _6 = new node();


        head2 = _1;


        _1.data = 10;

        _2.data = 20;

        _3.data = 30;

        _4.data = 40;

        _5.data = 50;

        _6.data = 60;

        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;
        _5.next = _6;
        _6.next = null;
    }


    public void geeks() {

//        Node temp=head;
        int count = 0;


        node temp = head;
        while (temp != null && temp.next != null) {


            if (temp.next.data == 0) {

            }

            System.out.print(temp.data + " ");
            temp.next = temp.next.next;
            temp = temp.next;

//            if (temp.next==null){
//
//                System.out.print(temp.data);
//            }


        }
    }

    public void olie() {

        node temp = head;
        node current = head;


        while (current.next!=null) {

            temp = current;
//            temp = temp.next;

            while (temp.next != null) {


                if (current.data==temp.next.data) {

                    System.out.println("Found common element " + current.data);
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;



        }
    }


    public void tension(){

        node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;

        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {

                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {

                    /* sequence of steps is important here */
//                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
//                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
}


