package CSES;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();


        while (n!=0){
            System.out.print(n + " ");
            if(n==1) break;
            if(n%2==0){
                n = n/2;

            }
            else{
                n = n*3+1;
            }

        }

        System.out.println("\n");




    }
}
