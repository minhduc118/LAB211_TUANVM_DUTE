# Bubble Sort Algorithm - Test Cases

## Input Format
- Dòng 1: Kích thước mảng (số nguyên dương)
- Dòng 2: Các giá trị của mảng, cách nhau bởi dấu cách

## Output Format
```
[array]	unsorted
[array]	X > Y, swap  (hoặc X < Y, ok)
...
[array]	sorted
Sorted array: [array]
```

---

## COPY-PASTE CHO MONACO IDE

### TC1 - Ví dụ trong đề bài (Visible)
**Input:**
```
5
5 1 12 -5 16
```
**Expected Output:**
```
[5, 1, 12, -5, 16]	unsorted
[5, 1, 12, -5, 16]	5 > 1, swap
[1, 5, 12, -5, 16]	5 < 12, ok
[1, 5, 12, -5, 16]	12 > -5, swap
[1, 5, -5, 12, 16]	12 < 16, ok
[1, 5, -5, 12, 16]	1 < 5, ok
[1, 5, -5, 12, 16]	5 > -5, swap
[1, -5, 5, 12, 16]	5 < 12, ok
[1, -5, 5, 12, 16]	1 > -5, swap
[-5, 1, 5, 12, 16]	1 < 5, ok
[-5, 1, 5, 12, 16]	-5 < 1, ok
[-5, 1, 5, 12, 16]	sorted
Sorted array: [-5, 1, 5, 12, 16]
```

---

### TC2 - Mảng 1 phần tử (Visible)
**Input:**
```
1
7
```
**Expected Output:**
```
[7]	unsorted
[7]	sorted
Sorted array: [7]
```

---

### TC3 - Mảng 2 phần tử cần swap (Visible)
**Input:**
```
2
9 3
```
**Expected Output:**
```
[9, 3]	unsorted
[9, 3]	9 > 3, swap
[3, 9]	3 < 9, ok
[3, 9]	sorted
Sorted array: [3, 9]
```

---

### TC4 - Mảng 2 phần tử đã sorted (Visible)
**Input:**
```
2
1 5
```
**Expected Output:**
```
[1, 5]	unsorted
[1, 5]	1 < 5, ok
[1, 5]	sorted
Sorted array: [1, 5]
```

---

### TC5 - Mảng đã sắp xếp sẵn - Best Case (Visible)
**Input:**
```
5
1 2 3 4 5
```
**Expected Output:**
```
[1, 2, 3, 4, 5]	unsorted
[1, 2, 3, 4, 5]	1 < 2, ok
[1, 2, 3, 4, 5]	2 < 3, ok
[1, 2, 3, 4, 5]	3 < 4, ok
[1, 2, 3, 4, 5]	4 < 5, ok
[1, 2, 3, 4, 5]	sorted
Sorted array: [1, 2, 3, 4, 5]
```

---

### TC6 - Mảng ngược hoàn toàn - Worst Case (Visible)
**Input:**
```
5
5 4 3 2 1
```
**Expected Output:**
```
[5, 4, 3, 2, 1]	unsorted
[5, 4, 3, 2, 1]	5 > 4, swap
[4, 5, 3, 2, 1]	5 > 3, swap
[4, 3, 5, 2, 1]	5 > 2, swap
[4, 3, 2, 5, 1]	5 > 1, swap
[4, 3, 2, 1, 5]	4 > 3, swap
[3, 4, 2, 1, 5]	4 > 2, swap
[3, 2, 4, 1, 5]	4 > 1, swap
[3, 2, 1, 4, 5]	3 > 2, swap
[2, 3, 1, 4, 5]	3 > 1, swap
[2, 1, 3, 4, 5]	2 > 1, swap
[1, 2, 3, 4, 5]	1 < 2, ok
[1, 2, 3, 4, 5]	sorted
Sorted array: [1, 2, 3, 4, 5]
```

---

### TC7 - Mảng 3 phần tử (Hidden)
**Input:**
```
3
8 2 6
```
**Expected Output:**
```
[8, 2, 6]	unsorted
[8, 2, 6]	8 > 2, swap
[2, 8, 6]	8 > 6, swap
[2, 6, 8]	2 < 6, ok
[2, 6, 8]	sorted
Sorted array: [2, 6, 8]
```

---

### TC8 - Mảng có phần tử trùng nhau (Hidden)
**Input:**
```
5
3 1 3 2 3
```
**Expected Output:**
```
[3, 1, 3, 2, 3]	unsorted
[3, 1, 3, 2, 3]	3 > 1, swap
[1, 3, 3, 2, 3]	3 < 3, ok
[1, 3, 3, 2, 3]	3 > 2, swap
[1, 3, 2, 3, 3]	3 < 3, ok
[1, 3, 2, 3, 3]	1 < 3, ok
[1, 3, 2, 3, 3]	3 > 2, swap
[1, 2, 3, 3, 3]	3 < 3, ok
[1, 2, 3, 3, 3]	1 < 2, ok
[1, 2, 3, 3, 3]	2 < 3, ok
[1, 2, 3, 3, 3]	sorted
Sorted array: [1, 2, 3, 3, 3]
```

---

