package lambdaStream;

import java.util.List;
import java.util.stream.Collectors;

public class HumanFilterTests {
    public static void main(String[] args) {
        HumanGenerator generator = new HumanGenerator();
        System.out.println(generator.generate(5));

        // Get all humans with salary > 1000;

        List<Human> highSalaryPeople = generator
                .generate(100)
                .stream()
                .filter(human -> human.getSalary() > 1000)
                .peek(human -> {
                    System.out.println("human = " + human);
                })
                .collect(Collectors.toList());

        System.out.println("Collectionsize: " + highSalaryPeople.size());
        System.out.println("highSalaryPeople = " + highSalaryPeople);
    }
}
