# Bubble Sort Algorithm

## 🎯 Mục tiêu
- Đọc dữ liệu từ input (System.in)
- Sử dụng mảng số nguyên
- Thực hiện thuật toán Bubble Sort
- Hiển thị quá trình sắp xếp đúng định dạng

## 📥 Yêu cầu
**Input:**
- Dòng 1: Số nguyên dương `n` - kích thước mảng
- Dòng 2: `n` số nguyên cách nhau bởi dấu cách

**Output:**
- `[mảng]` + tab + `unsorted`
- `[mảng]` + tab + `X > Y, swap` hoặc `X < Y, ok`
- `[mảng]` + tab + `sorted`
- `Sorted array: [mảng đã sắp xếp]`

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

## 💡 Thuật toán
1. So sánh từng cặp phần tử liền kề
2. Nếu phần tử trước > phần tử sau → swap
3. Lặp lại cho đến khi không còn swap

## 🔧 Starter Code
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Đọc kích thước mảng (n)
        
        // Step 2: Tạo mảng và đọc các phần tử
        
        // Step 3: In trạng thái ban đầu "[mảng]\tunsorted"
        
        // Step 4: Thực hiện Bubble Sort với hiển thị từng bước so sánh
        
        // Step 5: In trạng thái cuối "[mảng]\tsorted"
        
        // Step 6: In kết quả "Sorted array: [mảng]"
        
    }
}
```

## ⚠️ Lưu ý Monaco IDE
| Lưu ý | Chi tiết |
|-------|----------|
| **Input** | Không có console tương tác - input được cung cấp sẵn |
| **Output** | So khớp chính xác - chú ý tab (`\t`) và khoảng trắng |
| **Class** | Phải tên `Main` với method `main(String[] args)` |
| **Package** | Không sử dụng `package` statement |
