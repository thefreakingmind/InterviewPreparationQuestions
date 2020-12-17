package AtCoder;

import java.util.*;

class Tensor{
    
}
public class Matrix {
    PriorityQueue<String> pq = new PriorityQueue<>();
    Map<String, String> map = new TreeMap<>();
    StringBuilder stringBuilder = new StringBuilder();
    SortedSet<String> set = new TreeSet<>();

    public static void main(String[] args) {
        int result =0;
        Scanner in = new Scanner(System.in);
        Queue<String> queue = new PriorityQueue<>();

        int n = 2;
        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        result = arr[0][0] * arr[1][1] - arr[0][1] - arr[1][0];
        int out = arr[0][0] * arr[1][1];
        int pin = arr[0][1] - arr[1][0];


        // Refactor this
        int r1 = arr[0][0];
        int r2 = arr[1][1];
        int resultr = r1*r2;

        int c1 = arr[0][1];
        int c2 = arr[1][0];
        int resultc = c1*c2;

        result = resultr - resultc;
        System.out.println(result);

//        System.out.println(result);
    }
}
