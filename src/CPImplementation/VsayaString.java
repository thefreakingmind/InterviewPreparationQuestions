package CPImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VsayaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s.matches(".*h.*e.*l.*l.*o.*")?"YES":"NO");
    }
}
