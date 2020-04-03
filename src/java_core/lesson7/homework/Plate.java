package java_core.lesson7.homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    private void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFoodIntoPlate(int amount) {
        if (amount > 0) setFood(getFood() + amount);
        else throw new IllegalArgumentException("amount of food can't be negative");
    }

    public void decreaseFood(int amount) {
        if (food < amount) setFood(0);
        else food -= amount;
    }
}
