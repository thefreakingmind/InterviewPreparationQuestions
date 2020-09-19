package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    static class Edges{
        int from;
        int des;
        int wt;

        public Edges(int from, int des, int wt) {
            this.from = from;
            this.des = des;
            this.wt = wt;
        }

    }

    public static void main(String[] args) {
        int vertices = 7;
        List<Edges>[] graph = new ArrayList[7];
        for(int i=0; i< vertices; i++){
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edges(0,3 , 10));
        graph[0].add(new Edges(0,1 , 10));

    }
}
