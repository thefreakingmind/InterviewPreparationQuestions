package GeneralProblems;

import java.util.*;

public class SquareCheckingAPI {

    static class Storage<K, V>{
        Map<String, String> map = new HashMap<>();
        private StringBuffer stringBuffer = new StringBuffer();


    }
    /**
     * Detect the Coordinates of the Square.
     */
    static class Point{
        String psf;
        int x;
        int y;

        public Point(int x, int y, String xy) {
            this.x = x;
            this.y = y;
            this.psf = xy;
        }
    }

    public static int distanceinSquare(Point p, Point q){
        Queue<String> queue = new ArrayDeque<>();
        Queue<String> priorityQueue = new PriorityQueue<>();



        return (p.x - q.x) * (p.y - q.y);


    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        int[] arr = new int[10];



    }
}
