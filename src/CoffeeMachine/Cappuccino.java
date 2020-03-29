package CoffeeMachine;

public class Cappuccino implements Producible {

    //for the cappuccino, the coffee machine needs
    // 200 ml of water,
    // 100 ml of milk, and
    // 12 g of coffee.
    // It costs $6.
    int water = 200;
    int milk = 100;
    int coffeeBeans = 12;
    int prise = 6;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public void make(int quantity) {
        System.out.println(getClass().toString() + " " + quantity);

        CoffeeMachine.setCup(CoffeeMachine.getCup() - quantity);

        CoffeeMachine.setCash(CoffeeMachine.getCash() + quantity * prise);
        CoffeeMachine.setCoffeeBeans(CoffeeMachine.getCoffeeBeans() - quantity * coffeeBeans);
        CoffeeMachine.setMilk(CoffeeMachine.getMilk() - quantity * milk);
        CoffeeMachine.setWater(CoffeeMachine.getWater() - quantity * water);
    }
}
