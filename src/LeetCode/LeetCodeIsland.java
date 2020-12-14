package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class LeetCodeIsland {
    public int numIslands(char[][] grid) {
        int count =0;
        int row = grid.length;

        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    count++;
                    dfs(grid, i, j, visited);

                }
            }
        }

       return count;


    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        if(i < 0 || j < 0 || i > grid.length || j > grid[0].length || visited[i][j] == true || grid[i][j] == 1){
            return;

        }

        visited[i][j] = true;
        dfs(grid, i-1, j, visited);
        dfs(grid, i, j-1, visited);
        dfs(grid, i, j+1, visited);
        dfs(grid, i+1, j, visited);


    }
}