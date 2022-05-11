package ua.goit.mod_5.lesson_001_immutable_classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String changed = "123"+"Hello"+"world";
        String newString = changed.replace("1", "error");
        System.out.println(changed);
        System.out.println(newString);

        // Immutable class Student
        Student student = new Student("John", "Smith");
        String[] lessons = student.getLessons();
        lessons[1] = "Alhebra"; // impossible to change data!
        System.out.println(Arrays.toString(student.getLessons()));
    }
}
