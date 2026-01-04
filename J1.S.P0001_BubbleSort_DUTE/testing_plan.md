# Tài Liệu Kiểm Thử (Testing Documentation) - J1.S.P0001 Bubble Sort

Tài liệu này mô tả chiến lược kiểm thử cho chương trình Bubble Sort, tập trung vào **Kiểm thử giá trị biên (Boundary Value Analysis)** và **Kiểm thử phủ nhánh (Branch Coverage)** theo chuẩn Unit Test.

## 1. Các Khái Niệm Cơ Bản

### Kiểm thử giá trị biên (Boundary Value Analysis)
Là kỹ thuật kiểm thử tập trung vào các giá trị ở "biên" của miền dữ liệu hợp lệ. Lỗi thường xuất hiện tại các điểm cực trị này hơn là ở giữa.
- **Ví dụ trong bài:** Kích thước mảng là 0, 1, số âm, hoặc số rất lớn.

### Kiểm thử phủ nhánh (Branch Coverage)
Là kỹ thuật kiểm thử hộp trắng (white-box) đảm bảo rằng mọi "nhánh" (branch) trong mã nguồn (các khối `if`, `else`, vòng lặp) đều được thực thi ít nhất một lần theo cả hai hướng (True/False).

---

## 2. Phân Tích Test Case (Ca Kiểm Thử)

### Chức năng 1: Nhập kích thước mảng (`inputSizeOfArray`)

Hàm này có nhiệm vụ nhận đầu vào từ người dùng và đảm bảo nó là một số nguyên dương.

#### Test Biên (Boundary Testing)

| ID | Mô tả | Dữ liệu đầu vào | Kết quả mong đợi | Giải thích |
| :--- | :--- | :--- | :--- | :--- |
| **TC_IN_01** | Nhập giá trị rỗng | `""` (Enter) | Thông báo lỗi "Input is empty" | Biên dưới của độ dài chuỗi input. |
| **TC_IN_02** | Nhập số 0 | `0` | Thông báo lỗi "Input must be greater than zero" | Biên dưới của số nguyên dương hợp lệ. |
| **TC_IN_03** | Nhập số âm | `-1` | Thông báo lỗi "Input is a negative number" | Giá trị ngay dưới biên hợp lệ. |
| **TC_IN_04** | Nhập số nguyên dương nhỏ nhất | `1` | Chấp nhận, trả về `1` | Giá trị biên hợp lệ nhỏ nhất. |
| **TC_IN_05** | Nhập số thực (decimal) | `5.5` | Thông báo lỗi "Input is not a whole number" | Kiểm tra kiểu dữ liệu (biên giữa int và double). |
| **TC_IN_06** | Nhập ký tự không phải số | `"abc"` | Thông báo lỗi "Input is not a valid number" | Kiểm tra ngoại lệ (Exception). |

#### Test Nhánh (Branch Coverage)

Mã nguồn có các nhánh sau:
1. `if (input.isEmpty())`
2. `try { ... } catch (NumberFormatException)`
3. `if (sizeArray != (int) sizeArray)`
4. `if (sizeArray < 0)`
5. `if (sizeArray == 0)`

Để đạt 100% Branch Coverage, ta cần các test case sau:

| ID | Nhánh cần phủ | Dữ liệu đầu vào | Đường đi (Path) |
| :--- | :--- | :--- | :--- |
| **TC_BR_01** | `input.isEmpty()` = True | `""` | In lỗi -> `continue` |
| **TC_BR_02** | `catch` Exception | `"xyz"` | Nhảy vào `catch` -> In lỗi |
| **TC_BR_03** | `sizeArray != (int)` = True | `3.5` | Parse OK -> Check int fail -> In lỗi |
| **TC_BR_04** | `sizeArray < 0` = True | `-5` | Parse OK -> Check int OK -> Check neg fail -> In lỗi |
| **TC_BR_05** | `sizeArray == 0` = True | `0` | ... -> Check zero fail -> In lỗi |
| **TC_BR_06** | Tất cả False (Happy Path) | `5` | Tất cả check đều qua -> `break` -> return 5 |

---

### Chức năng 2: Thuật toán Bubble Sort (`bubbleSort`)

Hàm này sắp xếp mảng số nguyên.

#### Test Biên (Boundary Testing)

| ID | Mô tả | Dữ liệu đầu vào (Mảng) | Kết quả mong đợi | Giải thích |
| :--- | :--- | :--- | :--- | :--- |
| **TC_SRT_01** | Mảng có 1 phần tử | `[5]` | `[5]` (Không đổi) | Kích thước mảng nhỏ nhất có thể xử lý. |
| **TC_SRT_02** | Mảng đã sắp xếp sẵn | `[1, 2, 3, 4, 5]` | `[1, 2, 3, 4, 5]` | Trường hợp tốt nhất (Best case). |
| **TC_SRT_03** | Mảng sắp xếp ngược | `[5, 4, 3, 2, 1]` | `[1, 2, 3, 4, 5]` | Trường hợp xấu nhất (Worst case). |
| **TC_SRT_04** | Mảng có phần tử trùng nhau | `[3, 1, 3, 2]` | `[1, 2, 3, 3]` | Kiểm tra tính ổn định/xử lý trùng lặp. |
| **TC_SRT_05** | Mảng chứa số âm và dương | `[-5, 10, 0, -1]` | `[-5, -1, 0, 10]` | Kiểm tra dải giá trị của phần tử. |

#### Test Nhánh (Branch Coverage)

Mã nguồn có các nhánh quan trọng:
1. Vòng lặp ngoài `for (int i...)`
2. Vòng lặp trong `for (int j...)`
3. `if (count == 0)` (In header "unsorted")
4. `if (array[j] < array[j - 1])` (So sánh để swap)
5. `if (!swapped)` (Tối ưu hóa - dừng sớm)

| ID | Nhánh cần phủ | Dữ liệu đầu vào | Giải thích đường đi |
| :--- | :--- | :--- | :--- |
| **TC_BR_07** | `array[j] < array[j-1]` = True (Swap) | `[2, 1]` | Thực hiện hoán đổi (`swapped = true`). |
| **TC_BR_08** | `array[j] < array[j-1]` = False (No Swap) | `[1, 2]` | Không hoán đổi, in "ok". |
| **TC_BR_09** | `!swapped` = True (Break sớm) | `[1, 2, 3]` | Sau vòng lặp j đầu tiên, không có swap nào -> break vòng lặp i. |
| **TC_BR_10** | `count == 0` = True | (Mọi mảng) | Luôn chạy ở lần lặp đầu tiên của j để in "unsorted". |

## 3. Kết Luận

Để đảm bảo chất lượng code theo chuẩn Unit Test cho bài này, bạn cần viết các hàm test (ví dụ sử dụng JUnit) bao phủ các trường hợp trên:
1. **Input**: Phủ hết các trường hợp nhập sai (Rỗng, chữ, số thực, số âm, số 0) và nhập đúng.
2. **Logic**: Phủ hết các trường hợp mảng đặc biệt (1 phần tử, đã sort, ngược, trùng) để đảm bảo thuật toán chạy đúng và cơ chế "dừng sớm" (`!swapped`) hoạt động hiệu quả.
