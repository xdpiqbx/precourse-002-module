package LessonByMelnichuk.stream;

import LessonByMelnichuk.lambdaStream.Human;

import java.util.stream.Stream;

public class StreamShortTests {
    public static void main(String[] args) {
        Human john = new Human("John",1000);
        Human igor = new Human("Igor",1500);
        Human mark = new Human("Mark",800);

        Stream<Human> humans = Stream.of(john, igor, mark);

        // У созданого стрима есть:
        // 1. Вспомогательные методы
        // 2. Терминальные методы

        // Function<Human, Integer> salaryFunction = human ->  human.getSalary();
        // Stream<Integer> integerStream = humans.map(salaryFunction);

        //  Stream<Integer> integerStream = humans.map(human ->  human.getSalary());
        double avg = humans
                // .map(human ->  human.getSalary())
                .map(Human::getSalary) // можно ту строку сверху упростить
                .mapToLong(it -> it)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);
    }
}
