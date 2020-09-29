package MapsAndHeaps;

import java.io.*;
import java.util.*;

public class KLargesElement {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            if(i< k){
                priorityQueue.add(arr[i]); // Till we have K People in the Team.
            }
            else{
                if(arr[i] > priorityQueue.peek()){
                    priorityQueue.remove();
                    priorityQueue.add(arr[i]);
                }
            }
        }
        // write your code here

        while (priorityQueue.size() > 0){
            System.out.println(priorityQueue.remove());
        }
    }

}