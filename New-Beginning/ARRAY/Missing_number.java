package ARRAY;

public class Missing_number {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7};

        int xor1=arr[0];

        for (int i = 1; i <arr.length ; i++) {

            xor1=xor1^arr[i];

        }
        int xor2=1;

        for (int i = 2; i <8 ; i++) {

            xor2=xor2^i;

        }
       int temp=xor1^xor2;
        System.out.println("The missing number is = "+temp);

    }
}
