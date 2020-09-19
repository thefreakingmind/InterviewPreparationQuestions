package DynamicProgramming;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Fibonacci {

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
