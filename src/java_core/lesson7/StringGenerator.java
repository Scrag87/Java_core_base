package java_core.lesson7;

import java.util.Random;

public class StringGenerator {

    public String generateSTR(int length, int sequence) {
        String result = "";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= length; i++) {
            int charNumber = 97 + random.nextInt(25);


            for (int j = 1; j <= 2 + random.nextInt(sequence); j++) {
                stringBuilder.append(Character.toChars(charNumber));
            }
        }
        return stringBuilder.toString();

    }


}
