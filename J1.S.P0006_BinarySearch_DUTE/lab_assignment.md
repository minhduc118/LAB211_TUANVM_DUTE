# LAB211 Assignment

| | |
|---|---|
| **Type:** | Short Assignment |
| **Code:** | J1.S.P0006 |
| **LOC:** | 50 |
| **Slot(s):** | 1 |

## Title
**Binary search algorithm.**

## Background Context
Generally, to find a value in unsorted array, we should look through elements of an array one by one, until searched value is found. In case of searched value is absent from array, we go through all elements. In average, complexity of such an algorithm is proportional to the length of the array.

Situation changes significantly, when array is sorted. If we know it, random access capability can be utilized very efficiently to find searched value quick. Cost of searching algorithm reduces to binary logarithm of the array length. For reference, log₂(1 000 000) ≈ 20. It means, that in worst case, algorithm makes 20 steps to find a value in sorted array of a million elements.

## Program Specifications
Design a program that allows users to input the number of array. Generate random integer in number range input. After that allows users to input search number. Display sorted array and index of search number in array.

### Function details:
1. **Display a screen to prompt users to input a positive decimal number.**
   - Users run the program, display a screen to ask users to enter a number of array.
   - Users input a positive decimal number.

2. **Display a screen to prompt users to input search value.**
   - Ask users to enter a search number.

3. **Generate random array and Sort.**
   - Generate random integer in number range for each array element.
   - Sort array (using Bubble Sort or Selection Sort).

4. **Display the found index in array.**
   - Display the index of search number in array using Binary Search algorithm.
   - If not found, display appropriate message.

## Expectation of User Interface
```
Enter number of array:
10
Enter search value:
4
Sorted array: [1, 1, 1, 1, 3, 4, 6, 8, 9, 9]
Found 4 at index: 5
```

## Guidelines

### Algorithm
1. First, sort the array if it is not sorted.
2. Initialize `left = 0`, `right = n - 1`.
3. Loop while `left <= right`:
   - `mid = (left + right) / 2`
   - If `arr[mid] == x`, return `mid`.
   - If `arr[mid] < x`, `left = mid + 1`.
   - If `arr[mid] > x`, `right = mid - 1`.
4. Return -1 if not found.
