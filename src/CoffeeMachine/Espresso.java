package CoffeeMachine;

public class Espresso implements Producible {
    //For the espresso, the coffee machine needs
    // 250 ml of water and
    // 16 g of coffee beans.
    // It costs $4.
    int water = 250;
    int milk = 0;
    int coffeeBeans = 16;
    int prise = 4;

    public int[] getEspresso() {
        return new int[]{getWater(), getMilk(), getCoffeeBeans(), getPrise()};
    }

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
