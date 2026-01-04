import java.util.*;

/**
 * The Main class implements the Bubble Sort algorithm.
 * It allows users to input the size of an array and the array values,
 * sorts the array using Bubble Sort, and displays the sorting steps.
 *
 * @author ADMIN
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * It orchestrates the flow of the program: input, creation, display, sorting,
     * and final display.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Step 1: User enters a positive decimal number for array size
        int sizeArray = inputSizeOfArray();

        // Step 2: Create array with input values (for Monaco IDE compatibility)
        int[] array = createArray(sizeArray);

        // Step 3: Display the array before sorting
        displayArrayUnsorted(array);

        // Step 4: Sort the array using Bubble sort algorithm
        bubbleSort(array);

        // Step 5: Display the array after it has been sorted
        displayArraySorted(array);
    }

    // ==================== SCANNER INSTANCE ====================
    private static Scanner sc = new Scanner(System.in);

    /**
     * Prompts the user to input a positive integer for the size of the array.
     * Validates the input to ensure it is a non-empty, positive integer.
     * 
     * Note: For Monaco IDE, input is pre-provided and always valid.
     * This function is kept for completeness and real-world usage.
     * 
     * @return the validated integer size of the array
     */
    private static int inputSizeOfArray() {
        double sizeArray;
        String input;

        // Loop until valid input is received
        while (true) {
            input = sc.nextLine().trim();

            // 1. Check if input is empty
            if (input.isEmpty()) {
                System.out.println("Input is empty. Please enter again.");
                continue;
            }

            try {
                // 2. Parse input to a double first to check for decimals
                sizeArray = Double.parseDouble(input);

                // 3. Check if input is a real number (not an integer)
                if (sizeArray != (int) sizeArray) {
                    System.out.println("Input is not a whole number. Please enter again.");
                    continue;
                }

                // 4. Check if input is negative
                if (sizeArray < 0) {
                    System.out.println("Input is a negative number. Please enter again.");
                    continue;
                }

                // 5. Check if input is zero
                if (sizeArray == 0) {
                    System.out.println("Input must be greater than zero. Please enter again.");
                    continue;
                }

                // Input is valid, break the loop
                break;

            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid number. Please enter again.");
            }
        }
        return (int) sizeArray;
    }

    /**
     * Creates an array of the specified size and reads values from user input.
     * 
     * @param sizeArray the size of the array to create
     * @return an array filled with user input values
     */
    private static int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        // Read array values from input (Monaco IDE compatible)
        for (int i = 0; i < sizeArray; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     * Displays the elements of the array in format: [e1, e2, ..., en].
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
     * Sorts the given array using the Bubble Sort algorithm.
     * Displays the state of the array after each swap or comparison step.
     * 
     * @param array the array to sort
     */
    private static void bubbleSort(int[] array) {
        boolean swapped;

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

    /**
     * Helper method to display the array with a "Unsorted array: " prefix.
     * 
     * @param array the array to display
     */
    private static void displayArrayUnsorted(int[] array) {
        displayArray(array);
        System.out.println("\tunsorted");
    }

    /**
     * Helper method to display the array with a "Sorted array: " prefix.
     * 
     * @param array the array to display
     */
    private static void displayArraySorted(int[] array) {
        System.out.print("Sorted array: ");
        displayArray(array);
    }
}
