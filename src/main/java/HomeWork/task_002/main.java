package HomeWork.task_002;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Collection<String> names = Arrays.asList("Will", "Stan", "John", "Bill", "Max", "Alex");

        Collection<String>sorted = names
            .stream()
            .map(String::toUpperCase)
            .sorted(Comparator.reverseOrder())
            .toList();

        System.out.println(sorted);
    }
}
