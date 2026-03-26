package gr.aueb.cf.cf9.home_review.lamda.excercise;

public interface Printable {

    default void print() {
        System.out.println("Default printing..");
    }
}
