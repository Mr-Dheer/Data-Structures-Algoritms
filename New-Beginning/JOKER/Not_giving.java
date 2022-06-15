package JOKER;

public class Not_giving {
    public static void main(String[] args) {

        int [] arr={20,20,20,10,40,50,90,80};

        int max= Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>max)
            {
                max2=max;
                max=arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2=arr[i];
            }

        }
        System.out.println("I am not giving up,I am coming back" +
                "stronger and wiser "+max2);
    }
}
