package LessonByMelnichuk.lambdaStream;

@FunctionalInterface
public interface HumanToIntegerTransformer {
    int transform(Human human);
}