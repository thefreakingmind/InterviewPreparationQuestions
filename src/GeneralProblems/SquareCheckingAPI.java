package GeneralProblems;

public class SquareCheckingAPI {

    /**
     * Detect the Coordinates of the Square.
     */
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int distanceinSquare(Point p, Point q){


        return (p.x - q.x) * (p.y - q.y);


    }

    public static void main(String[] args) {

    }
}
