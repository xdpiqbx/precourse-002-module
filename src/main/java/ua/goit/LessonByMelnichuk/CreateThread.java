package ua.goit.LessonByMelnichuk;

public class CreateThread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(
                " Thread.currentThread().getName() = "
                +Thread.currentThread().getName()
            )).start();
        }
    }
}

// ================================================================

//public class CreateThread {
//    public static void main(String[] args) {
//        new CustomThread().start();
//    }
//
//    private static class CustomThread extends Thread{ // <<<-----
//        @Override
//        public void run() {
//            System.out.println(
//                "Thread.currentThread().getName() = "
//                +Thread.currentThread().getName()
//            );
//        }
//    }
//}

// ================================================================

//public class CreateThread {
//    public static void main(String[] args) {
//        new Thread(new Runnable() { // <<<-----------------------
//            @Override
//            public void run() {
//                System.out.println(
//                        "Thread.currentThread().getName() = "
//                                +Thread.currentThread().getName()
//                );
//            }
//        }).start();
//    }
//}
