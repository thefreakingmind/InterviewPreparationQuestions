package DynamicProgramming;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StairCase2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<arr.length; i++){

            arr[i] = in.nextInt();
        }
        int[] dp = new int[t+1];

        // 6-> 6 ke ek rasta
        dp[t] = 1;

        for(int i=t-1; i>=0; i--){
            for(int j=1; j<=arr[i] && i+j< dp.length; j++){

                dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
}
