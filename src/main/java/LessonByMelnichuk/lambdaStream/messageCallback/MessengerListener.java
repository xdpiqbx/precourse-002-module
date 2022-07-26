package LessonByMelnichuk.lambdaStream.messageCallback;
@FunctionalInterface
public interface MessengerListener {
    void onMessageReceived(String message);
}
