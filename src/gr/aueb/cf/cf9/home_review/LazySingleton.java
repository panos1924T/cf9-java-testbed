package gr.aueb.cf.cf9.home_review;


/**
 * This class creates only one instance (singleton)
 * and uses lazy initialization (created when method called);
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if (instance == null) instance = new LazySingleton();
        return instance;
    }
}
