package java_core.lesson6.homework;

import java_core.lesson6.homework.Animals.Cat;

public class Animal {

    protected String name;
    protected Double jumpLimit;
    protected int swimLimit;
    protected int runLimit;

    public Animal(String name, Double jumpLimit, int swimLimit, int runLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
    }

    public void run(int runDistance) {
        System.out.print(this.name + " ");
        if (runDistance <= runLimit) {
            System.out.println("run: true" + "(limit is " + this.runLimit + " && command is " + runDistance + ")");
            runLimit -= runDistance;

        } else System.out.println("run: false" + "(limit is " + this.runLimit + " but command is " + runDistance + ")");
    }

    public void swim(int swimDistance) {
        System.out.print(this.name + " ");
        if (swimDistance <= swimLimit) {
            System.out.println("swim: true" + "(limit is " + this.swimLimit + " && command is " + swimDistance + ")");
            swimLimit -= swimDistance;
        } else
            System.out.println("swim: false" + "(limit is " + this.swimLimit + " but command is " + swimDistance + ")");
    }

    public void jump(Double jumpDistance) {
        System.out.print(this.name + " ");
        if (jumpDistance <= jumpLimit) {
            System.out.println("jump: true" + "(limit is " + this.jumpLimit + " && command is " + jumpDistance + ")");
            jumpLimit -= jumpDistance;
        } else
            System.out.println("jump: false" + "(limit is " + this.jumpLimit + " but command is " + jumpDistance + ")");

    }

    public void rest(int minutes) {
        System.out.println();
        System.out.println("ZZZzzz " + this.name + " is rested for: " + minutes);
        System.out.println();
        this.jumpLimit += minutes;
        this.runLimit += minutes * 2;
        if (this.getClass().equals(Cat.class)) this.swimLimit = 0; //как вариант. не стал переопределять в классе
        else this.swimLimit += minutes;
    }

    public void printLimits() {
        System.out.println();
        System.out.println(this.name + " JumpLimit is: " + this.jumpLimit);
        System.out.println(this.name + " SwimLimit is: " + this.swimLimit);
        System.out.println(this.name + " RunLimit is: " + this.runLimit);
        System.out.println();
    }

    public void printResult() {

    }

}
