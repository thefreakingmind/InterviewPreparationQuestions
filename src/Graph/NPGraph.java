package Graph;

import java.util.*;


class TestClass {
    static List<Integer>[] graph;


    /**
     *
     */
    public static boolean[] visited = new boolean[100];
    public static void main(String args[] ) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        graph = new ArrayList[n];
        for(int i=0; i<k; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=1; i<m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i);
                count++;

            }
        }
        if(count>k){
            System.out.println(-1);

        }else{
            System.out.println(m-n+k);
        }

    }

    public static void dfs(int src){
        visited[src] = true;
        for(int kid: graph[src]){
            if(!visited[kid]){
                dfs(kid);
            }
        }
    }
}
