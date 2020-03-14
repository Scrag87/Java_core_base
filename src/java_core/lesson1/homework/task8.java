package java_core.lesson1.homework;

//https://miniwebtool.com/leap-years-list/?start_year=1880&end_year=2020
public class task8 {
    public static void main(String[] args) {
        for (int i = 1500; i < 2020; i++) {
            if (isLeapYear(i)) System.out.println(i + " is leap year");
        }
    }

    private static boolean isLeapYear(int givenYear) {
        if (givenYear % 4 == 0 && givenYear % 100 != 0 && givenYear % 400 != 0) return true; // 4 y
        else if (givenYear % 4 == 0 && givenYear % 100 == 0 && givenYear % 400 != 0) return false; // 100 y
        else if (givenYear % 4 == 0 && givenYear % 100 == 0 && givenYear % 400 == 0) return true; // 400 y
        else return false;
    }
}
