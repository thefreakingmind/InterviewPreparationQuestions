package Recurrsion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if(n<=0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
