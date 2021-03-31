package ohm.softa.a03;

public class PlayfulState extends State {
    public PlayfulState(int t, int duration) {
        super(t, duration);
    }

    @Override
    public State successor(Cat cat) {
        return new SleepingState(0, cat.getSleep());
    }
}
