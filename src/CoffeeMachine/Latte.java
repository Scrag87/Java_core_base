package CoffeeMachine;

public class Latte implements Producible {
    //For the latte, the coffee machine needs
    // 350 ml of water,
    // 75 ml of milk, and
    // 20 g of coffee beans.
    // It costs $7.
    int water = 350;
    int milk = 75;
    int coffeeBeans = 20;
    int prise = 7;


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
