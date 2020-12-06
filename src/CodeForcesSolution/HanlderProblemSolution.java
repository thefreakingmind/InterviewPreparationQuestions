package CodeForcesSolution;

import java.util.Scanner;

public class HanlderProblemSolution {
    private StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for(int i=0; i<s.length(); i++){
            s += "Apple";
        }
        System.out.println(s);
    }
}
