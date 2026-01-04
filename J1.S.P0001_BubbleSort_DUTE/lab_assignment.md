# LAB211 Assignment

| | |
|---|---|
| **Type:** | Short Assignment |
| **Code:** | J1.S.P0001 |
| **LOC:** | 40 |
| **Slot(s):** | 1 |

## Title
**Bubble sort algorithm.**

## Background Context
Bubble sort is a simple and well-known sorting algorithm. It is used in practice once in a blue moon and its main application is to make an introduction to the sorting algorithms. Bubble sort belongs to O(n²) sorting algorithms, which makes it quite inefficient for sorting large data volumes. Bubble sort is **stable** and **adaptive**.

## Program Specifications
Design a program that allows users to input the number of array. Generate random integer in number range input. Display unsorted array and sorted array using bubble sort.

### Function details:
1. **Display a screen to prompt users to input a positive decimal number.**
   - Users run the program, display a screen to ask users to enter a positive decimal number.
   - Users input a positive decimal number. Then, perform **Function 2**.

2. **Display & sort array.**
   - Generate random integer in number range for each array element.
   - Display array before and after sorting.

## Expectation of User Interface
```
Enter number of array:
10
Unsorted array: [2, 6, 3, 6, 8, 6, 1, 2, 9, 8]
Sorted array: [1, 2, 2, 3, 6, 6, 6, 8, 8, 9]BUILD SUCCESSFUL (total time: 1 second)
```

## Guidelines

### Algorithm
1. Compare each pair of adjacent elements from the beginning of an array and, if they are in reversed order, swap them.
2. If at least one swap has been done, repeat step 1.

You can imagine that on every step big bubbles float to the surface and stay there. At the step, when no bubble moves, sorting stops. Let us see an example of sorting an array to make the idea of bubble sort clearer.

### Example
**Sort {5, 1, 12, -5, 16} using bubble sort.**

| Array State | Action |
|-------------|--------|
| `[5] [1] [12] [-5] [16]` | **unsorted** |
| `[5] [1] [12] [-5] [16]` | **5 > 1, swap** |
| `[1] [5] [12] [-5] [16]` | 5 < 12, ok |
| `[1] [5] [12] [-5] [16]` | **12 > -5, swap** |
| `[1] [5] [-5] [12] [16]` | 12 < 16, ok |
| `[1] [5] [-5] [12] [16]` | 1 < 5, ok |
| `[1] [5] [-5] [12] [16]` | **5 > -5, swap** |
| `[1] [-5] [5] [12] [16]` | 5 < 12, ok |
| `[1] [-5] [5] [12] [16]` | **1 > -5, swap** |
| `[-5] [1] [5] [12] [16]` | 1 < 5, ok |
| `[-5] [1] [5] [12] [16]` | -5 < 1, ok |
| `[-5] [1] [5] [12] [16]` | **sorted** |

## Notes
- Bubble sort có độ phức tạp thời gian O(n²) trong trường hợp xấu nhất và trung bình
- Độ phức tạp không gian O(1) - chỉ cần một vài biến tạm
- Thuật toán **stable**: giữ nguyên thứ tự tương đối của các phần tử bằng nhau
- Thuật toán **adaptive**: hoạt động hiệu quả hơn với dữ liệu đã gần như được sắp xếp
