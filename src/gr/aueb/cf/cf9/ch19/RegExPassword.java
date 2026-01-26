package gr.aueb.cf.cf9.ch19;

import java.util.Scanner;


/**
 * Έστω ότι ο χρήστης δίνει ένα password.
 * • Επαληθεύστε ότι έχει τη μορφή:
 * – Τουλάχιστον 8 χαρακτήρες
 * – Τουλάχιστον 1 μικρό γράμμα
 * – Τουλάχιστον 1 κεφαλαίο γράμμα
 * – Τουλάχιστον 1 αριθμό
 * – Τουλάχιστον 1 ειδικό χαρακτήρα #?!@$%^&*-
 */
public class RegExPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = " ";


        while (true) {
            System.out.println("Please enter your password: ");
            pass = input.nextLine();

            if (isPassCorrect(pass)) {
                System.out.println("Valid. Strong password");
                return;
            } else {
                System.out.println("Weak password. Please try again.");
            }
        }

    }

    public static boolean isPassCorrect(String pass) {
        if (pass.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*-]).{8,}$")) return true;

        return false;
    }
}
