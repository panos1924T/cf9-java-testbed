package gr.aueb.cf.cf9.home_review.exceptions;

import gr.aueb.cf.cf9.home_review.AbstractLine;
import gr.aueb.cf.cf9.home_review.ILine;


/**
 * testing the skeletal interfaces
 */
public class SkeletalMain {

    public static void main(String[] args) {
        ILine line = new AbstractLine();
        line.drawLine();
    }
}
