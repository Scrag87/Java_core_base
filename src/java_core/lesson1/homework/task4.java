package java_core.lesson1.homework;

public class task4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " + " + i * 2 + " is between10To20 " + between10To20(i, i * 2));
        }
    }

    static boolean between10To20(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }
}
