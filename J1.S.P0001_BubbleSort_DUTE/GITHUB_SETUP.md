# Hướng dẫn tạo GitHub Repository cho LAB211

## Bước 1: Tạo repository trên GitHub

1. Truy cập https://github.com
2. Click nút **"New"** hoặc **"+"** → **"New repository"**
3. Điền thông tin:
   - **Repository name**: `LAB211` hoặc `lab211_back`
   - **Description**: `LAB211 - Data Structures and Algorithms Exercises`
   - **Public/Private**: Chọn theo ý bạn
   - **KHÔNG** tick "Add a README file" (chúng ta đã có sẵn)
4. Click **"Create repository"**

## Bước 2: Khởi tạo Git local

Mở terminal/cmd tại thư mục `lab211_back` và chạy các lệnh sau:

```bash
# Di chuyển vào thư mục gốc
cd "d:\FPT UNIVERSITY\FALL_2024_SEASON3\LAB211\lab211_back"

# Khởi tạo git repository
git init

# Copy README.md từ J1.S.P0001_BubbleSort ra ngoài
copy J1.S.P0001_BubbleSort\README.md README.md

# Copy .gitignore
copy J1.S.P0001_BubbleSort\.gitignore .gitignore

# Thêm tất cả file vào staging
git add .

# Commit lần đầu
git commit -m "Initial commit: Add J1.S.P0001 Bubble Sort"
```

## Bước 3: Kết nối và push lên GitHub

```bash
# Thay [username] bằng username GitHub của bạn
git remote add origin https://github.com/[username]/LAB211.git

# Hoặc nếu bạn đặt tên khác:
# git remote add origin https://github.com/[username]/lab211_back.git

# Push code lên GitHub
git branch -M main
git push -u origin main
```

## Bước 4: Thêm bài tập mới (sau này)

Khi có bài mới, chỉ cần:

```bash
# Thêm file mới
git add .

# Commit với message mô tả
git commit -m "Add J1.S.P0002: [Tên bài mới]"

# Push lên GitHub
git push
```

## 🔐 Authentication

Nếu GitHub yêu cầu đăng nhập:

1. **Cách 1**: Sử dụng Personal Access Token (PAT)
   - Vào GitHub → Settings → Developer settings → Personal access tokens
   - Generate new token với quyền `repo`
   - Sử dụng token thay cho password khi push

2. **Cách 2**: Sử dụng SSH (khuyến nghị)
   ```bash
   # Generate SSH key
   ssh-keygen -t ed25519 -C "your_email@example.com"
   
   # Add SSH key vào GitHub
   # Copy nội dung file ~/.ssh/id_ed25519.pub
   # Paste vào GitHub → Settings → SSH and GPG keys → New SSH key
   
   # Thay đổi remote URL
   git remote set-url origin git@github.com:[username]/LAB211.git
   ```

## ✅ Hoàn thành!

Sau khi push thành công, repository của bạn sẽ có cấu trúc:

```
LAB211/
├── .gitignore
├── README.md
└── J1.S.P0001_BubbleSort/
    ├── src/
    │   └── Main.java
    ├── problem_statement.md
    ├── test_cases.md
    └── testing_plan.md
```

Truy cập `https://github.com/[username]/LAB211` để xem repository của bạn! 🎉
