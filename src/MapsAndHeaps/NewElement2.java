package MapsAndHeaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewElement2 {
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
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }else{
                map.put(val, 1);
            }
        }


        for(int manager : arr2){
            if(map.containsKey(manager) && map.get(manager) > 0){
                System.out.println(manager);
                int old = map.get(manager);
                int newFrequency = old - 1;
                map.put(manager, newFrequency);

            }
        }

    }
}
