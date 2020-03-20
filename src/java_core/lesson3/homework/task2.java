package java_core.lesson3.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/*2 * Создать массив из слов
При запуске программы компьютер загадывает слово,
 запрашивает ответ у пользователя,сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
 Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы*/
public class task2 {
    static String rightAnswer = "";
    static int mistakes = 0;

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        wordGame(words);
    }

    public static void wordGame(String[] words) {
        System.out.println(Arrays.toString(words));
        randomizeWord(words);
        for (int i = 0; i < rightAnswer.length(); i++) {
            if (askForUserAnswer().equals(rightAnswer)) {
                System.out.println("well done!");
                System.exit(0);
            } else {
                System.out.println("It's a pity... but I'll give you a hint");
                mistakes++;
                System.out.println(giveHint(rightAnswer));
            }
        }
        System.out.println("You surprisingly lose((");
    }

    public static void randomizeWord(String[] words) {
        Random rand = new Random();
        rightAnswer = "";
        rightAnswer = words[rand.nextInt(words.length)];
    }

    public static String askForUserAnswer() {
        System.out.println("Enter your answer: ");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        String[] words = null;
        try {
            words = in.readLine().split(" +");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String userAnswer = Arrays.stream(words)
                .filter(Objects::nonNull)
                .limit(1)
                .map(String::toLowerCase)
                // .map(element -> element.replaceAll("[^a-z]{1}", ""))
                .collect(Collectors.joining(""));
        return userAnswer;

    }

    public static String giveHint(String answer) {
        //   System.out.println(" hint here");//
        String filler = "##################";
        return answer.substring(0, mistakes) + filler;
    }


}

