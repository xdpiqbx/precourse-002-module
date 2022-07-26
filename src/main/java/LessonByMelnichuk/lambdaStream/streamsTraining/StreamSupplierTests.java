package LessonByMelnichuk.lambdaStream.streamsTraining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSupplierTests {
    public static void main(String[] args) {
        Supplier<Stream<Long>> streamSupplier = () -> Arrays.asList(1l,2l,3l,4l,5l).stream();
        List<Long> collect = streamSupplier.get().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
