package Graph;

import java.util.ArrayList;
import java.util.List;

public class DIjistraBasicImplementation {

    static int size = 5;
    int[] weights = new int[size];
    static List<Node>[] graph = new ArrayList[size];


    public static void main(String[] args) {
        for(int i=0; i<size; i++){
            graph[i] = new ArrayList<>();
            
        }
    }

    static class Node implements Comparable<Node>{
        int weight;
        int nodeID;

        public Node(int weight, int nodeID) {
            this.weight = weight;
            this.nodeID = nodeID;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(o.weight, weight);
        }
    }

}
