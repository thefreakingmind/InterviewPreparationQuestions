package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    private static int size = 5;

    private static List<Integer>[] graph = new ArrayList[size];
    private boolean[] visited = new boolean[size];

    public static void main(String[] args) {
        for (int i = 0; i <size ; i++) {
            graph[i] = new ArrayList<>();

        }
    }
}
