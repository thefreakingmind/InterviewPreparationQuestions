package Arrays;

import java.util.*;
import java.util.function.Function;

public class ArrayBasic {
    StringBuilder stringBuilder = new StringBuilder();
    static Function<Integer, Integer> functionManager = x -> x*2;
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        PriorityQueue<String> queue = new PriorityQueue<>();

        int n = 5;
        Stack<String> strings = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String[] arr = new String[n];
        int[] solver = new int[10];
        int[] handler = new int[10];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){

                }
            }
        }



        strings.push("Salman");
        strings.push("Happy");
        strings.push("Apple");


        for(int i=0; i<strings.size(); i++){
            System.out.println(strings.get(i));
            while (strings.get(i) == "A"){
                stringBuilder.append(strings.get(i));
            }
        }
        stringBuilder.toString();

    }
}
