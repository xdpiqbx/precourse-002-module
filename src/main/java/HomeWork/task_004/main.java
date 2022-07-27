package HomeWork.task_004;

import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long)Math.pow(2, 48);

        long startSeed = 987654134576454238L;

        CongruentGenerator rand = new CongruentGenerator(a);

        Stream<Long> stream = Stream.iterate(startSeed, (seed) -> rand.next(c, m, seed));

        stream.limit(10).peek(System.out::println).toList();
    }
}
