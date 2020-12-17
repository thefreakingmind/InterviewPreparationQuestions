package GenericTrees;

import java.util.*;

class Node{
    int data;
    List<Node> node = new ArrayList<>();
}

public class GenericTreeBasic {
    public static void main(String[] args) {
        int[] arr = {10, 20, -1, 10, 3, 20};
        Stack<Node> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            }
        }


    }

    Queue<String> queue = new PriorityQueue<>();
}
