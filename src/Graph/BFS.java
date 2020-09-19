package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private static int size =  5;
    private static List<Integer>[] graph = new ArrayList[size];
    private static boolean[] visited = new boolean[size];

    public static void main(String[] args) {
        for(int i=0; i<size; i++){
            graph[i] = new ArrayList<>();


        }
    }

    /**
     * BFS Algorithm
     * @param Node
     */
    public void bfs(int Node){
        Queue<Integer> queue = new LinkedList<>();
        int currNode;
        queue.offer(Node);
        while (!queue.isEmpty()){
            currNode = queue.poll();
            visited[currNode] = true;

            for(int i=0; i<graph[currNode].size(); i++){
                if(!visited[graph[currNode].get(i)]){
                    bfs(graph[currNode].get(i));
                }
            }
        }

    }


}
