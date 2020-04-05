package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        Espresso espresso = new Espresso();
        Latte latte = new Latte();
        Cappuccino cappuccino = new Cappuccino();

        coffeeMachine.printSupply();

        espresso.make(1);
        latte.make(1);
        cappuccino.make(1);

        coffeeMachine.printSupply();
    }
}
