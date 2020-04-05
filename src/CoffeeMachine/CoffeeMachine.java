package CoffeeMachine;

public class CoffeeMachine {

    static int cash = 550;

    static int water = 1200;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cup = 9;

    public static int getCash() {
        return cash;
    }

    public static void setCash(int cash) {
        CoffeeMachine.cash = cash;
    }

    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getCoffeeBeans() {
        return coffeeBeans;
    }

    public static void setCoffeeBeans(int coffeeBeans) {
        CoffeeMachine.coffeeBeans = coffeeBeans;
    }

    public static int getCup() {
        return cup;
    }

    public static void setCup(int cup) {
        CoffeeMachine.cup = cup;
    }


    public void runCM() {

    }

    public void printSupply() {
        System.out.println("Cash > " + getCash());
        System.out.println("Water > " + getWater());
        System.out.println("Beans > " + getCoffeeBeans());
        System.out.println("Cups > " + getCup());
        System.out.println("Milk > " + getMilk());
    }


}
