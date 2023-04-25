import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<Human>();
        Employee employee = new Employee();
        employee.name = "a";
        employee.surname = "b";
        employee.salary = 45000;
        people.add(employee);
        Engineer engineer = new Engineer();
        engineer.name = "d";
        engineer.surname = "f";
        engineer.skillLevel = 3;
        people.add(engineer);
        Manager manager = new Manager();
        manager.name = "k";
        manager.surname = "o";
        manager.projectCount = 2;
        people.add(manager);
        Secretary secretary = new Secretary();
        secretary.name = "f";
        secretary.surname = "u";
        secretary.workHours = 35;
        people.add(secretary);
        Director director = new Director();
        director.name = "b";
        director.surname = "s";
        director.groupName = "main office";
        people.add(director);
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).info());
        }
    }
}
