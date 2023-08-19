import java.util.ArrayList;
import java.util.List;

class ScoreSoure {
    private List<ScoreObserver> observers;
    public ScoreSoure() {
        observers = new ArrayList<>();
    }

    public void setScoreLine(String data) {
        notify(new Event(this, data));
    }

    public void register(ScoreObserver observer) {
        observers.add(observer);
    }

    public void unregister(ScoreObserver observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }
    public void notify(Event ScoreEvent) {
        for (ScoreObserver observer : observers) {
            observer.scoreChange(ScoreEvent);
        }
    }
}