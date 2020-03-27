package java_core.lesson2.homework;

public class task3 {
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Initial Array");
        for (int elem : array) {
            System.out.print(+elem + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        System.out.println();
        System.out.println("Final Array: ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
