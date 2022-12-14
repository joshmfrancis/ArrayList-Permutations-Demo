/*
 * File: ArrayList.java
 * Author: Joshua Francis
 * Concentration: SD
 * Date: 08/25/2022
 * Java class description: This class holds the main method which makes an array
 * used for testing a few concepts in ArrayList. The first ArrayList 'arr1' is 
 * for showing random numbers in an ArrayList and printing of the valuies in it,
 * the second ArrayList 'arr2' is a numbered 1-12 arrayList (Printed Near The End) 
 * , the third ArrayList 'arr3' is a Copy of the Original ArrayList for use of
 * scrambleing in the fourth Arraylist 'arr4'. These are all achieved using loops! 
 */

// Imports
import java.util.ArrayList;
import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {

        // Random Object, ArrayList Object, size of ArrayList, 
        // and amount of ints removed used in the program
        Random random = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>(); // Original Array
        ArrayList<Integer> arr2 = new ArrayList<>(); // Numbered Array
        ArrayList<Integer> arr3 = new ArrayList<>(); // Copy of Original Array
        ArrayList<Integer> arr4 = new ArrayList<>(); // Scrambled Copy of Original Array

        int sizeOfArrayList1 = 12;
        int sizeOfArrayList2 = 12;
        int sizeOfArrayList4 = 12;

        int removalSize = 10;

        // Point #5
        // First loop to gemerate random integers from 10 to 50
        for (int i = 0; i < sizeOfArrayList1; i++) {
            int randomNumber = random.nextInt(41) + 10;
            arr1.add(randomNumber);
            arr3.add(randomNumber); //Allows for the same random number to be
            // stored for both the original array 'arr1' and the copy of the
            // original array 'arr3' for use in #9

        }

        // Prints the original ArrayList
        System.out.println("Original ArrayList: " + arr1);

        //For spacing 
        System.out.println();

        // Point #6 
        //Second Loop to prints the values in the array list 
        for (int k = 0; k < arr1.size(); k++) {
            System.out.println("Value at position #" + k + ": " + arr1.get(k));
        }

        //For spacing 
        System.out.println();

        // Point #7
        // Third loop to remove 10 random ints from the ArrayList and displays 
        // the value removed, at what position, and the remaining values
        for (int l = 0; l < removalSize; l++) {
            int randomIndex = random.nextInt(arr1.size());
            Integer removed1 = arr1.get(randomIndex);
            arr1.remove(removed1);
            System.out.println("Value Removed: " + removed1 + ", at postition: "
                    + randomIndex + ", Remaining Values: " + arr1);
        }

        //For spacing 
        System.out.println();

        // Point #8
        // Fourth loop to prints the 1-12 Numbered ArrayList
        for (int j = 0; j < sizeOfArrayList4; j++) {
            arr2.add(j + 1);
            // Answers / Pertains to Question #8 | No, but at 
            // the start I do. The values are assigned 1 through 12, but as the 
            // program goes on, it removes a random value at a random position 
            // each run, therefore making each run different. The program ends 
            // up with 2 random values that are different each run. 
        }

        System.out.println("Numbered ArrayList: " + arr2);

        // For spacing 
        System.out.println();

        // Point #9
        System.out.println("Copy of Original Array Before Scramble: " + arr3);

        // Point/Question #9 
        // Fourth loop for showing how you can programmatically create a random permutation of a set of elements (arr3 -> arr4)
        for (int m = 0; m < sizeOfArrayList2; m++) {
            int randomIndex2 = random.nextInt(arr3.size());
            Integer removed2 = arr3.get(randomIndex2);
            arr3.remove(removed2);
            arr4.add(removed2);
        }

        System.out.println("Copy of Original Array After Scramble: " + arr4);
    }

}
