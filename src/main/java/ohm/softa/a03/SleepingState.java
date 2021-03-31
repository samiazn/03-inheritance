package ohm.softa.a03;


public class SleepingState extends State {

    public SleepingState(int t, int duration) {
        super(t, duration);
    }

    @Override
    public State successor(Cat cat) {
            return new HungryState(0,cat.getAwake());
//            cat.setCurrentState(new HungryState(0,cat.getAwake()));

    }
}
