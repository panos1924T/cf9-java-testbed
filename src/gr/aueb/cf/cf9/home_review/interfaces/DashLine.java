package gr.aueb.cf.cf9.home_review.interfaces;

import java.util.Scanner;


/**
 * defines the method for drawing the line
 */
public class DashLine extends AbstractLine{

    Scanner input = new Scanner(System.in);

    @Override
    protected void printChar() {
        System.out.print("-");
    }
}
