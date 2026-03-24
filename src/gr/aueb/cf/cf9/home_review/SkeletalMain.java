package gr.aueb.cf.cf9.home_review;


/**
 * testing the skeletal interfaces
 */
public class SkeletalMain {

    public static void main(String[] args) {
        ILine line = new AbstractLine();
        line.drawLine();
    }
}
