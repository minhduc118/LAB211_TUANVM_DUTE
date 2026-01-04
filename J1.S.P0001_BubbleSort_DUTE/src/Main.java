
import java.util.*;

/**
 * The Main class implements the Bubble Sort algorithm. It allows users to input
 * the size of an array and the array values, sorts the array using Bubble Sort,
 * and displays the sorting steps.
 *
 * @author ADMIN
 */
public class Main {

   /**
     * The main method is the entry point of the application.
     * 
     * Input format:
     * - Line 1: Size of array (positive integer)
     * - Line 2: Array values separated by space
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Step 1: User enters the size of the array
        int size = sc.nextInt();

        // Step 2: Create array with user input values
        int[] array = createArray(size, sc);

        // Step 3: Sort the array using Bubble sort algorithm (with debug display)
        bubbleSort(array);

        // Step 4: Display the final sorted array
        System.out.print("Sorted array: ");
        displayArray(array);
    }

    /**
     * Creates an array of the specified size and reads values from user input.
     * 
     * @param size the size of the array to create
     * @param sc   the Scanner object for input
     * @return an array filled with user input values
     */
    private static int[] createArray(int size, Scanner sc) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     * Displays the elements of the array in format: [e1, e2, e3]
     * 
     * @param array the array to display
     */
    private static void displayArray(int[] array) {
        if (array.length == 0) {
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    /**
     * Sorts the given array using the Bubble Sort algorithm with optimization.
     * Uses a swapped flag to detect if array is already sorted and break early.
     * Displays each comparison step during sorting.
     * 
     * @param array the array to sort
     */
    private static void bubbleSort(int[] array) {
        boolean swapped;

        // Display "unsorted" at the beginning
        displayArray(array);
        System.out.println("\tunsorted");

        // Outer loop: after each iteration, one element is sorted at the end
        for (int i = 0; i < array.length; i++) {
            swapped = false;

            // Inner loop: compare adjacent elements up to unsorted portion
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Display before swap
                    displayArray(array);
                    System.out.println("\t" + array[j] + " > " + array[j + 1] + ", swap");

                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                } else {
                    // No swap needed
                    displayArray(array);
                    System.out.println("\t" + array[j] + " < " + array[j + 1] + ", ok");
                }
            }

            // Optimization: If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }

        // Display final sorted state
        displayArray(array);
        System.out.println("\tsorted");
    }

}
