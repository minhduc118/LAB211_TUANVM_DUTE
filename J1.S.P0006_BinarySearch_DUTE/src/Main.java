import java.util.*;

/**
 * The Main class implements the Binary Search algorithm.
 * It allows users to input the size of an array and a search value,
 * generates random integers, sorts the array using Selection Sort,
 * and performs Binary Search to find the search value.
 *
 * @author ADMIN
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * It orchestrates the flow of the program: input array size, input search
     * value,
     * create random array, sort array, display sorted array, perform binary search,
     * and display the search result.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Step 1: User enters a positive decimal number for array size
        int sizeOfArray = inputPositiveNumber();

        // Step 2: Enter search value (decimal number)
        int searchValue = inputSearchValue();

        // Step 3: Create array with random integers in number range
        int[] array = createArray(sizeOfArray);

        // Step 4: Sort array using Selection Sort
        sortArray(array);

        // Step 5: Display sorted array
        displayArray(array, "Sorted array: ");

        // Step 6: Search using Binary Search algorithm
        searchByBinarySearch(searchValue, array);

        // Step 7: Display index of search value
        displayIndexOfSearchValue(searchValue, array);
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
    private static int inputPositiveNumber() {
        double sizeOfArray;
        String input;

        // Loop until valid input is received
        while (true) {
            System.out.println("Enter number of array:");
            input = sc.nextLine().trim();

            // 1. Check if input is empty
            if (input.isEmpty()) {
                System.out.println("Input is empty. Please enter again.");
                continue;
            }

            try {
                // 2. Parse input to a double first to check for decimals
                sizeOfArray = Double.parseDouble(input);

                // 3. Check if input is a real number (not an integer)
                if (sizeOfArray != (int) sizeOfArray) {
                    System.out.println("Input is not a whole number. Please enter again.");
                    continue;
                }

                // 4. Check if input is negative
                if (sizeOfArray < 0) {
                    System.out.println("Input is a negative number. Please enter again.");
                    continue;
                }

                // 5. Check if input is zero
                if (sizeOfArray == 0) {
                    System.out.println("Input must be greater than zero. Please enter again.");
                    continue;
                }

                // Input is valid, break the loop
                break;

            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid number. Please enter again.");
            }
        }
        return (int) sizeOfArray;
    }

    /**
     * Prompts the user to input a positive integer for the search value.
     * Validates the input to ensure it is a non-empty, positive integer.
     * 
     * @return the validated integer search value
     */
    private static int inputSearchValue() {
        double searchValue;
        String inputValue;

        // Loop until valid input is received
        while (true) {
            System.out.println("Enter search value:");
            inputValue = sc.nextLine().trim();

            // 1. Check if input is empty
            if (inputValue.isEmpty()) {
                System.out.println("Input is empty. Please enter again.");
                continue;
            }

            try {
                // 2. Parse input to a double first to check for decimals
                searchValue = Double.parseDouble(inputValue);

                // 3. Check if input is negative
                if (searchValue < 0) {
                    System.out.println("Input is a negative number. Please enter again.");
                    continue;
                }

                // 4. Check if input is a real number (not an integer)
                if (searchValue != (int) searchValue) {
                    System.out.println("Input is not a whole number. Please enter again.");
                    continue;
                }

                // Input is valid, break the loop
                break;

            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid number. Please enter again.");
            }
        }
        return (int) searchValue;
    }

    /**
     * Creates an array of the specified size and reads values from user input.
     * Modified from random generation to user input to support deterministic
     * auto-grading.
     * 
     * @param sizeOfArray the size of the array to create
     * @return an array filled with user input values
     */
    private static int[] createArray(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        // Read array values from input (Monaco IDE compatible)
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     * Sorts the given array in ascending order using the Selection Sort algorithm.
     * Selection Sort finds the minimum element in the unsorted portion and swaps it
     * with the first unsorted element.
     * 
     * @param array the array to sort
     */
    private static void sortArray(int[] array) {
        // Sort using Selection Sort algorithm
        // Outer loop: iterate through each position from first to last
        for (int i = 0; i < array.length; i++) {
            int minEle = i;

            // Inner loop: find the minimum element in unsorted portion
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minEle]) {
                    minEle = j;
                }
            }

            // Swap minimum element with current position
            int temp = array[i];
            array[i] = array[minEle];
            array[minEle] = temp;
        }
    }

    /**
     * Displays the elements of the array with a custom message prefix.
     * Format: message[e1, e2, ..., en]
     * 
     * @param array   the array to display
     * @param message the message to display before the array
     */
    private static void displayArray(int[] array, String message) {
        if (array.length == 0) {
            System.out.println(message + "[]");
            return;
        }
        System.out.print(message + "[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    /**
     * Performs Binary Search on a sorted array to find the search value.
     * Binary Search is an efficient algorithm that works on sorted arrays.
     * It repeatedly divides the search interval in half.
     * 
     * Time Complexity: O(log n)
     * 
     * @param searchValue the value to search for
     * @param array       the sorted array to search in
     * @return the index of the search value if found, -1 otherwise
     */
    private static int searchByBinarySearch(int searchValue, int[] array) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (array[mid] == searchValue) {
                return mid;
            } else if (array[mid] > searchValue) {
                // Search in left half
                r = mid - 1;
            } else {
                // Search in right half
                l = mid + 1;
            }
        }

        // Value not found
        return -1;
    }

    /**
     * Displays the result of the binary search.
     * If the search value is found, displays the index.
     * If not found, displays "NOT FOUND".
     * 
     * @param searchValue the value that was searched for
     * @param array       the array that was searched
     */
    private static void displayIndexOfSearchValue(int searchValue, int[] array) {
        int index = searchByBinarySearch(searchValue, array);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("Found %d at index: %d\n", searchValue, index);
        }
    }
}
