package CodeForcesSolution;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private Map<String, String> map = new HashMap<>();
    public String[] reference = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String a : words){
            set.add(getMorseCode(a));
        }

        return set.size();



    }

    public String getMorseCode(String a){
        StringBuilder sb = new StringBuilder();
        for(char c: a.toCharArray()){
            sb.append(reference[c-'a']);
        }

        return sb.toString();
    }
}
