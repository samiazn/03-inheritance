package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat {
    private int sleep;
    private int awake;
    private int digest;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private State currentState;
    private String name;
    private static final Logger logger = LogManager.getLogger();

    public Cat(String name, int sleep, int awake, int digest) {
        this.sleep = sleep;
        this.awake = awake;
        this.digest = digest;
        this.name = name;
        currentState = new SleepingState(0, sleep);
    }

    public void tick() {
        currentState = currentState.tick(this);
        logger.info(this.getCurrentState());

    }

    public void feed() {
        if (isHungry()) {
            currentState = ((HungryState) currentState).feed(this);
        } else {
            throw new IllegalStateException("Can't stuff a cat...");
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getSleep() {
        return sleep;
    }

    public int getAwake() {
        return awake;
    }

    public int getDigest() {
        return digest;
    }


    public boolean isAsleep() {
        return (currentState instanceof SleepingState);
    }

    public boolean isPlayful() {
        return (currentState instanceof PlayfulState);
    }

    public boolean isHungry() {
        return (currentState instanceof HungryState);
    }

    public boolean isDigesting() {
        return (currentState instanceof DigestingState);
    }

    public boolean isDead() {
        return (currentState instanceof DeathState);
    }

    @Override
    public String toString() {
        return name;
    }
}
