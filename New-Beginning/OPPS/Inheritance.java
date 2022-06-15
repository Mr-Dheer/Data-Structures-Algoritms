package OPPS;

public class Inheritance {

    void dada_ji() {
        System.out.println("Mein hun dada ji");

    }
}
     class kiki extends Inheritance{
        void baap(){
            System.out.println("Mein hub baap");
        }

    }
     class haha extends kiki{
        void beta(){
            System.out.println("Mein hub beta");
        }

        public static void main(String[] args) {
            haha k=new haha();
            k.beta();
            k.baap();
            k.dada_ji();



        }
    }

