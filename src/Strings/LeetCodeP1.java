package Strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String destCity(List<List<String>> paths) {

        Map<String, String> map  = new HashMap<>();
        for(List<String> path: paths){
            map.put(path.get(0), path.get(0));

        }
        String key = paths.get(0).get(0);

        while (map.containsKey(key)){
            key = map.get(key);
        }

        return key;

    }
}


public class LeetCodeP1 {
}
