package GRAPH;

import java.util.ArrayList;

public class _1_ArrayList_Implment {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int v = 5;

        for (int i = 0; i < v; i++) {

            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}



