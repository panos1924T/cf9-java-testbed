package gr.aueb.cf.cf9.christmas_review;

/**
 * Δίνεται ένας πίνακας ακεραίων.
 * Να υπολογιστεί το άθροισμα των στοιχείων
 * του.
 */
public class ArraySumApp {

    public static void main(String[] args) {
        int[] arr = {3, 5, 20, 3};

        int sum = sumArray(arr);

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("The sum of the above numbers is: " + sum);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }
}
