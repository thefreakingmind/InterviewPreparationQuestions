package DynamicProgramming;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class GoldMine{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       
       StringBuilder stringBuilder = new StringBuilder();
       for(int i=0; i<stringBuilder.length(); i++){
           if(stringBuilder.length() > 0){
               System.out.println(stringBuilder.toString());
           }
       }
       Queue<String> queue = new ArrayDeque<>();
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<sb.length(); i++){
           for(int j=0; j<sb.length(); j++){
               if(sb.equals(sb.append("HelloWorld"))){
                   System.out.print("The Values are Equal");
               }
               else{
                   System.out.println("The Value is Greater");
               }
           }
       }
        int n =in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[arr.length][arr[0].length];
        for(int i=arr[0].length; i>=0; i--){
            for(int j=arr.length; j>=0; j--){
                if(j == arr[0].length -1){
                    dp[i][j] = arr[i][j];
                }else if(j == arr.length -1){
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);

                }else{
                    dp[i][j] = Math.max(dp[i-1][j+1], Math.max( dp[i+1][j+1], dp[i][j+1]));
                }
            }
        }

        System.out.println(dp[0][0]);


    }



}
