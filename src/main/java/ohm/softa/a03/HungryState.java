package ohm.softa.a03;

public class HungryState extends State {
    public HungryState(int t, int duration) {
        super(t, duration);

    }

    @Override
    public State successor(Cat cat) {
            return new DeathState(0, 0);
    }

    public State feed(Cat cat) {
        if (!cat.isHungry()) {
            throw new IllegalStateException("Can't stuff a cat...");
        }
        System.out.println("I'm eating now... yahm");
        return new DigestingState(0, cat.getDigest());
    }
}
