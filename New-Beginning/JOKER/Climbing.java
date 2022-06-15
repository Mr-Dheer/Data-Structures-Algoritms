package JOKER;

public class Climbing {

    class node {
        int data;
        node next;
    }

    node head = null;

    public void push(int data) {

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

    public void pop() throws Exception {

        node temp = head;

        if (head == null) {
//            System.out.println("Stack is Empty");
            throw new Exception("Stack is Empty Paaji");
        } else if (temp.next == null) {
            head = null;

        } else {
            temp = head;

            while (temp.next.next != null) {

                temp = temp.next;
            }
            int data = temp.next.data;
            temp.next = null;
            System.out.println("The Popped Element is = " + data);

        }
    }

    public boolean empty() {

        if (head == null) {

            System.out.println("It is Khaali Peele");
            return true ;
        }
        return false;

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

        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;

    }

    public void show() {

        node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static void main(String[] args) throws Exception {

        Climbing obj=new Climbing();

//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        obj.push(40);

//        obj.pop();


//        System.out.println(obj.peek());
        System.out.println(obj.empty());
//        System.out.println(obj.size());

        obj.show();


    }
}
