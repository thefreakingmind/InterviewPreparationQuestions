package DynamicProgramming;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class StairCaseDP {

    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursiveDPStairCase(n));
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int i=0; i<stringBuilder.length(); i++){
            System.out.print(stringBuilder.toString());

        }

    }

    public static int recursiveDPStairCase(int n){
        int n1 = recursiveDPStairCase(n-1);
        int n2 = recursiveDPStairCase(n-2);
        int n3 = recursiveDPStairCase(n-3);
        int solution = n1 + n2 + n3;
        return solution;
    }

    public static int stairCase(int n){
        int[] dp = new int[n+1];

        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] = dp[i-1];
            }else if(i==2){
                return dp[i] = dp[i-1] + dp[i-2];
            }
            else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}
