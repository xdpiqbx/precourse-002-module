package LessonByMelnichuk.lambdaStream.streamsTraining;

import java.util.concurrent.atomic.AtomicInteger;

public class NameOrderStream {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(1);
        new HumanGenerator()
                .generate(10)
                .stream()
                .map(human -> human.getName())
                .map(name -> i.getAndIncrement()+". "+name)
                .peek(System.out::println)
                .toList();
    }
}
