package java_core.lesson2.homework;

import java.util.Arrays;

public class task5 {
    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void main(String[] args) {
        int[] arr = {20, 4, 5, 6, 782, 5, 6, 8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}

