package MapsAndHeaps;

import java.io.*;
import java.util.*;

public class FrequencyMapper {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                int oldFrequency = map.get(c);
                int newFrequency = oldFrequency + 1;
                map.put(c, newFrequency);

            }else{
                map.put(c, 1);
            }
        }
        char mf = s.charAt(0);
        for(Character key: map.keySet()){
            if(map.get(key)> map.get(mf)){
                mf = key;

            }
        }
        System.out.println(mf);
    }

}