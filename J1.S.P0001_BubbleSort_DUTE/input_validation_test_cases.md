# Test Cases for inputSizeOfArray() Function

## Hàm cần test

```java
private static int inputSizeOfArray() {
    double sizeArray;
    String input;

    // Loop until valid input is received
    while (true) {
        input = sc.nextLine().trim();

        // 1. Check if input is empty
        if (input.isEmpty()) {
            System.out.println("Input is empty. Please enter again.");
            continue;
        }

        try {
            // 2. Parse input to a double first to check for decimals
            sizeArray = Double.parseDouble(input);

            // 3. Check if input is a real number (not an integer)
            if (sizeArray != (int) sizeArray) {
                System.out.println("Input is not a whole number. Please enter again.");
                continue;
            }

            // 4. Check if input is negative
            if (sizeArray < 0) {
                System.out.println("Input is a negative number. Please enter again.");
                continue;
            }

            // 5. Check if input is zero
            if (sizeArray == 0) {
                System.out.println("Input must be greater than zero. Please enter again.");
                continue;
            }

            // Input is valid, break the loop
            break;

        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number. Please enter again.");
        }
    }
    return (int) sizeArray;
}
```

---

## Branch Testing (Kiểm thử nhánh)

Hàm có **6 nhánh** cần test:

| Nhánh | Điều kiện | Message hiển thị |
|-------|-----------|------------------|
| 1 | Input rỗng | "Input is empty. Please enter again." |
| 2 | Không phải số hợp lệ | "Input is not a valid number. Please enter again." |
| 3 | Số thập phân | "Input is not a whole number. Please enter again." |
| 4 | Số âm | "Input is a negative number. Please enter again." |
| 5 | Số 0 | "Input must be greater than zero. Please enter again." |
| 6 | Số dương hợp lệ | *(Không có message, trả về giá trị)* |

---

## Boundary Testing (Kiểm thử biên)

Các giá trị biên cần test:

| Giá trị biên | Loại | Kết quả mong đợi |
|--------------|------|------------------|
| -1 | Số âm (biên dưới) | Invalid |
| 0 | Biên không hợp lệ | Invalid |
| 1 | Biên dưới hợp lệ | **Valid** |
| 2 | Giá trị hợp lệ | **Valid** |
| Integer.MAX_VALUE (2147483647) | Biên trên hợp lệ | **Valid** |
| 2147483648 | Vượt quá Integer.MAX_VALUE | **Valid** (vẫn parse được) |

---

## Test Cases - Branch Testing

### TC1 - Input rỗng (Empty String)
**Input:**
```
(empty string - nhấn Enter không nhập gì)
```
**Expected Behavior:**
- Hiển thị: `"Input is empty. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 1

---

### TC2 - Input chứa khoảng trắng
**Input:**
```
   
(chỉ có spaces)
```
**Expected Behavior:**
- Sau khi `.trim()`, input trở thành chuỗi rỗng
- Hiển thị: `"Input is empty. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 1

---

### TC3 - Input không phải số (Chữ cái)
**Input:**
```
abc
```
**Expected Behavior:**
- Hiển thị: `"Input is not a valid number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 2

---

### TC4 - Input không phải số (Ký tự đặc biệt)
**Input:**
```
@#$%
```
**Expected Behavior:**
- Hiển thị: `"Input is not a valid number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 2

---

### TC5 - Input hỗn hợp số và chữ
**Input:**
```
5abc
```
**Expected Behavior:**
- Hiển thị: `"Input is not a valid number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 2

---

### TC6 - Số thập phân dương
**Input:**
```
5.5
```
**Expected Behavior:**
- Hiển thị: `"Input is not a whole number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 3

---

### TC7 - Số thập phân âm
**Input:**
```
-3.7
```
**Expected Behavior:**
- Hiển thị: `"Input is not a whole number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 3

---

### TC8 - Số thập phân rất nhỏ (0.1)
**Input:**
```
0.1
```
**Expected Behavior:**
- Hiển thị: `"Input is not a whole number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 3

---

### TC9 - Số thập phân gần nguyên (0.9)
**Input:**
```
0.9
```
**Expected Behavior:**
- Hiển thị: `"Input is not a whole number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 3

---

### TC10 - Số âm
**Input:**
```
-5
```
**Expected Behavior:**
- Hiển thị: `"Input is a negative number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 4

---

### TC11 - Số 0
**Input:**
```
0
```
**Expected Behavior:**
- Hiển thị: `"Input must be greater than zero. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 5

---

### TC12 - Số 0 dạng thập phân (0.0)
**Input:**
```
0.0
```
**Expected Behavior:**
- Hiển thị: `"Input is not a whole number. Please enter again."`
- Yêu cầu nhập lại

**Branch Coverage:** Nhánh 3 (kiểm tra thập phân trước khi kiểm tra = 0)

---

### TC13 - Số dương hợp lệ (1)
**Input:**
```
1
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `1`

**Branch Coverage:** Nhánh 6

---

### TC14 - Số dương hợp lệ (5)
**Input:**
```
5
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `5`

**Branch Coverage:** Nhánh 6

---

### TC15 - Số dương lớn
**Input:**
```
1000
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `1000`

**Branch Coverage:** Nhánh 6

---

## Test Cases - Boundary Testing

