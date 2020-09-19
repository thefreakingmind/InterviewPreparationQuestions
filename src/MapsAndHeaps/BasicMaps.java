package MapsAndHeaps;

import java.util.*;

public class BasicMaps {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("America", 100);
        map.put("China", 10);

        System.out.println(map.toString());

        while (!map.containsKey("Ethopia")){
            map.put("Ethopia", 100);
            System.out.println(map);
        }

        Set<String> mapKeySet = map.keySet();
        for(String s: mapKeySet){
            int val = map.get(s);
            System.out.println(s + " Values " + val);

        }
    }
}
