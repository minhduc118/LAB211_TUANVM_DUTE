# LAB211 Assignment

| | |
|---|---|
| **Type:** | Short Assignment |
| **Code:** | J1.S.P0010 |
| **LOC:** | 50 |
| **Slot(s):** | 1 |

## Title
**Linear search algorithm.**

## Background Context
Linear search or sequential search is a method for finding a particular value in a list that consists of checking every one of its elements, one at a time and in sequence, until the desired one is found.

Linear search is the simplest search algorithm. For a list with n items, the best case is when the value is equal to the first element of the list, in which case only one comparison is needed. The worst case is when the value is not in the list (or occurs only once at the end of the list), in which case n comparisons are needed.

## Program Specifications
Design a program that allows users to input the number of array. Generate random integer in number range input. After that allows users to input search number. Display the array and index of search number in array.

### Function details:
1. **Display a screen to prompt users to input a positive decimal number.**
   - Users run the program, display a screen to ask users to enter a number of array and a search number.
   - Users input a positive decimal number. Then, perform **Function 2**.

2. **Display the found index in array.**
   - Generate random integer in number range for each array element.
   - Display the array
   - Display the index of search number in array.

## Expectation of User Interface
```
Enter number of array:
10
Enter search value:
5
The array: [2, 2, 5, 2, 6, 9, 9, 8, 9, 8]
Found 5 at index: 2
```

## Guidelines

### Algorithm
1. Start from the leftmost element of array and one by one compare x with each element of array.
2. If x matches with an element, return the index.
3. If x doesn't match with any of elements, return -1 (not found).

### Example
**Search for value 5 in array [2, 2, 5, 2, 6, 9, 9, 8, 9, 8]:**

| Index | Value | Action |
|-------|-------|--------|
| 0 | 2 | 2 ≠ 5, continue |
| 1 | 2 | 2 ≠ 5, continue |
| 2 | 5 | 5 = 5, **found!** |

**Result:** Found 5 at index: 2

## Notes
- Linear search có độ phức tạp thời gian O(n) trong trường hợp xấu nhất
- Độ phức tạp không gian O(1) - chỉ cần một vài biến tạm
- Thuật toán đơn giản, dễ hiểu và dễ triển khai
- Không yêu cầu mảng phải được sắp xếp trước
