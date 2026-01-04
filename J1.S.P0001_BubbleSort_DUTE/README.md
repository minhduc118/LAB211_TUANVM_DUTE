# LAB211 - Data Structures and Algorithms

Repository lưu trữ các bài tập LAB211 của FPT University, bao gồm các thuật toán và cấu trúc dữ liệu cơ bản.

## 📚 Danh sách bài tập

### J1.S.P0001 - Bubble Sort Algorithm
Triển khai thuật toán sắp xếp nổi bọt (Bubble Sort) và hiển thị chi tiết các bước sắp xếp.

**Nội dung:**
- Nhập kích thước mảng và các phần tử
- Sắp xếp mảng theo thứ tự tăng dần
- Hiển thị từng bước so sánh và hoán đổi

📁 [Xem chi tiết](./J1.S.P0001_BubbleSort/)

---

## 🛠️ Công nghệ sử dụng

- **Java**: JDK 21
- **IDE**: Visual Studio Code / IntelliJ IDEA / NetBeans

## 📖 Cấu trúc thư mục

```
lab211_back/
├── J1.S.P0001_BubbleSort/
│   ├── src/
│   │   └── Main.java
│   ├── problem_statement.md
│   ├── test_cases.md
│   └── testing_plan.md
├── [Các bài khác...]
└── README.md
```

## 🚀 Cách sử dụng

### Clone repository
```bash
git clone https://github.com/[username]/LAB211.git
cd LAB211
```

### Compile và chạy
```bash
# Với Java
cd J1.S.P0001_BubbleSort/src
javac Main.java
java Main
```

### Input mẫu
```
5
5 1 12 -5 16
```

### Output mẫu
```
[5, 1, 12, -5, 16]	unsorted
[5, 1, 12, -5, 16]	5 > 1, swap
[1, 5, 12, -5, 16]	5 < 12, ok
...
[-5, 1, 5, 12, 16]	sorted
Sorted array: [-5, 1, 5, 12, 16]
```

## 📝 Ghi chú

Mỗi bài tập đều bao gồm:
- ✅ **problem_statement.md**: Đề bài chi tiết
- ✅ **test_cases.md**: Các test case đầy đủ
- ✅ **testing_plan.md**: Kế hoạch kiểm thử
- ✅ **src/**: Mã nguồn Java

## 👨‍💻 Tác giả

**Tên sinh viên**: [Tên của bạn]  
**Mã sinh viên**: [Mã SV]  
**Trường**: FPT University  
**Học kỳ**: Fall 2024 - Season 3

## 📄 License

Dự án này được tạo ra cho mục đích học tập tại FPT University.
