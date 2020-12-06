package CodeForcesSolution;

import java.util.*;
import java.util.function.Function;

public class GraphTranspose {

    private ArrayDeque<String> graph = new ArrayDeque<>();

    static class PointQueue{
        Point p;
        int distance;
        int variableDistance;
        int solverHandler;
        String s;

        public PointQueue(Point p, int distance, int variableDistance, int solverHandler, String s) {
            this.p = p;
            this.distance = distance;
            this.variableDistance = variableDistance;
            this.solverHandler = solverHandler;
            this.s = s;
        }
    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<stringBuilder.length(); i++){
            System.out.print(stringBuilder.toString());
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            if(pq.size() > 0){
                System.out.println();
            }
        }


    }
}
