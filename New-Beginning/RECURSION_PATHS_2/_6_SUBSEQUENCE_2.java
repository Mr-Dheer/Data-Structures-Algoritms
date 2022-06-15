package RECURSION_PATHS_2;

public class _6_SUBSEQUENCE_2 {
    public static void main(String[] args) {

        Aura("abc","");

    }

    public static void Aura(String str,String ans){
        if (str.length() == 0) {
            System.out.print(ans+",");
            return;
        }

        char ch=str.charAt(0); //a
        String rosie=str.substring(1); //bc

        Aura(rosie,ans+ch);
        Aura(rosie,ans+"");
    }


}
