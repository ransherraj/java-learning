package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjecencyList {

    public static void solve(){
        int V, E;
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        E = in.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(V);
        for(int i = 0; i<V; i++) graph.add(new ArrayList<Integer>());

        for(int i = 0; i<E; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i<graph.size(); i++){
            int m = graph.get(i).size();
            System.out.print(i + "->");
            for(int j = 0; j<graph.get(i).size(); j++){
                String s = "->";
                if(j == graph.get(i).size()-1) s = "";
                System.out.print(graph.get(i).get(j) + s);
            }
            System.out.println();
        }

    }
}
