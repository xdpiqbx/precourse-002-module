package ua.goit.mod_008.lesson_002_Map_TreeMap.lesson_001_Map_HashMap_LinkedHashMap;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Employee o) {
        if (this.id < o.id){
            return -1;
        } else if (this.id > o.id) {
            return 1;
        }
        return 0;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        // return super.hashCode();
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Employee employee = (Employee) obj;
        return this.id == employee.id && Objects.equals(this.name, employee.name);
    }
}
