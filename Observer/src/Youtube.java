import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{
    private String channelName;
    public List<Observer> subscribers = new ArrayList<>();

    Youtube(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer subscriber : subscribers){
            subscriber.update("New video from: " + channelName + " - " + msg);
        }
    }

    public void uploadVideo(String videoTitle){
        System.out.println(channelName + " uploaded a new video: " + videoTitle);
        notifyObservers(videoTitle);
    }

}

