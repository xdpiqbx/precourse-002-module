package HomeWork.task_002;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Collection<String> names = Arrays.asList("Will", "Stan", "John", "Bill", "Max", "Alex");
        System.out.println(reverseOrderedUpperCaseList(names));
    }

    private static List<String> reverseOrderedUpperCaseList(Collection<String> names){
        return names
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
