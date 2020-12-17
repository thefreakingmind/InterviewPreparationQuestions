package CodeForcesSolution;

import java.util.*;

public class ArrayManupulation {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();

        final int SZ = 100;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        stringBuilder.append(arr.toString());

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Index of the Array is " + Arrays.binarySearch(arr, 3));
        System.out.println(stringBuilder.toString());
        
    }
}
