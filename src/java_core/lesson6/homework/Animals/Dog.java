package java_core.lesson6.homework.Animals;

import java_core.lesson6.homework.Animal;

public class Dog extends Animal {

    public Dog(String name, Double jumpLimit, int swimLimit, int runLimit) {
        super(name, jumpLimit, swimLimit, runLimit);
    }

    @Override
    public void rest(int minutes) {
        System.out.println("ZZZzzz " + this.name + " is rested for: " + minutes);
        this.jumpLimit += minutes;
        this.runLimit += minutes * 3;
        this.swimLimit += minutes;


    }
}
