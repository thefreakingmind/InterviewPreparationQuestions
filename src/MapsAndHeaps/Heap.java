package MapsAndHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks = {22, 99, 3, 11, 88, 4, 1};


        for(int i: ranks){
            pq.add(i);

        }

        while (pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
