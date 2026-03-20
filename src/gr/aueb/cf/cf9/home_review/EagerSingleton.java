package gr.aueb.cf.cf9.home_review;

/**
 * This class creates only one instance (singleton)
 * with eager initialization (created when class loads);
 */
public class EagerSingleton {

    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
