# Linear Search Algorithm - Test Cases

## Input Format
- Dòng 1: Kích thước mảng `n` (số nguyên dương)
- Dòng 2: Giá trị cần tìm `search value`
- Dòng 3: Dãy số array gồm `n` phần tử (cách nhau bởi khoảng trắng)

## Output Format
```
Enter number of array:
Enter search value:
The array: [e1, e2, ..., en]
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
The array: [5, 1, 4, 3, 2]
Found 3 at index: 3
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
The array: [1, 2, 3, 4, 5]
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
The array: [7]
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
The array: [10]
NOT FOUND
```

---

### TC5 - Tìm thấy ở đầu mảng (Best Case)
**Input:**
```
5
1
1 2 3 4 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
The array: [1, 2, 3, 4, 5]
Found 1 at index: 0
```

---

### TC6 - Tìm thấy ở cuối mảng (Worst Case)
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
The array: [1, 2, 3, 4, 5]
Found 5 at index: 4
```

---

### TC7 - Mảng có phần tử trùng nhau (Trả về index đầu tiên)
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
The array: [5, 2, 1, 2, 2]
Found 2 at index: 1
```

---

### TC8 - Mảng 2 phần tử (Hidden)
**Input:**
```
2
9
9 3
```
**Expected Output:**
```
Enter number of array:
Enter search value:
The array: [9, 3]
Found 9 at index: 0
```

---

### TC9 - Mảng số lớn (Hidden)
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
The array: [10, 500, 100, 20, 1000]
Found 100 at index: 2
```

---

### TC10 - Mảng toàn số giống nhau (Hidden)
**Input:**
```
4
5
5 5 5 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
The array: [5, 5, 5, 5]
Found 5 at index: 0
```

---

### TC11 - Tìm số 0 (Hidden)
**Input:**
```
5
0
1 0 3 0 5
```
**Expected Output:**
```
Enter number of array:
Enter search value:
The array: [1, 0, 3, 0, 5]
Found 0 at index: 1
```

---

### TC12 - Mảng 10 phần tử (Hidden)
**Input:**
```
10
8
2 2 5 2 6 9 9 8 9 8
```
**Expected Output:**
```
Enter number of array:
Enter search value:
The array: [2, 2, 5, 2, 6, 9, 9, 8, 9, 8]
Found 8 at index: 7
```

---

## INPUT DATA ONLY (Copy-Paste for Grading)

**Case 1 (Basic - Found)**:
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

**Case 4 (Duplicates - First Index)**:
```
5
2
5 2 1 2 2
```

**Case 5 (First Element)**:
```
5
1
1 2 3 4 5
```

---

## BẢNG TÓM TẮT

| # | Input Size | Search Value | Loại | Mô tả |
|---|------------|--------------|------|-------|
| 1 | 5 | 3 | Visible | Tìm thấy cơ bản |
| 2 | 5 | 10 | Visible | Không tìm thấy |
| 3 | 1 | 7 | Visible | Mảng 1 phần tử (found) |
| 4 | 1 | 5 | Visible | Mảng 1 phần tử (not found) |
| 5 | 5 | 1 | Visible | Best Case (đầu mảng) |
| 6 | 5 | 5 | Visible | Worst Case (cuối mảng) |
| 7 | 5 | 2 | Hidden | Phần tử trùng |
| 8 | 2 | 9 | Hidden | Mảng 2 phần tử |
| 9 | 5 | 100 | Hidden | Số lớn |
| 10 | 4 | 5 | Hidden | Toàn số giống nhau |
| 11 | 5 | 0 | Hidden | Tìm số 0 |
| 12 | 10 | 8 | Hidden | Mảng 10 phần tử |
