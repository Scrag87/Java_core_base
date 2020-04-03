package java_core.lesson7.homework;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Mewoww", 5);
        Cat cat1 = new Cat("Mewoww1", 10);
        Cat cat2 = new Cat("Mewoww2", 15);
        Cat cat3 = new Cat("Mewoww3", 20);
        Cat cat4 = new Cat("Mewoww4", 25);
        Plate plate = new Plate(20);

        plate.info();
        cat.eat(plate);
        plate.info();
        cat2.eat(plate);
        plate.info();
        cat3.eat(plate);
        plate.info();
        cat4.eat(plate);
        plate.info();
        plate.addFoodIntoPlate(5);

    }
}
