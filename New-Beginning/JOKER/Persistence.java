package JOKER;

public class Persistence {
    public static void main(String[] args) {

        Persistence obj=new Persistence();

        int [] arr={10,20,30,40,50};
        System.out.println(obj.Ethics(arr,99));


    }

    public int Ethics(int [] arr,int item){

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==item)
                return i;
        }

        return -1;

    }
}
