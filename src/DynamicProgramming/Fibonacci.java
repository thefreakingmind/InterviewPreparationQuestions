package DynamicProgramming;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.*;

public class Fibonacci {
    class Solution {
        public String destCity(List<List<String>> paths) {
            StringBuilder sb = new StringBuilder();
            while (!sb.equals(null)){
                System.out.println("Hello Wofl");
            }
            return sb.toString();


        }
    }

    static class Edge implements Comparable<Edge>{
        private String psf;
        private int data;
        private int src;
        private int dest;
        private int wt;

        public Edge(int data,int src, int dest, int wt) {
            this.data = data;
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge o) {
            return 0;
        }
    }

    public static int Fib(int n){
        if(n ==0 || n==1){
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Fib(n));

    }


    /**
     * Dynamic Programming Problem.
     * @param x
     * @param cache
     * @return
     */

    public static int FibDP(int x, int[] cache){
        if(x==0 || x==1){
            return x;
        }

        if(cache[x] != 0){
            return cache[x];
        }

        int fib1 = FibDP(x-1, cache);
        int fib2 = FibDP(x-2, cache);
        int fib = fib1 + fib2;
        cache[x] = fib;

        return fib;


    }
}
