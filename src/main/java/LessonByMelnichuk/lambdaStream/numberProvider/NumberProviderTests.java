package LessonByMelnichuk.lambdaStream.numberProvider;

public class NumberProviderTests {
    public static void main(String[] args) {
//        NumberProvider provider = new StrangeNumberProvider();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("provider.generateNext() = " + provider.generateNext());
//        }

        // Step 1
//        NumberProvider provider = new NumberProvider() {
//            @Override
//            public int generateNext() {
//                return 42;
//            }
//        };

//        // Step 2
//        NumberProvider provider = () -> {
//                return 42;
//            };

//        // Step 3
        NumberProvider provider = () -> 42;

        for (int i = 0; i < 10; i++) {
            System.out.println("provider.generateNext() = " + provider.generateNext());
        }
    }
}
