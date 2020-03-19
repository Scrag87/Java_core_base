package java_core.lesson2.homework;


import java.util.Arrays;

public class task6 {
    //6. ** Написать метод, в который передается не пустой одномерный
    // целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    //          checkBalance([1, 1, 1, || 2, 1]) → true,
    //          граница показана символами ||, эти символы в массив не входят.


    public static void main(String[] args) throws Exception {
        int[] arr = {2, 3, 2, 1, 2, 2, 10, 2};
        System.out.print("Initial ");
        printArray(arr);
//
//        System.out.println(Arrays.toString(leftSideConstructor(arr, 5)));
//        System.out.println(Arrays.toString(rightSideConstructor(arr, 5)));
//        System.out.println("Sum is " + getSumArray(leftSideConstructor(arr, 3)));
//        System.out.println("Sum is " + getSumArray(rightSideConstructor(arr, 3)));

        System.out.println(checkBalance(arr));
    }

    public static int[] leftSideConstructor(int[] arr, int getArrNumAtPos) throws Exception {
        if (getArrNumAtPos > arr.length) throw new Exception("Wrong number");
        else {

            int[] leftSide = new int[arr.length];
            for (int i = 0; i < getArrNumAtPos; i++) {
                leftSide[i] = arr[i];
            }
            return leftSide;
        }
    }

    public static int[] rightSideConstructor(int[] arr, int getArrNumAtPos) throws Exception {
        if (getArrNumAtPos > arr.length) throw new Exception("Wrong number");
        else {
            int[] rightSide = new int[arr.length];
            for (int i = arr.length - 1; i >= arr.length - getArrNumAtPos; i--) {
                rightSide[i] = arr[i];
            }
            return rightSide;
        }
    }

    private static void printSumArray(int[] arrayFromUser) {
        int sum = 0;
        for (int elem : arrayFromUser) {
            sum += elem;
        }
        System.out.println("SumOfArray is " + sum);
    }

    private static void printArray(int[] arrayFromUser) {
        System.out.print("array [");
        for (int elem : arrayFromUser) {
            System.out.print(elem + ", ");

        }
        System.out.println("]");
    }

    private static int getSumArray(int[] arrayFromUser) {
        int sum = 0;
        for (int elem : arrayFromUser) {
            sum += elem;
        }
        return sum;
    }

    private static boolean checkBalance(int[] arr) throws Exception {
        boolean result = false;
        //
        for (int leftSide = 1, rightSide = arr.length; leftSide <= arr.length - 1; leftSide++, rightSide--) {
//            System.out.print("  leftside  ");
//            printArray(leftSideConstructor(arr, leftSide));
//            printSumArray(leftSideConstructor(arr, leftSide));
//            System.out.println(getSumArray(leftSideConstructor(arr, leftSide)));

//            System.out.print("  rightside  ");
//            printArray(rightSideConstructor(arr, rightSide - 1));
//            printSumArray(rightSideConstructor(arr, rightSide - 1));
//            System.out.println(getSumArray(rightSideConstructor(arr, rightSide - 1)));
            if (getSumArray(leftSideConstructor(arr, leftSide)) == getSumArray(rightSideConstructor(arr, rightSide - 1))) {
//                System.out.println("match!");
                printArray(leftSideConstructor(arr, leftSide));
                System.out.println("  match with  ");
                printArray(rightSideConstructor(arr, rightSide - 1));
                result = true;
                break;
            }
        }
        return result;
    }


}





