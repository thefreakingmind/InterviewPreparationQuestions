package AtCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution0012 {

    public static void main(String[] args) {
        FastScanner in=new FastScanner();
        String s = in.next();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<stringBuilder.length(); i++){
            stringBuilder.append(s);
        }
        while (stringBuilder.length() > 0){
            for(int i=0; i<stringBuilder.length(); i++){
                if(stringBuilder.charAt(i) - '0' == 2){
                    stringBuilder.append(Integer.parseInt(String.valueOf(s.charAt(i) - 'a')));
                }
            }
        }

        System.out.println(stringBuilder.toString());


    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}