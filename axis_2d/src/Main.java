import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        manyDots();

    }

    public static void clear() {
        axisSystem.clear();
    }


    public static void pointOne(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(150, 100, "Pink");


    }

    public static void pointTwo(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(-200, 200, "Yellow");
    }


    public static void threePoints(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(50, 50, "red");
        axisSystem.addSinglePoint(60, 60, "black");
        axisSystem.addSinglePoint(70, 70, "green");
    }

    public static void addSinglePoint(AxisSystem axisSystem, int x, int y) {
        axisSystem.addSinglePoint(x, y, "BLACK");
    }

    public static void addMutiplePoint(AxisSystem axisSystem, int[] arr, String color) {
        axisSystem.addMultiplePoints(arr, color);
    }

    public static void userDots(AxisSystem axisSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X and Y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        addSinglePoint(axisSystem, x, y);


    }

    public static AxisSystem axisSystem = new AxisSystem();

    public static Random r = new Random();

    public static void manyDots() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many dots do you want ?");
        int totalDots = scanner.nextInt();
        System.out.println("which color?");
        String paint = scanner.next();
        int[] arr = new int[totalDots * 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(30);
        }
        for (int j = 0; j < arr.length; j++) {
            addMutiplePoint(axisSystem, arr, paint);
        }

    }


    public static void drawLine() {
        int x = 5;
        int y = x * 2 + 100;
        for (int i = 0; i < x * 2; i++) {
            addSinglePoint(axisSystem,x,y);
        }

    }

    public static void drawMXNYdots() {
        Scanner scanner = new Scanner(System.in);
        AxisSystem axisSystem1 = new AxisSystem();
        System.out.println("Enter for X , Y , M :");
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = M * X + N;
        for (int i = 0; i < 10; i++) {
            axisSystem.addSinglePoint(X, Y, "RED");
            X = X + 1;

        }


    }
}



