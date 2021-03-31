package ohm.softa.a03;

public class DigestingState extends State {
    public DigestingState(int t, int duration) {
        super(t, duration);
    }

    @Override
    public State successor(Cat cat) {
            return new PlayfulState(getT(), cat.getAwake());
    }
}
