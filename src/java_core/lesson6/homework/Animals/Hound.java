package java_core.lesson6.homework.Animals;

public class Hound extends Dog {
    public Hound(String name, Double jumpLimit, int swimLimit, int runLimit) {
        super(name, jumpLimit, swimLimit, runLimit);
    }

    @Override
    public void rest(int minutes) {
        System.out.println("ZZZzzz " + this.name + " is rested for: " + minutes);
        this.jumpLimit += minutes;
        this.runLimit += minutes * 5;
        this.swimLimit += minutes;


    }
}
