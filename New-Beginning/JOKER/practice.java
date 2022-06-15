package JOKER;

public class practice {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {

        if (top == 5) {
            System.out.println("The Stack is Full");
        } else {

            stack[top] = data;
            top++;
        }
    }

    public void pop() {

        if (top == 0) {
            System.out.println("The Stack is Empty");
        } else {

            top--;
            int data = stack[top];
            stack[top] = 0;
            System.out.println("The popped Element is =" + data);
        }
    }

    public boolean empty() {

        if (top <= 0) {
//            System.out.println("The Stack is Empty Sir Ji");
            return true;

        } else {

//            System.out.println("The Stack is Not Empty");
            return false;

        }
    }

    public int peek() {

        int data=-1;
        if (top <= 0) {
            System.out.println("The Stack is empty");
            ;
        } else {
             data = stack[top - 1];

        }
        return data;
    }




    public void show() {

        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        practice obj = new practice();

//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        obj.push(40);

        obj.pop();

        obj.show();

        System.out.println(obj.empty());

        System.out.println(obj.peek());


    }
}
