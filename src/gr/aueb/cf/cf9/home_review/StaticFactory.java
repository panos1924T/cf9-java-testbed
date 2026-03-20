package gr.aueb.cf.cf9.home_review;

import java.util.Random;

public class StaticFactory {

    private int x = 0;
    private int y = 0;

    private StaticFactory() {}

    private StaticFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static StaticFactory getZeroPoint() {
        return new StaticFactory(0,0);
    }

    public static StaticFactory getRandomPoint() {
        final int seed = 101;
        Random random = new Random();
        return new StaticFactory(random.nextInt(seed), random.nextInt(seed));
    }
}
