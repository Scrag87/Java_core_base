package java_core.lesson6.homework;

import java_core.lesson6.homework.Animals.Cat;
import java_core.lesson6.homework.Animals.Dog;
import java_core.lesson6.homework.Animals.Hound;

public class Main {


    public static void main(String[] args) {

        Animal cat = new Cat("Kitty", 0.5, 0, 200);
        Animal cat2 = new Cat("Suzi", 2., 0, 300);
        Animal dog = new Dog("Bobik", 0.5, 10, 500);
        Animal hound = new Hound("Pushok", 1., 5, 500);

        cat.jump(0.2);
        cat.jump(0.2);
        cat.printLimits();
        cat.rest(20);
        cat.printLimits();
        cat.swim(2);
        cat.jump(0.2);

        cat2.run(101);
        cat2.run(100);
        cat2.rest(5);
        cat2.run(100);

        dog.run(200);
        dog.run(200);
        dog.printLimits();
        dog.rest(20);
        dog.printLimits();
        dog.swim(20);
        dog.swim(20);
        dog.swim(20);
        dog.run(200);

        hound.printLimits();
        hound.rest(30);
        hound.printLimits();
    }

}
