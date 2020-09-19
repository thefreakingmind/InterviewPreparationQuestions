package Recurrsion;

import java.util.Scanner;

public class PrintincreasingIncreasing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printIncreasingDecreasing(n);
    }

    private static void printIncreasingDecreasing(int n) {
        if(n<=0){
            return;
        }

        System.out.println(n);
        printIncreasingDecreasing(n-1);
        System.out.println(n);
    }
}
