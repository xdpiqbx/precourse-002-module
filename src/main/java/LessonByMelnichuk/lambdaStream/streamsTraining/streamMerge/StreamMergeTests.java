package LessonByMelnichuk.lambdaStream.streamsTraining.streamMerge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergeTests {
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

    public static <T> Stream<T> zipShuffleCollections(Stream<T> first, Stream<T> second){
        List<T> streamAItems = first.toList();
        List<T> streamBItems = second.toList();

        int minSize = Math.min(streamAItems.size(), streamBItems.size());

        List<T> res = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            res.add(streamAItems.get(i));
            res.add(streamBItems.get(i));
        }

        return res.stream();
    }

    public static <T> Stream<T> zipIteratorsToList(Stream<T> first, Stream<T> second){
        List<T> result = new ArrayList<>();

        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while(iteratorA.hasNext() && iteratorB.hasNext()){
            result.add(iteratorA.next());
            result.add(iteratorB.next());
        }

        return result.stream();
    }
}


