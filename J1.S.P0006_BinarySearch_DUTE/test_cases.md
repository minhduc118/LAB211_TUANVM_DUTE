# Binary Search Algorithm - Test Cases

## Input Format
- Dòng 1: Kích thước mảng `n` (số nguyên dương)
- Dòng 2: Giá trị cần tìm `search value`
- Dòng 3: Dãy số array gồm `n` phần tử (cách nhau bởi khoảng trắng hoặc xuống dòng)

## Output Format
```
Enter number of array:
Enter search value:
Sorted array: [e1, e2, ..., en]
Found X at index: Y
(hoặc NOT FOUND)
```

---

## WEB-READY TEST CASES (Deterministic)

### TC1 - Tìm thấy giá trị (Test Cơ Bản)
**Input:**
```
5
3
5 1 4 3 2
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [1, 2, 3, 4, 5]
Found 3 at index: 2
```

---

### TC2 - Không tìm thấy giá trị
**Input:**
```
5
10
1 2 3 4 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [1, 2, 3, 4, 5]
NOT FOUND
```

---

### TC3 - Mảng 1 phần tử (Tìm thấy)
**Input:**
```
1
7
7
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [7]
Found 7 at index: 0
```

---

### TC4 - Mảng 1 phần tử (Không tìm thấy)
**Input:**
```
1
5
10
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [10]
NOT FOUND
```

---

### TC5 - Mảng có số trùng nhau (Duplicate values)
**Input:**
```
5
2
5 2 1 2 2
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [1, 2, 2, 2, 5]
Found 2 at index: 2
```

---

### TC6 - Tìm kiếm ở biên trái (Min Value)
**Input:**
```
5
1
5 4 3 2 1
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [1, 2, 3, 4, 5]
Found 1 at index: 0
```

---

### TC7 - Tìm kiếm ở biên phải (Max Value)
**Input:**
```
5
5
1 2 3 4 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [1, 2, 3, 4, 5]
Found 5 at index: 4
```

---

### TC8 - Mảng số âm (Negative values)
**Input:**
```
5
-5
-1 -5 0 10 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [-5, -1, 0, 5, 10]
Found -5 at index: 0
```
*(Lưu ý: Input search value phải > 0 nếu theo logic cũ của bài, nhưng thường BinarySearch chấp nhận số âm. File Main.java hiện tại đang validate search value phải > 0. Nếu bạn muốn search số âm thì cần bỏ validation trong `inputSearchValue`. Test case này giả định bạn ĐÃ bỏ validation hoặc nhập số dương.)*
**UPDATE:** Code `Main.java` hiện tại: `if (searchValue < 0) ... continue;`.
Vì vậy, với code hiện tại, **TC8 này không chạy được** trừ khi sửa code cho phép số âm.
Để an toàn cho Auto-grader hiện tại, hãy dùng **TC8B** dưới đây:

### TC8B - Mảng số lớn (Large numbers)
**Input:**
```
5
100
10 500 100 20 1000
```
**Expected Output:**
```
Enter number of array:
Enter search value:
Sorted array: [10, 20, 100, 500, 1000]
Found 100 at index: 2
```

---

## INPUT DATA ONLY (Copy-Paste for Grading)

**Case 1 (Basic)**:
```
5
3
5 1 4 3 2
```

**Case 2 (Not Found)**:
```
5
10
1 2 3 4 5
```

**Case 3 (Single Found)**:
```
1
7
7
```

**Case 4 (Duplicates)**:
```
5
2
5 2 1 2 2
```

**Case 5 (Sorted Check)**:
```
5
3
1 2 3 4 5
```
