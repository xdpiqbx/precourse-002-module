package human;

public class Human {
    private final String name;
    private final int salary;

    public Human(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
