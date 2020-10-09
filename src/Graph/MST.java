package Graph;

import java.util.ArrayDeque;

public class MST {

    class EdgeClass implements Comparable<EdgeClass>{


        int src;
        int dest;
        int wt;

        @Override
        public int compareTo(EdgeClass compareEdge) {
            return this.wt - compareEdge.wt;
        }
    }

    static class Subset{
        int parent;
        int rank;
    }

    int v;
    int edge;
    EdgeClass[] edgeHandler;

     


    MST(int v, int e){
        v = v;
        e = e;


    }






}
