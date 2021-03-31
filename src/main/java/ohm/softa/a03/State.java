package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class State {
    private static final Logger logger = LogManager.getLogger();
    private final int duration;
    private int t;



    public State(int t, int duration) {
        this.t = t;
        this.duration = duration;

    }

    public final  State tick(Cat cat) {
        t = t + 1;
        if (getT() == getDuration()) {
            return successor(cat);
        } else return this;
    }

    public abstract State successor(Cat cat);

    public int getT() {
        return t;
    }

    public int getDuration() {
        return duration;
    }
}
