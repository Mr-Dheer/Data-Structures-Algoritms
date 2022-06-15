package Assignment_2;
//        1
//        23
//        456
//        78910


public class _7 {
    public static void main(String[] args) {

        int n=4;
        int temp=0;


        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <=i ; j++) {

                temp=temp+1;
                System.out.print(temp);


            }
            System.out.println(" ");

        }
    }
}
