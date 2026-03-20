package gr.aueb.cf.cf9.home_review;

import java.util.Random;

/**
 * this class provides two static factory methods
 * so they can be used when called.
 */
public class StaticFactory {

    private int x = 0;
    private int y = 0;

    private StaticFactory() {}

    private StaticFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * initializes a static factory point at (0,0);
     * @return      point at (0,0);
     */
    public static StaticFactory getZeroPoint() {
        return new StaticFactory(0,0);
    }

    /**
     * This method initializes a random static factory point
     * using a seed for randomness;
     * @return      random point(x,y);
     */
    public static StaticFactory getRandomPoint() {
        final int seed = 101;
        Random random = new Random();
        return new StaticFactory(random.nextInt(seed), random.nextInt(seed));
    }
}
