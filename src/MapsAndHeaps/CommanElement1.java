package MapsAndHeaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommanElement1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = in.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int val: arr){
            if(map.containsKey(val)){
                int oldFrequency = map.get(val);
                int newFrequency = val + 1;

                map.put(val, newFrequency);

            }else{
                map.put(val, 1);
            }
        }


        /**
         * Print and Pop the Elements for Frequency Map
         */

        for(int manager: arr2){
            if(map.containsKey(manager)){
                System.out.println(manager);
                map.remove(manager);
            }
        }
    }
}
