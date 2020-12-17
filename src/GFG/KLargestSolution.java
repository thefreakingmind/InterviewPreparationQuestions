package GFG;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DijEdge implements Comparable<DijEdge>{
    Queue<String> queue = new PriorityQueue<>();
    private StringBuilder stringBuilder;

    ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    int n = 10;
    private String[] strings = new String[n];
    private Integer[] integers = new Integer[n];
    private int src;
    private int dest;
    private int wt;

    public DijEdge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    @Override
    public int compareTo(DijEdge o) {
        return o.wt - wt;
    }
}


class Handler{
    int count =0;
    public void handler(String manager){
        StringBuilder stringbuilder = new StringBuilder();
        for(int i=0; i<stringbuilder.length(); i++){
            if(stringbuilder.length() > 0){
                return;
            }else{
                stringbuilder.append("Manager is Updated");
                while(stringbuilder.length() > 0){
                    return;
                }
            }
        }
    }

}

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        List<Integer> list = new ArrayList<>();
        int[] handlerMaxer = new int[list.size()];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            if(i< k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while (pq.size() > 0){
            list.add(pq.peek());
            pq.poll();

        }

        for(int i=0; i<handlerMaxer.length; i++){
            handlerMaxer[i] = list.get(i);
        }
        return handlerMaxer;
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }
}