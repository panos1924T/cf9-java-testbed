package gr.aueb.cf.cf9.home_review.interfaces;

import java.util.Scanner;


/**
 * defines the method for drawing the line
 */
public class AbstractLine implements ILine{

    Scanner input = new Scanner(System.in);

    @Override
    public void drawLine() {
        System.out.println("Please give a length for the line you want to draw");
        int length = input.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
    }
}
