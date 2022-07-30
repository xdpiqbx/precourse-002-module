package HW.task_002_json;

public class User {
    private String name;
    private int age;

    public User(String [] data) {
        this.name = data[0];
        this.age = Integer.parseInt(data[1].strip());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
