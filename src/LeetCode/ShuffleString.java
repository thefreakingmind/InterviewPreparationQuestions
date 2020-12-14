package LeetCode;

import java.util.Map;
import java.util.TreeMap;

class ShuffleString {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<indices.length; j++){
                map.put(indices[j], s.charAt(i));
            }
        }
        for(int i=0; i<map.size(); i++){
            sb.append(map.get(i));
        }

        return sb.toString();

    }
}
