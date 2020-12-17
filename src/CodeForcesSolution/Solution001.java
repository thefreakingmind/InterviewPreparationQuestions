package CodeForcesSolution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution001 {
    //Rule
    // better implementation would be to use the Split Function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s= in.next();
        sb.append(s);
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '+'){
                sb.deleteCharAt(i);
            }
        }
        int[] finalSolution = new int[sb.length()];

        for(int i=0; i<sb.length(); i++){
            finalSolution[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));

        }

        Arrays.sort(finalSolution);

        if(finalSolution.length >=1){
            System.out.print(finalSolution[0]);
        }


        for (int i = 1; i < finalSolution.length; i++) {
            System.out.print("+" +  finalSolution[i]);

        }


    }
}
