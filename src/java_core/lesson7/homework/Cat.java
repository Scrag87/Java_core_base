package java_core.lesson7.homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;

    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            this.isFull = true;
        } else this.isFull = false;

        System.out.print(this.name + " is full: " + this.isFull);
        System.out.print(". Food left: " + plate.getFood());
        System.out.println(". " + this.name + " appetite is " + this.appetite);
    }
}