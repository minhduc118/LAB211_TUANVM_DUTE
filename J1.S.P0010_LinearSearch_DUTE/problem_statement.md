# Linear Search Algorithm

## 🎯 Mục tiêu
- Đọc dữ liệu từ input (System.in)
- Sử dụng mảng số nguyên
- Thực hiện thuật toán Linear Search
- Hiển thị kết quả tìm kiếm đúng định dạng

## 📥 Yêu cầu
**Input:**
- Dòng 1: Số nguyên dương `n` - kích thước mảng
- Dòng 2: Số nguyên `x` - giá trị cần tìm
- Dòng 3: `n` số nguyên cách nhau bởi dấu cách - các phần tử mảng

**Output:**
- `The array: [e1, e2, ..., en]`
- `Found X at index: Y` hoặc `NOT FOUND`

## 📌 Ví dụ
**Input:**
```
5
3
5 1 4 3 2
```

**Output:**
```
Enter number of array:
Enter search value:
The array: [5, 1, 4, 3, 2]
Found 3 at index: 3
```

---

**Input (Không tìm thấy):**
```
5
10
1 2 3 4 5
```

**Output:**
```
Enter number of array:
Enter search value:
The array: [1, 2, 3, 4, 5]
NOT FOUND
```

## 💡 Thuật toán
1. Duyệt qua từng phần tử trong mảng từ đầu đến cuối
2. So sánh mỗi phần tử với giá trị cần tìm
3. Nếu tìm thấy → trả về index
4. Nếu duyệt hết mà không tìm thấy → trả về -1

## 🔧 Starter Code
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Đọc kích thước mảng (n)
        
        // Step 2: Đọc giá trị cần tìm (searchValue)
        
        // Step 3: Tạo mảng và đọc các phần tử
        
        // Step 4: Hiển thị mảng "The array: [...]"
        
        // Step 5: Thực hiện Linear Search
        
        // Step 6: Hiển thị kết quả "Found X at index: Y" hoặc "NOT FOUND"
        
    }
}
```

## ⚠️ Lưu ý Monaco IDE
| Lưu ý | Chi tiết |
|-------|----------|
| **Input** | Không có console tương tác - input được cung cấp sẵn |
| **Output** | So khớp chính xác - chú ý khoảng trắng và dấu phẩy |
| **Class** | Phải tên `Main` với method `main(String[] args)` |
| **Package** | Không sử dụng `package` statement |
