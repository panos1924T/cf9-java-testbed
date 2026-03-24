package gr.aueb.cf.cf9.home_review.interfaces;

/**
 * concrete class using the AbstractLine's method for single use
 */
public class DashLine extends AbstractLine{


    @Override
    protected void printChar() {
        System.out.print("-");
    }
}
