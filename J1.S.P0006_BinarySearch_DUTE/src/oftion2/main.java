/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oftion2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {

        //step 1 : user enter input a positive decimal number.
        int sizeOfArray = inputPositiveNumber();
        //step 2 : enter search value is decimal number .
        int searchValue = inputSearchValue();
        //step 3 : cteate Array .general random integer in number range 
        int[] array = createArray(sizeOfArray);
        //step 4 : sort Array
        sortArray(array);
        //step 5 : display Array 
        displayArray(array, "Sorted array");
        // step 6 : search by binarysearch
        searchByBirarySearch(searchValue, array);
        //step 7 : display index of search value 
        displayIndexOfSearchValue(searchValue, array);

    }

    private static int inputPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        double sizeOfArray;
        String input;
        while (true) {
            System.out.println("Enter number of array:");
            input = sc.nextLine().trim();
            // 1 check sizeofArray is empty
            if (input.isEmpty()) {
                System.out.println("Input is empty .  Try again");
                continue;
            }

            // 2 check sizeofarray is character 
            try {
                sizeOfArray = Double.parseDouble(input);

                // 3 check sizeofarray not real number 
                if (sizeOfArray != (int) sizeOfArray) {
                    System.out.println("Input is not real number . Try again");
                    continue;
                }

                // 4 check sizeofarray negative 
                if (sizeOfArray < 0) {
                    System.out.println("Input is negative . Try again");
                    continue;
                }

                // 5 check sieofarray equa zero 
                if (sizeOfArray == 0) {
                    System.out.println("Input is equa zero . Try again ");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Input is character . Try again");
            }

        }
        return (int) sizeOfArray;
    }

    private static int inputSearchValue() {
        Scanner sc = new Scanner(System.in);
        double searchValue;
        String inputvalue;
        while (true) {
            System.out.println("Enter search value:");
            inputvalue = sc.nextLine().trim();
            // 1 check input is empty
            if (inputvalue.isEmpty()) {
                System.out.println("Input is empty .  Try again");
                continue;
            }

            // 2 check input searchValue is character 
            try {
                searchValue = Double.parseDouble(inputvalue);

                // 3 check input searchValue negative 
                if (searchValue < 0) {
                    System.out.println("Input is negative . Try again");
                    continue;
                }
                // 4 check input searchValue not real number 
                if (searchValue != (int) searchValue) {
                    System.out.println("Input is not real number . Try again");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Input is character . Try again");
            }

        }
        return (int) searchValue;
    }

    private static int[] createArray(int sizeOfArray) {
        Random rd = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length);
        }
        return array;
    }

    private static void sortArray(int[] array) {
        // sort by selection sort 
        // 2 loop 
        // 1 loop fistindext to last index 
        for (int i = 0; i < array.length; i++) {
            int minEle = i;
            // 2 loop minElement go fist array
            for (int j = 1 + i; j < array.length; j++) {
                if (array[j] < array[minEle]) {
                    minEle = j;
                }
            }
            int temp = array[i];
            array[i] = array[minEle];
            array[minEle] = temp;
        }
    }

    // 1 vi tri 
    private static void displayArray(int[] array, String message) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }


    private static int searchByBirarySearch(int searchValue, int[] array) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (array[mid] == searchValue) {
                return mid;
            } else if (array[mid] > searchValue) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    private static void displayIndexOfSearchValue(int searchValue, int[] array) {
        int input = searchByBirarySearch(searchValue, array);
        if (input == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("Found %d at index : %d", searchValue,input);
        }

    }
}
