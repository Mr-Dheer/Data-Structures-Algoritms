package LINKED_LIST;

import java.util.ArrayList;

public class linked_list {

    private class node {

        int data;
        node next;
    }

    node head = null;
    node head2 = null;

    public void addBack(int data) {

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


    public void show() {

        node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void addFront(int data) {

        node nn = new node();

        nn.data = data;
        nn.next = null;

        nn.next = head;
        head = nn;
    }

    public void insertANY(int data, int index) {

        node nn = new node();
        nn.data = data;
        nn.next = null;

        node temp = head;

        if (index == 0) {
            addFront(data);
        } else {

            for (int i = 0; i < index - 1; i++) {

                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }

    }

    public void delete(int index) {

//        using another temp is another way to delete a element

        node temp = head;
//        node temp2 = head;
//
        if (index == 0) {
            head = head.next;
        } else {


            for (int i = 0; i < index - 1; i++) {

                temp = temp.next;
            }

//        for (int i = 0; i < index; i++) {
//
//            temp2 = temp2.next;
//        }
//        temp.next = temp2.next;

            temp.next = temp.next.next;

        }
    }

    public void middle() {

        int count = 0;
        node temp;

        for (temp = head; temp != null; temp = temp.next) {

            count++;
        }
        temp = head;
        System.out.println(count);

        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void middle_2() {

        node slow = head;
        node fast = head;


        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }


    public void reverse() {


        node current = head;
        node previous = null;
        node next = null;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;

            current = next;

        }
        head = previous;

    }

    public void NthNode(int number) {
        int length = 0;
        for (node temp = head; temp != null; temp = temp.next) {
            length++;
        }
        if (number > length) {
            System.out.println("You have entered wrong number");

        } else {

            node temp = head;

            for (int i = 1; i < length + 1 - number; i++) {

                temp = temp.next;
            }
            System.out.println(temp.data);

        }

    }

    public void NthNode2(int number) {
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


    public void check() {

        node _1 = new node();
        node _2 = new node();
        node _3 = new node();
//        node _4 = new node();
//        node _5 = new node();
//        node _6 = new node();

        head2 = _1;


        _1.data = 99;

        _2.data = 88;

        _3.data = 77;

//        _4.data = 40;
//
//        _5.data = 50;
//
//        _6.data = 60;

        _1.next = _2;
        _2.next = _3;
        _3.next = null;
//        _4.next = _5;
//        _5.next = _6;
//        _6.next = _5;
    }

    public void LoopChecker() {


        node slow = head;
        node fast = head;

        while (fast != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {

                System.out.println("There is a Loop");
                break;
            } else if (fast == null) {
                System.out.println("There is no Loop");

            }

        }

    }


    public void LoopChecker_2() {

        node dummy = new node();

        node temp = head;
        node temp2 = head;

        while (temp.next != null) {


            temp = temp.next;
            temp2.next = dummy;
            temp2 = temp;

            if (temp.next == dummy) {
                System.out.println("Yes there is a loop");
                break;
            }
            if (temp.next == null) {
                System.out.println("There is No loop");
            }

        }

    }


    public void LoopChecker_3() {

        node dummy = new node();


        int count = 0;
        int var = 0;
        node temp2;
//
        for (node temp = head; temp != null; temp = temp.next.next) {

            if (temp.next.next == null) {
                System.out.println("There is No Loop");
                break;
            }

            for (temp2 = head; temp2 != temp; temp2 = temp2.next) {

                count = count + 1;

            }
            temp2 = head;

            for (int i = 1; i < count; i++) {


                if (temp == temp2) {

                    System.out.println("yes there is loop");
                    var = var + 1;
                    break;
                }
                temp2 = temp2.next;


            }
            if (var > 0) {
                break;
            }
        }
    }

    public void loopRemover() {

        int var = 0;
        int local = 0;
        node temp = head;

        for (node current = head; current != null; current = current.next.next) {

            if (current.next.next == null) {
                System.out.println("There is no loop");
                break;
            }

            for (node count = head; count != current; count = count.next) {
                var = var + 1;
            }

            for (int i = 1; i < var; i++) {

                if (temp == current) {
                    System.out.println("Loop is there");
                    System.out.println("Loop Removed");
                    current.next = null;
                    local = local + 1;
                    break;
                }
                temp = temp.next;
            }
            if (local > 0) {
                break;
            }
        }

    }

    public void loopRemover_2() {

        node slow = head;
        node fast = head;
        int count = 0;


        while (fast != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop is there ");
                count = count + 1;
                break;
            } else if (fast == null) {
                System.out.println("There is no Loop");
            }
        }

        if (count > 0) {

            node dummy = fast;
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
                dummy = dummy.next;
            }
            dummy.next = null;
            System.out.println("Loop Removed :)");

        }

    }

    public void deleteSingle() {

        node temp = head;

        temp.data = temp.next.data;
        temp.next = temp.next.next;


    }


//    public void oddEven() {
//
//        int count = 0;
//        ArrayList<Integer> arraylist = new ArrayList<>();
//
//
//
//        for (node temp = head; temp != null; temp = temp.next) {
//
//            count = count + 1;
////        }
//
//        }
//
//            for (int i = 1; i <= count; i++) {
//                node temp2=head;
//                temp2 = temp2.next;
//
//
//                if (temp2.data % 2 == 0) {
//                    arraylist.add(temp2.data);
//                } else if (temp2.data % 2 == 1) {
//                    arraylist.add(temp2.data);
//                }
//
//            }
//
////            for (int i = 1; i <= count; i++) {
////                node temp2=head;
////                temp2=temp2.next;
////
////
////                if (temp2.data % 2 == 1) {
////                    arraylist.add(temp2.data);
////                }
////
////            }
//            System.out.println(arraylist);


    public void oddEven() {
        node temp = head;
        node temp2 = head;
        ArrayList<Integer> arraylist = new ArrayList<>();

        while (temp != null) {

            if (temp.data % 2 == 0) {

                arraylist.add(temp.data);
            }
            temp = temp.next;
        }

        while (temp2 != null) {

            if (temp2.data % 2 == 1) {
                arraylist.add(temp2.data);
            }
            temp2 = temp2.next;
        }
        System.out.println(arraylist);

    }

    public void intersection() {

        node temp = head;

        node temp2 = head2;

        int count = 0;

        while (temp != null && temp2 != null) {

            if (temp.data == temp2.data) {
                System.out.println("We found the intersection");
                System.out.println(temp.data);
                count = count + 1;
                break;
            }

            temp = temp.next;
            temp2 = temp2.next;

        }
        if (count == 0) {
            System.out.println("No intersection found");
        }
    }


//    public void swap() {
//
//        node dummy = new node();
//        dummy.next = null;
//
//        node temp = head;
//
//        node temp2 = head;
//
//        while (temp != null) {
//
//            temp2 = temp2.next;
//            dummy.data = temp.data;
//            temp.data = temp2.data;
//            temp2.data = dummy.data;
//
//            temp2 = temp2.next.next;
//            temp = temp.next.next;
//        }
//    }

    public void swap() {

        node dummy = new node();
        dummy.next = null;
        node temp = head;


        while (temp.next.next != null) {

            dummy.data = temp.data;
            temp.data = temp.next.data;
            temp.next.data = dummy.data;

            temp = temp.next.next;
            if (temp.next == null) {
                break;


            } else if (temp.next.next == null) {

                dummy.data = temp.data;
                temp.data = temp.next.data;
                temp.next.data = dummy.data;
            }
        }
    }

    public void merge() {

        node temp = head;
        node star = head;
        node current = head2;
        node fish = head2;

        int count = 0;

        for (temp = head; temp != null; temp = temp.next) {

            count++;
        }
        temp = head;

        for (int i = 1; i <= count; i++) {


            if (i == 1) {

                star = star.next;
                fish = fish.next;

                head = current;
                current.next = temp;
            }

            fish.next = star.next;
            star.next = fish;

            fish = fish.next;
            star = star.next;

        }
    }
}























