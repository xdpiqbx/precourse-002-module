package LessonByMelnichuk.lambdaStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HumanStreamTests {
    public static void main(String[] args) {
        HumanGenerator generator = new HumanGenerator();
//        System.out.println(generator.generate(5));

        // Get all humans with salary > 1000;

//        List<Human> highSalaryPeople = generator
//                .generate(100)
//                .stream()
//                .filter(human -> human.getSalary() > 1000)
//                .peek(human -> System.out.println("human = " + human))
//                .collect(Collectors.toList());
//        System.out.println("Collectionsize: " + highSalaryPeople.size());
//        System.out.println("highSalaryPeople = " + highSalaryPeople);

        // Get humans with unique names
//        List<Human> humans = generator
//                .generate(100)
//                .stream()
//                .distinct()
//                .peek(h -> System.out.println(h))
//                .toList();
//        System.out.println("count = " + humans.size());
//        System.out.println("humans = " + humans);

        // Sort by salary
//        List<Human> sorted = generator
//                .generate(10)
//                .stream()
//                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
//                .peek(System.out::println)
//                .toList();

        // Skip, Limit
//        List<Human> withMaxSalary = generator
//                .generate(10)
//                .stream()
//                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
//                .skip(1) // Skip first
//                .limit(1) // get first
//                .peek(System.out::println)
//                .toList();

        // Name Secondname -> NAME SECONDNAME
        generator
                .generate(10)
                .stream()
                .map();
    }
}
