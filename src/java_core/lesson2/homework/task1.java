package java_core.lesson2.homework;

import java.util.Arrays;

public class task1 {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println();
        swap0to1(array);
    }

    private static void swap0to1(int[] input) {
        System.out.println("Input data: ");
        System.out.println(Arrays.toString(input));
        System.out.println("Reversed Data: ");
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) input[i] = 0;
            else input[i] = 1;
        }
        System.out.println(Arrays.toString(input));
    }


}
