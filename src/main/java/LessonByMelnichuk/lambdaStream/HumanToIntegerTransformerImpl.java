package LessonByMelnichuk.lambdaStream;

public class HumanToIntegerTransformerImpl implements HumanToIntegerTransformer {
    @Override
    public int transform(Human human) {
        return human.getSalary();
    }
}
