# Testing Plan - J1.S.P0001 Bubble Sort

## 📚 Lý Thuyết Kiểm Thử

### 1. Kiểm thử giá trị biên (Boundary Value Analysis)
Là kỹ thuật kiểm thử **tập trung vào các giá trị ở "biên"** của miền dữ liệu hợp lệ. Lỗi thường xuất hiện tại các điểm cực trị này hơn là ở giữa.

**Ví dụ trong bài:**
- Kích thước mảng = 0 (biên dưới)
- Kích thước mảng = 1 (biên hợp lệ nhỏ nhất)
- Số âm (dưới biên hợp lệ)

### 2. Kiểm thử phủ nhánh (Branch Coverage)
Là kỹ thuật kiểm thử **hộp trắng (white-box)** đảm bảo rằng mọi "nhánh" (branch) trong mã nguồn (`if`, `else`, vòng lặp) đều được thực thi **ít nhất một lần** theo cả hai hướng (True/False).

**Mục tiêu:** Đạt 100% Branch Coverage = Mọi điều kiện đều đã được test với cả True và False.

---

## 📋 Test Cases

### Chức năng 1: Nhập kích thước mảng

#### Test Biên (Boundary Testing)
| ID | Input | Expected | Mô tả |
|:---|:------|:---------|:------|
| TC_IN_01 | `""` (rỗng) | Lỗi: "Input is empty" | Biên dưới độ dài |
| TC_IN_02 | `0` | Lỗi: "Input must be greater than zero" | Biên hợp lệ |
| TC_IN_03 | `-1` | Lỗi: "Input is a negative number" | Dưới biên |
| TC_IN_04 | `1` | Chấp nhận | Biên nhỏ nhất hợp lệ |
| TC_IN_05 | `5.5` | Lỗi: "Input is not a whole number" | Số thực |
| TC_IN_06 | `"abc"` | Lỗi: "Input is not a valid number" | Ký tự |

#### Test Nhánh (Branch Coverage)
| ID | Nhánh cần phủ | Input | Đường đi |
|:---|:--------------|:------|:---------|
| TC_BR_01 | `input.isEmpty()` = True | `""` | → In lỗi → continue |
| TC_BR_02 | `catch` NumberFormatException | `"xyz"` | → catch → In lỗi |
| TC_BR_03 | `sizeArray != (int)sizeArray` = True | `3.5` | → In lỗi |
| TC_BR_04 | `sizeArray < 0` = True | `-5` | → In lỗi |
| TC_BR_05 | `sizeArray == 0` = True | `0` | → In lỗi |
| TC_BR_06 | Tất cả False (Happy Path) | `5` | → break → return 5 |

---

### Chức năng 2: Thuật toán Bubble Sort

#### Test Biên (Boundary Testing)
| ID | Mảng đầu vào | Kết quả mong đợi | Mô tả |
|:---|:-------------|:-----------------|:------|
| TC_SRT_01 | `[5]` | `[5]` | 1 phần tử (kích thước nhỏ nhất) |
| TC_SRT_02 | `[1,2,3,4,5]` | `[1,2,3,4,5]` | Đã sắp xếp sẵn (Best case) |
| TC_SRT_03 | `[5,4,3,2,1]` | `[1,2,3,4,5]` | Sắp xếp ngược (Worst case) |
| TC_SRT_04 | `[3,1,3,2]` | `[1,2,3,3]` | Có phần tử trùng nhau |
| TC_SRT_05 | `[-5,10,0,-1]` | `[-5,-1,0,10]` | Có số âm và dương |

#### Test Nhánh (Branch Coverage)
| ID | Nhánh cần phủ | Input | Giải thích |
|:---|:--------------|:------|:-----------|
| TC_BR_07 | `array[j] > array[j+1]` = True | `[2,1]` | Thực hiện swap |
| TC_BR_08 | `array[j] > array[j+1]` = False | `[1,2]` | Không swap, in "ok" |
| TC_BR_09 | `!swapped` = True | `[1,2,3]` | Mảng đã sorted → break sớm |

---

## ⚠️ Lưu ý Monaco IDE

### Format Output đúng:
```
[array]	unsorted
[array]	X > Y, swap
[array]	X < Y, ok
[array]	sorted
Sorted array: [array]
```

### Checklist:
- [ ] Tab `\t` giữa array và action
- [ ] Dấu cách đúng trong format `X > Y, swap`
- [ ] Dòng cuối: `Sorted array: [array]`
- [ ] Không có dòng trống thừa
