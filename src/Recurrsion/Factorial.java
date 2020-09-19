package Recurrsion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n ) {
        if(n==0 || n==1){
            return 1;

        }else{
            return n * factorial(n-1);
        }
    }
}
