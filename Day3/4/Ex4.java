
import java.util.Scanner;

public class Ex4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.x = 2;
        point1.y = 4;
        Point point2 = new Point();
        point2.x = 5;
        point2.y = 7;
        Point point3 = new Point();
        point3.x = 1;
        point3.y = 5;
    }
    static class Point {
        double x;
        double y;
    }
}