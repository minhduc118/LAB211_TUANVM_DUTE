/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oftion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        //step 1 : user enter input a positive decimal number.
        int sizeOfArray = inputPositiveNumber();
        //step 2 : enter search value is decimal number .
        int searchValue = inputSearchValue();
        //step 3 : cteate Array .general random integer in number range 
        int[] array = createArray(sizeOfArray);
        //step 4 : display Array 
        displayArray(array, "The array:");
        //step 5 : display index of search value 
        displayIndex(array, searchValue);

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

                // 3 check sieofarray equa zero 
                if (sizeOfArray == 0) {
                    System.out.println("Input is equa zero . Try again ");
                    continue;
                }

                // 4 check sizeofarray negative 
                if (sizeOfArray < 0) {
                    System.out.println("Input is negative . Try again");
                    continue;
                }
                // 5 check sizeofarray not real number 
                if (sizeOfArray != (int) sizeOfArray) {
                    System.out.println("Input is not real number . Try again");
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

    private static void displayArray(int[] array, String message) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    // 1 vi tri
//
//    private static void displayIndex(int[] array, int searchValue) {
//        System.out.printf("Found %d at index : ",searchValue);
//        boolean check = false;
//        for ( int i = 0 ; i < array.length; i ++){
//            if ( array[i] == searchValue){
//                System.out.print(i);
//                check=true;
//                break;
//            }
//        }
//        if ( !check ){
//            System.out.println("Not Found");
//        }
//    }
    // nhieu vi tri 
    private static void displayIndex(int[] array, int searchValue) {
        List<Integer> list = searchBylinearSearch(array,searchValue);
        if (list.isEmpty()) {
            System.out.println("NOT Found");

        } else {
            System.out.printf("Found %d at index:" + list.toString(), searchValue);
        }

    }

    private static List<Integer> searchBylinearSearch(int[] array, int searchValue) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                list.add(i); 
            }
        }
        return list;
    }

    

}
