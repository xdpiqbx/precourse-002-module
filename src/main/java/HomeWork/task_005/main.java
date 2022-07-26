package HomeWork.task_005;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("Alpha", "Beta", "Gamma");
        Stream<String> streamB = Stream.of("1", "2", "3", "4", "5");

        Stream<String> result = zip(streamA, streamB);

        result.peek(System.out::println).collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        Stream<T> result = Stream.of(iteratorA.next());

        boolean aStop = true;
        boolean bStop = true;

        while(true){
            if(iteratorB.hasNext() && bStop){
                result = Stream.concat(result, Stream.of(iteratorB.next()));
            }else{
                break;
            }

            if(iteratorA.hasNext() && aStop){
                result = Stream.concat(result, Stream.of(iteratorA.next()));
            }else{
                break;
            }

            if(!iteratorA.hasNext()){
                aStop = false;
            } else if (!iteratorB.hasNext()) {
                bStop = false;
            }
        }

        return result;
    }
}