### TC16 - Biên âm (-1)
**Input:**
```
-1
```
**Expected Behavior:**
- Hiển thị: `"Input is a negative number. Please enter again."`
- Yêu cầu nhập lại

**Boundary Type:** Biên dưới không hợp lệ

---

### TC17 - Biên 0
**Input:**
```
0
```
**Expected Behavior:**
- Hiển thị: `"Input must be greater than zero. Please enter again."`
- Yêu cầu nhập lại

**Boundary Type:** Biên 0 (không hợp lệ)

---

### TC18 - Biên dưới hợp lệ (1)
**Input:**
```
1
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `1`

**Boundary Type:** Giá trị nhỏ nhất hợp lệ

---

### TC19 - Biên dưới + 1 (2)
**Input:**
```
2
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `2`

**Boundary Type:** Giá trị hợp lệ kế tiếp

---

### TC20 - Integer.MAX_VALUE
**Input:**
```
2147483647
```
**Expected Behavior:**
- ✅ Chấp nhận input
- Trả về: `2147483647`

**Boundary Type:** Biên trên của Integer

---

### TC21 - Integer.MAX_VALUE + 1
**Input:**
```
2147483648
```
**Expected Behavior:**
- ✅ Chấp nhận input (vì parse thành double trước)
- Trả về: `2147483647` (do cast về int bị overflow)

**Boundary Type:** Vượt quá biên trên Integer

**Note:** Đây là một case đặc biệt do implementation sử dụng `double` để parse. Có thể cần xử lý thêm để validate không vượt quá `Integer.MAX_VALUE`.

---

## Test Cases - Kết hợp (Multi-step Input)

### TC22 - Input sai nhiều lần rồi đúng
**Input Sequence:**
```
(empty)     → "Input is empty. Please enter again."
abc         → "Input is not a valid number. Please enter again."
5.5         → "Input is not a whole number. Please enter again."
-3          → "Input is a negative number. Please enter again."
0           → "Input must be greater than zero. Please enter again."
10          → ✅ Accept
```
**Expected Behavior:**
- Sau 5 lần input sai, lần thứ 6 nhập `10` sẽ được chấp nhận
- Trả về: `10`

**Coverage:** Tất cả các nhánh

---

## Bảng Tóm Tắt Test Cases

| # | Input | Loại Test | Nhánh | Kết quả mong đợi | Error Message |
|---|-------|-----------|-------|------------------|---------------|
| 1 | (empty) | Branch | 1 | Invalid | "Input is empty. Please enter again." |
| 2 | (spaces) | Branch | 1 | Invalid | "Input is empty. Please enter again." |
| 3 | abc | Branch | 2 | Invalid | "Input is not a valid number. Please enter again." |
| 4 | @#$% | Branch | 2 | Invalid | "Input is not a valid number. Please enter again." |
| 5 | 5abc | Branch | 2 | Invalid | "Input is not a valid number. Please enter again." |
| 6 | 5.5 | Branch | 3 | Invalid | "Input is not a whole number. Please enter again." |
| 7 | -3.7 | Branch | 3 | Invalid | "Input is not a whole number. Please enter again." |
| 8 | 0.1 | Branch | 3 | Invalid | "Input is not a whole number. Please enter again." |
| 9 | 0.9 | Branch | 3 | Invalid | "Input is not a whole number. Please enter again." |
| 10 | -5 | Branch | 4 | Invalid | "Input is a negative number. Please enter again." |
| 11 | 0 | Branch | 5 | Invalid | "Input must be greater than zero. Please enter again." |
| 12 | 0.0 | Branch | 3 | Invalid | "Input is not a whole number. Please enter again." |
| 13 | 1 | Branch | 6 | ✅ Valid | Return 1 |
| 14 | 5 | Branch | 6 | ✅ Valid | Return 5 |
| 15 | 1000 | Branch | 6 | ✅ Valid | Return 1000 |
| 16 | -1 | Boundary | 4 | Invalid | "Input is a negative number. Please enter again." |
| 17 | 0 | Boundary | 5 | Invalid | "Input must be greater than zero. Please enter again." |
| 18 | 1 | Boundary | 6 | ✅ Valid | Return 1 |
| 19 | 2 | Boundary | 6 | ✅ Valid | Return 2 |
| 20 | 2147483647 | Boundary | 6 | ✅ Valid | Return 2147483647 |
| 21 | 2147483648 | Boundary | 6 | ⚠️ Overflow | Return 2147483647 (overflow) |
| 22 | Multi-step | Combined | All | ✅ Valid | Return 10 (after 5 invalid inputs) |

---

## Kết luận

### Branch Coverage
- ✅ **100%** - Tất cả 6 nhánh đều được test

### Boundary Coverage
- ✅ Biên dưới không hợp lệ: -1
- ✅ Biên 0: 0
- ✅ Biên dưới hợp lệ: 1
- ✅ Biên trên: Integer.MAX_VALUE
- ⚠️ **Phát hiện vấn đề**: Overflow khi input > Integer.MAX_VALUE

### Đề xuất cải tiến
Thêm validation để kiểm tra `sizeArray <= Integer.MAX_VALUE` trước khi cast về `int`:

```java
// Thêm sau dòng kiểm tra sizeArray == 0
if (sizeArray > Integer.MAX_VALUE) {
    System.out.println("Input exceeds maximum array size. Please enter again.");
    continue;
}
```
