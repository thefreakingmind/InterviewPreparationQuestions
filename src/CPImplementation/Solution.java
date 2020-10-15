package CPImplementation;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * There is a robot which can move around on a grid. The robot is placed at point (0,0). From (x, y) the robot can move to (x+1,
 * y), (x-1, y), (x, y+1), and (x, y-1). Some points are dangerous and contain EMP Mines. To know which points are safe, we check
 * whether the sum digits of abs(x) plus the sum of the digits of abs(y) are less than or equal to 23. For example, the point (59,
 * 75) is not safe because 5 + 9 + 7 + 5 = 26, which is greater than 23. The point (-51, -7) is safe because 5 + 1 + 7 = 13, which is
 * less than 23.
 * How large is the area that the robot can access?
 *
 *
 * Logic :
 *
 *
 *
 *
 * Robot             0
 *                  /|\       (0,0) -> origin
 *                   |
 *                  /\
 */
public class Solution {








    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }



    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        PriorityQueue<String> pq = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] arr = new int[x][y];

    }



}
