package gr.aueb.cf.cf9.ch10;

import java.util.Scanner;

public class Project05 {
    private static final int ROWS = 30;
    private static final int COLUMNS = 12;
    static boolean[][] array = new boolean[ROWS][COLUMNS];

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Please choose an action (1-3): ");
            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please choose column (A-L): ");
                    char col1 = userInput.next().toUpperCase().charAt(0);
                    System.out.println("Now choose row (1-30):");
                    int row1 = userInput.nextInt();
                    book(col1, row1);
                    break;
                case 2:
                    System.out.println("Please choose column (A-L): ");
                    char col2 = userInput.next().toUpperCase().charAt(0);
                    System.out.println("Now choose row (1-30):");
                    int row2 = userInput.nextInt();
                    cancel(col2, row2);
                    break;
                case 3:
                    System.out.println("Exiting the program..");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please restart the program.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1.Book");
        System.out.println("2.Cancel");
        System.out.println("3.Exit");
    }

    public static void book(char column, int row) {
        int rowIndex = row - 1;
        int columnIndex = column - 'A';

        if (rowIndex < 0 || rowIndex >= ROWS || columnIndex < 0 || columnIndex >= COLUMNS) {
            System.out.println("The seat you chose doesn't exist!");
            return;
        }

        if (array[rowIndex][columnIndex]) {
            System.out.println("Already booked!");
            return;
        }

        array[rowIndex][columnIndex] = true;
        System.out.println("Seat booked successfully!");
    }

    public static void cancel(char column, int row) {
        int rowIndex = row - 1;
        int columnIndex = column - 'A';

        if (rowIndex < 0 || rowIndex >= ROWS || columnIndex < 0 || columnIndex >= COLUMNS) {
            System.out.println("The seat you chose doesn't exist!");
            return;
        }

        if (!array[rowIndex][columnIndex]) {
            System.out.println("The seat is already free!");
            return;
        }

        array[rowIndex][columnIndex] = false;
        System.out.println("Seat cancelled successfully!");
    }
}
