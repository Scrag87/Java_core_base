package java_core.lesson5.Hometask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("employee1", Position.MANAGER, "employee1@gmil.com", "87775356261", 30000, 32);
        Employee employee2 = new Employee("employee2", Position.CHIEF, "qemployee2we@gmil.com", "87775356262", 30000, 23);
        Employee employee3 = new Employee("employee3", Position.CONSULTANT, "qwemployee3@gmil.com", "87775356263", 30000, 40);
        Employee employee4 = new Employee("employee4", Position.WORKER, "employee4@gmil.com", "87775356264", 30000, 42);
        Employee employee5 = new Employee("employee5", Position.ENGINEER, "employee5@gmil.com", "87775356265", 30000, 52);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

//        employees.forEach(employee -> employee.about());
        System.out.println(" employees.for >>>> ");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() < 40) {
                employees.get(i).about();
            }
        }
        System.out.println(" employees.forEach >>> ");
        employees.forEach(employee -> {
            if (employee.getAge() > 40) {
                employee.about();
            }
        });
        System.out.println(" employees.stream() >> ");
        employees.stream()
                .filter(employee -> employee.getAge() > 40)
                .forEach(employee -> employee.aboutEmployee());


    }
}
