package CodeForcesSolution;

import java.util.*;

public class StringSolver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Queue<String> queue = new ArrayDeque<>();

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Queue<Integer> integerQueue = new PriorityQueue<>();
        arrayDeque.addFirst("Salman Siddiqui");

        for(int i=0; i<arrayDeque.size(); i++){
            System.out.println(arrayDeque);
        }

        

        System.out.println(Arrays.stream(Arrays.stream(s.split("\\+")).toArray()).sorted());



    }
}
