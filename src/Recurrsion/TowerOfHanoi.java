package Recurrsion;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();

        toh(n-1, t1, t2, t3);




    }

    private static void toh(int n, int t1, int t2, int t3) {

        if(n==0){
            return;
        }
        toh(n-1, t1, t3, t2);
        System.out.println(n + "[" + t1 + "->" + t2 + "]");
        toh(n-1, t3, t2, t1);
    }
}
