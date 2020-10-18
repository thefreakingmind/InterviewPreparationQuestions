package DynamicProgramming;

import java.util.*;

public class StairCaseDP {
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(stairCase(n));
    }
    public static int stairCase(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                dp[i]  = dp[i-1];
            }
            else if(i == 2){
                dp[i] =  dp[i-1] + dp[i-2];
            }

            else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }

        }
        return dp[n];
    }
}
