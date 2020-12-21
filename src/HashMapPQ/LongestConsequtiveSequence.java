package HashMapPQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestConsequtiveSequence {

    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        int[] arr = in.readArray(n);
        StringBuilder stringBuilder = new StringBuilder();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("Hello");
        arrayDeque.addLast("World");
        stringBuilder.append(arrayDeque);
        System.out.println(stringBuilder);
        Map<String, String> map = new HashMap<>();
        for(int i=0; i< map.size(); i++){
            System.out.println(map);

        }


    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static void reverse(int a[])
    {
        int n = a.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for(int i=0; i<b.length; i++){
            a[i] = b[i];
        }
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
