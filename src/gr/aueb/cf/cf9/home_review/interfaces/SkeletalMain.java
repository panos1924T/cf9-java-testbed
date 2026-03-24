package gr.aueb.cf.cf9.home_review.interfaces;


import java.util.Scanner;

/**
 * testing the skeletal interfaces
 */
public class SkeletalMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ILine line = new DashLine();

        System.out.println("Please enter the length for the line you want to draw: ");
        int length = input.nextInt();
        line.drawLine(length);
    }
}
