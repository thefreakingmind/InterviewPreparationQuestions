package Recurrsion;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaxOfanArray {

    public static void main(String[] args) throws Exception {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=9; i<stringBuilder.length(); i++){
            if(stringBuilder.length() > 0){
                System.out.println("The Value is null");
            }else{
                
            }
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int max = maxofArray(arr, 0);
        System.out.println(max);

    }

    private static int maxofArray(int[] arr, int i) {

        int misa = maxofArray(arr, i + 1);
        if(misa > arr[i]){
            return misa;
        }else{
            return arr[i];
        }
    }
}
