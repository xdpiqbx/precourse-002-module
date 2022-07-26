package LessonByMelnichuk.lambdaStream.messageCallback;

public class MessengerTests {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        messenger.addListener(new MessengerListener() {
            @Override
            public void onMessageReceived(String message) {
                System.out.println("Msg recieved in listener A: " + message);
            }
        });

        messenger.addListener(message -> System.out.println("Msg recieved in listener B: " + message));

        messenger.onMessage("Test");
        messenger.onMessage("Hello");
    }
}
