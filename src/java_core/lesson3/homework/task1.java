package java_core.lesson3.homework;

import java.util.Scanner;

/*Написать программу, которая загадывает случайное число от 0 до 9
и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
 чем загаданное, или меньше. После победы или проигрыша выводится запрос –
 «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            game(getRandomNumber(10));
            askForAnotherGame();
        }
    }

    public static void game(int number) {
        System.out.println("Ваша задача угадать число.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число от 0 до 9");
            System.out.println("number is " + number);
            int input_number = getIntFromUser();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            if (i >= 2) {
                System.out.println("You lose");
                break;
            }
        }
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range);
    }

    public static void askForAnotherGame() {
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).");
        int input_number = getIntFromUser();
        if (input_number == 0 || input_number > 1) {
            System.out.println("Goodbye");
            scanner.close();
            System.exit(0);
        }

    }

    public static int getIntFromUser() {
        return scanner.nextInt();
    }
}
