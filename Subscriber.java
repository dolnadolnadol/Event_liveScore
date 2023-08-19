public class Subscriber implements ScoreObserver {
    @Override
    public void scoreChange(Event evt) {
        System.out.println("live result: " + evt.getData());
    }
}
