package java_core.lesson5.Hometask;

public class Employee {
    static int counterEmployee = 0;
    /**
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * Создать массив из 5 сотрудников
     * Пример:
     * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
     * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
     * // потом для каждой ячейки массива задаем объект
     * persArray[1] = new Person(...);
     * ...
     * persArray[4] = new Person(...);
     * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     */

    private String fio;
    private Position position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    private int id;

    public Employee(String fio, Position position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        counterEmployee++;
        id = counterEmployee;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position=" + position +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public void about() {
        System.out.println("FIO is " + this.fio);
        System.out.println("Occupation is " + this.position);
        System.out.println("Age is " + this.age);
        System.out.println("ID " + this.id);
        System.out.println();
    }

    public String aboutEmployee() {
        System.out.println("FIO is " + this.fio);
        System.out.println("Occupation is " + this.position);
        System.out.println("Age is " + this.age);
        System.out.println("ID " + this.id);
        System.out.println();
        return String.join(" ", "FIO is " + this.fio + "\nOccupation is " + this.position + "\nAge is " + this.age + "\nID " + this.id);
    }

}
