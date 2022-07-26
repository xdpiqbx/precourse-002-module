package LessonByMelnichuk.lambdaStream.streamsTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleStreamExamples {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            values.add(r.nextInt(10));
        }

        System.out.println("values = " + values);

//        Integer reduce = values
//                .stream()
//                .filter(value -> value % 2 == 0)
//                .reduce(0, (acc, value) -> acc += value);

        Integer sum = values
                .stream()
                .mapToInt(it->it)
                .filter(value -> value % 2 == 0)
                .sum();

        System.out.println("sum = " + sum);
    }
}
