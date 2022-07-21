package LessonByMelnichuk.lambdaStream;

public class HumanToIntegerTransformerTests {
    public static void main(String[] args) {
        // Step 1 - interface + implementation
        Human john = new Human("John", 1000);
        HumanToIntegerTransformer transformer1 = new HumanToIntegerTransformerImpl();
        System.out.println("transformer.transform1(john) = " + transformer1.transform(john));

        // Step 2 - Anonimous class
        HumanToIntegerTransformer transformer2 = new HumanToIntegerTransformer() {
            @Override
            public int transform(Human human) {
                return human.getSalary();
            }
        };
        System.out.println("transformer.transform2(john) = " + transformer2.transform(john));

        // Step 3 - Lambda
        // HumanToIntegerTransformer transformer3 = (Human human) -> human.getSalary(); // <- Ok
        // HumanToIntegerTransformer transformer3 = (human) -> human.getSalary(); // <- Ok
        HumanToIntegerTransformer transformer3 = human -> human.getSalary();
        System.out.println("transformer.transform3(john) = " + transformer3.transform(john));

        // Step 4 - Method reference
        HumanToIntegerTransformer transformer4 = Human::getSalary;
        System.out.println("transformer.transform4(john) = " + transformer4.transform(john));
    }
}
