package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {


    /**
     * Hackerrank Solution-> use stack
     * @param s
     * @return
     */
    static String superReducedString(String s) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i=0; i<stringBuilder.length(); i++){
            if(stringBuilder.charAt(i) == stringBuilder.charAt(i-1)){

                StringBuilder stringBuilder1 = new StringBuilder();

                stringBuilder.delete(i-1, i+1);
                i=0;
            }
        }

        if(stringBuilder.length() == 0){
            return "Empty String";

        }
        return stringBuilder.toString();




    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
