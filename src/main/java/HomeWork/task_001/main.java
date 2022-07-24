package HomeWork.task_001;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Collection<String> names = Arrays.asList("Will", "Stan", "John", "Bill", "Max", "Alex");

        AtomicInteger i = new AtomicInteger();
        Stream<String> namesStream = names
                .stream()
                .map((name) -> {
                    i.getAndIncrement();
                    return i + ". " + name;
                })
                .filter(name -> Integer.parseInt(name.substring(0, 1)) % 2 != 0);

        String listToString = namesStream.toList().toString();

        listToString = listToString.substring(1, listToString.length() - 1); // убрал из строки [ ]

        System.out.println(listToString);
    }
}
