package CodeForcesSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HitaLottery {


    static class Hanlder implements Comparable<Hanlder>{
        int n = 10;
        private Integer[] arr = new Integer[n];

        private String psf;
        private int data;
        private int src;
        private int dest;

        @Override
        public int compareTo(Hanlder o) {
            return o.data - dest;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sb.length(); i++){
            ArrayDeque<String> arrayDeque = new ArrayDeque<>();
            for(int jj=0; jj<arrayDeque.size(); i++){
                for(int hanlder = 0; hanlder< 10; hanlder++){
                    String s = bf.readLine();

                }
                System.out.println(jj);
            }
        }

    }
}
