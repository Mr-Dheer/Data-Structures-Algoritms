package ARRAY_ASSIGNEMT;

public class _13 {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};

        int target=10;



        func(arr,target);
    }
    public static void func(int [] arr,int target){
        int temp;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {

                for (int k = j+1; k <arr.length ; k++) {

                    temp=arr[i]+arr[j]+arr[k];

                    if (temp == target)     {

                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }

                }

            }

        }
    }
}


