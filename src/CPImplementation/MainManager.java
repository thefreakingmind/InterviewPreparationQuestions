package CPImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class GraphEdge{
    private int src;
    private int dest;
    private int wt;

    public GraphEdge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

public class MainManager {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int vtces = Integer.parseInt(bufferedReader.readLine());

        List<GraphEdge>[] graph = new ArrayList[vtces];
        for(int i=0; i<vtces; i++){
            graph[i] = new ArrayList<>();

        }

        int edges = Integer.parseInt(bufferedReader.readLine());
        for(int i=0; i<edges; i++){
            String[] parts = bufferedReader.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new GraphEdge(v1, v2, wt));
            graph[v2].add(new GraphEdge(v2, v1, wt));

        }

    }

}
