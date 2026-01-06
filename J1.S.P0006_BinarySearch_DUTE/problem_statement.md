# Binary Search Algorithm

## 🎯 Mục tiêu
- Đọc dữ liệu từ input (System.in)
- Tạo mảng ngẫu nhiên và sắp xếp
- Thực hiện thuật toán Binary Search
- Hiển thị kết quả tìm kiếm

## 📥 Yêu cầu
**Input:**
- Dòng 1: Số nguyên dương `n` - kích thước mảng
- Dòng 2: Số nguyên `k` - giá trị cần tìm
- (Mảng được tạo ngẫu nhiên, không cần nhập từ input ngoại trừ size)

**Output:**
- `Sorted array: [mảng đã sắp xếp]`
- `Found k at index: i` hoặc `NOT FOUND`

## 📌 Ví dụ
**Input:**
```
10
5
```

**Output (Ví dụ, vì mảng là ngẫu nhiên):**
```
Enter number of array:
Enter search value:
Sorted array: [1, 3, 4, 5, 8, 9, 12, 15, 18, 20]
Found 5 at index: 3
```

## 💡 Thuật toán
1. Sắp xếp mảng (Selection Sort hoặc Bubble Sort)
2. Tìm kiếm Binary Search:
   - `mid = (left + right) / 2`
   - Nếu `arr[mid] == k` -> return `mid`
   - Nếu `arr[mid] > k` -> `right = mid - 1`
   - Nếu `arr[mid] < k` -> `left = mid + 1`

## 🔧 Starter Code
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Enter array size
        
        // Step 2: Enter search value
        
        // Step 3: Create random array
        
        // Step 4: Sort array
        
        // Step 5: Display sorted array
        
        // Step 6: Binary search
        
        // Step 7: Display result
    }
}
```

## ⚠️ Lưu ý Monaco IDE
| Lưu ý | Chi tiết |
|-------|----------|
| **Input** | Input size và search value được cung cấp sẵn |
| **Random** | Kết quả mảng ngẫu nhiên sẽ khác nhau mỗi lần chạy |
| **Class** | Phải tên `Main` với method `main(String[] args)` |
| **Package** | Không sử dụng `package` statement |
