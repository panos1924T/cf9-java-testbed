package gr.aueb.cf.cf9.home_review.lamda.excercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> items = new ArrayList<>();
        items.add(new Document());
        items.add(new Photo());
        items.add("Default");

        Thread thread = new Thread(() -> {
            for (Object obj : items) {
                if (obj instanceof Printable printable) {
                    Runnable action = printable::print;
                    action.run();
                }
            }
        });

        thread.start();
    }

}
