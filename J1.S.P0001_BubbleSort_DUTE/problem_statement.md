# Bubble Sort Algorithm

## 🎯 Mục tiêu
- Đọc dữ liệu từ input
- Sử dụng kiểu dữ liệu mảng số nguyên
- Thực hiện thuật toán Bubble Sort trong Java
- Hiển thị quá trình sắp xếp và kết quả đúng định dạng

## 📝 Đề bài

Viết chương trình Java cho phép người dùng nhập kích thước mảng và các giá trị của mảng. Sau đó sắp xếp mảng theo thứ tự tăng dần sử dụng thuật toán **Bubble Sort** và hiển thị các bước sắp xếp chi tiết.

## 📥 Yêu cầu

**Input:**
- Dòng 1: Số nguyên dương `n` - kích thước mảng
- Dòng 2: `n` số nguyên cách nhau bởi dấu cách - các phần tử của mảng

**Output:**
- Dòng 1: `[mảng ban đầu]` + tab + `unsorted`
- Các dòng tiếp theo: `[mảng hiện tại]` + tab + `X > Y, swap` hoặc `X < Y, ok`
- Dòng kế cuối: `[mảng đã sắp xếp]` + tab + `sorted`
- Dòng cuối: `Sorted array: [mảng đã sắp xếp]`

## 💡 Thuật toán Bubble Sort

1. So sánh từng cặp phần tử liền kề từ đầu mảng
2. Nếu phần tử trước lớn hơn phần tử sau → hoán đổi (swap)
3. Lặp lại cho đến khi không còn hoán đổi nào

## 📌 Ví dụ

**Input:**
```
5
5 1 12 -5 16
```

**Output:**
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

## 🔧 Starter Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Input size of array
        
        // Step 2: Create array with input values
        
        // Step 3: Sort array using Bubble Sort
        
        // Step 4: Display sorted array
    }
}
```
