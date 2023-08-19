import java.util.EventListener;

public interface ScoreObserver extends EventListener{
    public void scoreChange(Event evt);
}