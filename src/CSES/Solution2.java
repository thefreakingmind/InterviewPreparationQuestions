package CSES;

import java.util.Scanner;

public class Solution2 {

    /**
     * Logic
     *
     *
     * First take the sum of n using formula n*(n+1)
     * then subtract from the sum of the input arr
     *
     *
     * for ex  total - Sum(arr[i])
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long sum =0;
        for(long i=0; i<n-1; i++){
            int a = in.nextInt();
            sum +=a;
        }

        long total = n*(n+1)/2;
        long result = total - sum;

        System.out.println(result);
    }
}
