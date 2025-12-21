package gr.aueb.cf.cf9.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project01 {

    public static void main(String[] args) throws Exception{

        //Create the list to store the numbers read by the file
        //Declare the file
        ArrayList<Integer> dynamicList = new ArrayList<>();
        File numbers = new File("numbers.txt");

        //Create and read the file, check if the number is valid and put it in the list
        //Also catch file not found exception so it doesn't break. If the file doesn't exist
        //the program has no reason to continue.
        try {
            Scanner readFile = new Scanner(numbers);
            readFile.useDelimiter("[^0-9]+");

            while (readFile.hasNext()) {
                if (readFile.hasNextInt()) {
                    int token = readFile.nextInt();
                    if (token >= 1 && token <= 49) {
                        dynamicList.add(token);
                    }
                } else readFile.next();
            }
            readFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
            System.exit(1);
        }

        //check if the list we created is valid
        if (dynamicList.size() <= 6 || dynamicList.size() > 49) {
            System.out.println("The numbers quantity should be between 7 and 49!");
            return;
        }

        //transform the list into an array because the exercise wants an array and then sort it.
        int[] array = new int[dynamicList.size()];
        for (int i = 0; i < dynamicList.size(); i++) {
            array[i] = dynamicList.get(i);
        }
        Arrays.sort(array);

        // Run through every possible combination.
        // At the last loop, create the new array and store the random 6 elements.
        // Check if these 6 elements are valid using our methods.
        // If they are, print the lucky numbers.
        for (int i = 0; i < array.length - 5; i++) {
            for (int j = i + 1; j < array.length - 4; j++) {
                for (int k = j + 1; k < array.length -3; k++) {
                    for (int l = k + 1; l < array.length - 2; l++) {
                        for (int m = l + 1; m < array.length - 1; m++) {
                            for (int n = m + 1; n < array.length; n++) {
                                int[] currentLotteryTicket = new int[] {array[i], array[j], array[k], array[l],
                                        array[m], array[n]};
                                if (!isMoreThan4Even(currentLotteryTicket) && !isMoreThan4Odd(currentLotteryTicket) &&
                                !isMoreThan2Contiguous(currentLotteryTicket) && !isMoreThan3SameEnding(currentLotteryTicket) &&
                                !isMoreThan3SameDecade(currentLotteryTicket)) {
                                    System.out.println("Valid numbers: ");
                                    for (int el : currentLotteryTicket) {
                                        System.out.print(el + " ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks if there are more than 4 even numbers in the input array
     * @param array     the input array
     * @return          true if > 4, false if <= 4
     */
    public static boolean isMoreThan4Even(int[] array) {
        int count = 0;
        for (int el : array) {
            if (el % 2 == 0) count++;
        }
        return count > 4;
    }

    /**
     * Checks if there are more than 4 odd numbers in the input array
     * @param array     the array we pass as input
     * @return          true if > 4, false if <= 4
     */
    public static boolean isMoreThan4Odd(int[] array) {
        int count = 0;
        for (int el : array) {
            if (el % 2 != 0) count++;
        }
        return count > 4;
    }

    /**
     * Checks if there are 3 contiguous numbers (2-3-4, 7-8-9 etc.)
     * @param array     the array we pass as input
     * @return          true if 3 or more, false if < 3
     */
    public static boolean isMoreThan2Contiguous(int[] array) {
            for (int i = 0; i <= 3; i++) {
                if (array[i] == array[i + 1] - 1 && array[i + 1] == array[i + 2] - 1) {
                    return true;
                }
            }
        return false;
    }

    /**
     * Checks if there are more than 3 elements that have
     * the same ending.
     * @param array     the array as input
     * @return          true if 4 or more, false if <= 3
     */
    public static boolean isMoreThan3SameEnding(int[] array) {
        int[] tempArr = new int[10];
        for (int el : array) {
            int lastDigit = el % 10;
            tempArr[lastDigit]++;
        }
        for (int el : tempArr) {
            if (el > 3) return true;
        }
        return false;
    }

    /**
     * Checks if there are more than 3 elements in the array
     * that belong to the same decade.
     * @param array     the input array
     * @return          true if 4 or more in tha same decade,
     *                  false if <= 3
     */
    public static boolean isMoreThan3SameDecade(int[] array) {
        int[] tempArray = new int[5];
        for (int el : array) {
            int decade = el / 10;
            tempArray[decade]++;
        }
        for (int el : tempArray) {
            if (el > 3) return true;
        }
        return false;
    }
}
