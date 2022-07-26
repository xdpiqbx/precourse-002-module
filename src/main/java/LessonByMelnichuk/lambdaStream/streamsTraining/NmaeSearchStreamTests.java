package LessonByMelnichuk.lambdaStream.streamsTraining;

import java.util.List;

public class NmaeSearchStreamTests {
    public static void main(String[] args) {
        List<String> names = new HumanGenerator()
                .generate(10)
                .stream()
                .filter(it -> isValidName(it))
                .map(it -> it.getName())
                .toList();

        System.out.println("names = " + names);
    }

    private static boolean isValidName(Human human){
        String[] nameParts = human.getName().split(" ");
        String lastName = nameParts[1];
        return lastName.contains("a");
    }
}
