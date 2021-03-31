package ohm.softa.a03;

public class DeathState extends State {

    public DeathState(int t, int duration) {
        super(t, duration);

    }

    @Override
    public State successor(Cat cat) {
        return this;
    }
}
