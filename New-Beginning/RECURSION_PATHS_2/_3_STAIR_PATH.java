package RECURSION_PATHS_2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _3_STAIR_PATH {
    public static void main(String[] args) {

        System.out.println(MindSet(3));

    }

    public static ArrayList<String> MindSet(int n) {

        if (n == 0) {
            ArrayList<String> Dr = new ArrayList<>();
            Dr.add("");
            return Dr;
        } else if (n < 0) {
            ArrayList<String> Dummy = new ArrayList<>();
            return Dummy;
        }

        ArrayList<String> path1 = MindSet(n - 1);
        ArrayList<String> path2 = MindSet(n - 2);
        ArrayList<String> path3 = MindSet(n - 3);

        ArrayList<String> path = new ArrayList<>();

        for (String k : path1)
            path.add(1 + k);

        for (String k : path2)
            path.add(2 + k);

        for (String k : path3)
            path.add(3 + k);

        return path;
        

    }
}
