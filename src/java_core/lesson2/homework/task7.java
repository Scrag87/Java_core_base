package java_core.lesson2.homework;

import static java.lang.Math.abs;

public class task7 {
    /*7. **** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементы
    массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    1 2 3 4 5 -> (+2)
//    5 1 2 3 4
//    4 5 1 2 3
    */
    static int tempItem = 0;

    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 44, 5};
        task6.printArray(arr);
        shiftElementsOfArray(arr, -3);
    }

    public static void storeElem(int i) {
        tempItem = i;
    }

    public static int getStoredElem() {
        return tempItem;
    }

    public static void shiftLeft(int[] arr, int shiftPosition) {
        for (int c = 0; c < shiftPosition; c++) {
            for (int i = 0; i < arr.length - 1; i++) {
                storeElem(arr[i]);
                arr[i] = arr[i + 1];
                arr[i + 1] = getStoredElem();
            }

        }
        task6.printArray(arr);
    }

    public static void shiftRight(int[] arr, int shiftPosition) {
        for (int c = 0, z = arr.length - 1; c < shiftPosition; z--, c++) {
            storeElem(arr[arr.length - 1]);
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = getStoredElem();

        }
        task6.printArray(arr);
    }

    private static void shiftElementsOfArray(int[] arr, int shiftPosition) {
        if (shiftPosition > 0) {
            shiftRight(arr, shiftPosition);
        } else if (shiftPosition < 0) {

            shiftLeft(arr, abs(shiftPosition));
        } else System.out.println(" Really? )))");//the same order

    }
}
