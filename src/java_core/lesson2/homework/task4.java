package java_core.lesson2.homework;

public class task4 {
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void main(String[] args) {

        int[][] table = new int[6][6];
        int start = 0;
        int end = table.length - 1;
        for (int string = 0; string < 6; string++) {
            for (int column = 0; column < 6; column++) {
                if (string == start && column == start) {
                    table[column][start] = 1;
                } else if (string == start && column == end) {
                    table[string][end] = 1;
                } else table[string][column] = 0;
                System.out.print(table[string][column] + "  ");
            }
            start++;
            end--;
            System.out.println();
        }
    }
}