### TC9 - Mảng chứa số âm và dương (Hidden)
**Input:**
```
5
-5 10 0 -1 5
```
**Expected Output:**
```
[-5, 10, 0, -1, 5]	unsorted
[-5, 10, 0, -1, 5]	-5 < 10, ok
[-5, 10, 0, -1, 5]	10 > 0, swap
[-5, 0, 10, -1, 5]	10 > -1, swap
[-5, 0, -1, 10, 5]	10 > 5, swap
[-5, 0, -1, 5, 10]	-5 < 0, ok
[-5, 0, -1, 5, 10]	0 > -1, swap
[-5, -1, 0, 5, 10]	0 < 5, ok
[-5, -1, 0, 5, 10]	-5 < -1, ok
[-5, -1, 0, 5, 10]	-1 < 0, ok
[-5, -1, 0, 5, 10]	sorted
Sorted array: [-5, -1, 0, 5, 10]
```

---

### TC10 - Mảng toàn số âm (Hidden)
**Input:**
```
4
-3 -1 -5 -2
```
**Expected Output:**
```
[-3, -1, -5, -2]	unsorted
[-3, -1, -5, -2]	-3 < -1, ok
[-3, -1, -5, -2]	-1 > -5, swap
[-3, -5, -1, -2]	-1 > -2, swap
[-3, -5, -2, -1]	-3 > -5, swap
[-5, -3, -2, -1]	-3 < -2, ok
[-5, -3, -2, -1]	-5 < -3, ok
[-5, -3, -2, -1]	sorted
Sorted array: [-5, -3, -2, -1]
```

---

### TC11 - Mảng toàn số 0 (Hidden)
**Input:**
```
4
0 0 0 0
```
**Expected Output:**
```
[0, 0, 0, 0]	unsorted
[0, 0, 0, 0]	0 < 0, ok
[0, 0, 0, 0]	0 < 0, ok
[0, 0, 0, 0]	0 < 0, ok
[0, 0, 0, 0]	sorted
Sorted array: [0, 0, 0, 0]
```

---

### TC12 - Mảng số lớn (Hidden)
**Input:**
```
3
999 -999 0
```
**Expected Output:**
```
[999, -999, 0]	unsorted
[999, -999, 0]	999 > -999, swap
[-999, 999, 0]	999 > 0, swap
[-999, 0, 999]	-999 < 0, ok
[-999, 0, 999]	sorted
Sorted array: [-999, 0, 999]
```

---

### TC13 - Mảng 4 phần tử hỗn hợp (Hidden)
**Input:**
```
4
100 50 75 25
```
**Expected Output:**
```
[100, 50, 75, 25]	unsorted
[100, 50, 75, 25]	100 > 50, swap
[50, 100, 75, 25]	100 > 75, swap
[50, 75, 100, 25]	100 > 25, swap
[50, 75, 25, 100]	50 < 75, ok
[50, 75, 25, 100]	75 > 25, swap
[50, 25, 75, 100]	50 > 25, swap
[25, 50, 75, 100]	25 < 50, ok
[25, 50, 75, 100]	sorted
Sorted array: [25, 50, 75, 100]
```

---

### TC14 - Mảng với giá trị giống nhau xen kẽ (Hidden)
**Input:**
```
6
1 2 1 2 1 2
```
**Expected Output:**
```
[1, 2, 1, 2, 1, 2]	unsorted
[1, 2, 1, 2, 1, 2]	1 < 2, ok
[1, 2, 1, 2, 1, 2]	2 > 1, swap
[1, 1, 2, 2, 1, 2]	2 < 2, ok
[1, 1, 2, 2, 1, 2]	2 > 1, swap
[1, 1, 2, 1, 2, 2]	2 < 2, ok
[1, 1, 2, 1, 2, 2]	1 < 1, ok
[1, 1, 2, 1, 2, 2]	1 < 2, ok
[1, 1, 2, 1, 2, 2]	2 > 1, swap
[1, 1, 1, 2, 2, 2]	2 < 2, ok
[1, 1, 1, 2, 2, 2]	1 < 1, ok
[1, 1, 1, 2, 2, 2]	1 < 2, ok
[1, 1, 1, 2, 2, 2]	sorted
Sorted array: [1, 1, 1, 2, 2, 2]
```

---

### TC15 - Mảng 3 phần tử đã sorted (Hidden)
**Input:**
```
3
1 2 3
```
**Expected Output:**
```
[1, 2, 3]	unsorted
[1, 2, 3]	1 < 2, ok
[1, 2, 3]	2 < 3, ok
[1, 2, 3]	sorted
Sorted array: [1, 2, 3]
```

---

## BẢNG TÓM TẮT

| # | Input Size | Input Array | Loại | Mô tả |
|---|------------|-------------|------|-------|
| 1 | 5 | 5 1 12 -5 16 | Visible | Ví dụ trong đề bài |
| 2 | 1 | 7 | Visible | Mảng 1 phần tử |
| 3 | 2 | 9 3 | Visible | 2 phần tử cần swap |
| 4 | 2 | 1 5 | Visible | 2 phần tử đã sorted |
| 5 | 5 | 1 2 3 4 5 | Visible | Best Case |
| 6 | 5 | 5 4 3 2 1 | Visible | Worst Case |
| 7 | 3 | 8 2 6 | Hidden | 3 phần tử |
| 8 | 5 | 3 1 3 2 3 | Hidden | Phần tử trùng |
| 9 | 5 | -5 10 0 -1 5 | Hidden | Số âm và dương |
| 10 | 4 | -3 -1 -5 -2 | Hidden | Toàn số âm |
| 11 | 4 | 0 0 0 0 | Hidden | Toàn số 0 |
| 12 | 3 | 999 -999 0 | Hidden | Số lớn |
| 13 | 4 | 100 50 75 25 | Hidden | Hỗn hợp |
| 14 | 6 | 1 2 1 2 1 2 | Hidden | Xen kẽ |
| 15 | 3 | 1 2 3 | Hidden | Đã sorted |
