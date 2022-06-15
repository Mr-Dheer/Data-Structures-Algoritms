package ARRAY_2_D_QUESTIONS;

public class _3_Spiral_Traversal {
    public static void main(String[] args) {

        int [][] arr={
                       {10,20,30,40,50},
                       {60,70,80,90,100},
                       {110,120,130,140,150},
                       {160,170,180,190,200}
        };

        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;

        while (true){

//            LEFT WALL

            for (int i = minR,j=minC; i <=maxR ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            minC++;

//            BOTTOM WALL

            for (int i = maxR,j=minC; j <=maxC ; j++) {
                System.out.println(arr[i][j]);
            }
            maxR--;

//            RIGHT WALL

            for (int i = maxR,j=maxC; j >=maxC ; j--) {
                
            }

        }



    }
}
