package CPImplementation;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Solve {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        while (queue.isEmpty()){
            System.out.println("The Queue is Empty");
            queue.add("Value");
            queue.add("Test");
            queue.add("Hanlder");

            }

        System.out.println(queue);

    }
}
