package java_core.lesson1.homework;

public class task3 {
    public static void main(String[] args) {
        System.out.println(mathExpressionSolver(2, 3, 6, 3));
    }

    static int mathExpressionSolver(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}

