package ua.goit.mod_5.lesson_001_immutable_classes;

import java.util.Arrays;

// Immutable
public final class Student {
    private final String firstName;
    private final String lastName;
    private String[] lessons;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lessons = new String[]{"Mathematic", "Physic", "Biology"};
    }

    public Student setFirstName(String firstName){
        return new Student(firstName, lastName);
    }
    public Student setLastName(String lastName){
        return new Student(firstName, lastName);
    }
    public String[] getLessons(){
        return Arrays.copyOf(lessons, lessons.length);
    }
}
