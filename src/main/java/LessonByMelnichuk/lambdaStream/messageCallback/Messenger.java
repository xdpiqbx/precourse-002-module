package LessonByMelnichuk.lambdaStream.messageCallback;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
    private List<MessengerListener> listeners = new ArrayList<>();
    public void addListener(MessengerListener listener){
        listeners.add(listener);
    }
    public void onMessage(String message){
        for (MessengerListener listener : listeners) {
            listener.onMessageReceived(message);
        }
    }
}
