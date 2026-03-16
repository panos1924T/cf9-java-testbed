package gr.aueb.cf.cf9.home_review;

/**
 * This class is demo for checking account java bean with methods
 */
public class AccountMain {

    public static void main(String[] args) {
        Account alice = new Account(1, "AB100", "111", 0.0);

        try {
            alice.deposit(100);
            System.out.println("Successful");

            alice.withdraw(50, "111");
            System.out.println("Successful");

            System.out.println(alice.getAccountBalance());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
