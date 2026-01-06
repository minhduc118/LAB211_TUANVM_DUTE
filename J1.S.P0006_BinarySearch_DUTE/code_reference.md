# Code Reference - Binary Search (J1.S.P0006)

## 📋 Tổng quan Steps
```java
public static void main(String[] args) {
    // Step 1: User enters a positive decimal number for array size
    int sizeOfArray = inputPositiveNumber();

    // Step 2: Enter search value
    int searchValue = inputSearchValue();

    // Step 3: Create array with random integers
    int[] array = createArray(sizeOfArray);

    // Step 4: Sort array
    sortArray(array);

    // Step 5: Display sorted array
    displayArray(array, "Sorted array: ");

    // Step 6: Search using Binary Search algorithm
    searchByBinarySearch(searchValue, array);

    // Step 7: Display index of search value
    displayIndexOfSearchValue(searchValue, array);
}
```

---

## 🔧 Chi tiết các hàm

### 1. `createArray(int sizeOfArray)`
**Chức năng:** Tạo mảng ngẫu nhiên (Random).
**Lưu ý:** Sử dụng `java.util.Random`.
```java
private static int[] createArray(int sizeOfArray) {
    Random rd = new Random();
    int[] array = new int[sizeOfArray];
    for (int i = 0; i < array.length; i++) {
        array[i] = rd.nextInt(array.length); // Random range [0, length)
    }
    return array;
}
```

### 2. `sortArray(int[] array)`
**Chức năng:** Sắp xếp mảng để chuẩn bị cho Binary Search.
**Thuật toán:** Đang sử dụng **Selection Sort** trong code tham khảo.
```java
private static void sortArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int minEle = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minEle]) {
                minEle = j;
            }
        }
        int temp = array[i];
        array[i] = array[minEle];
        array[minEle] = temp;
    }
}
```

### 3. `searchByBinarySearch(int searchValue, int[] array)`
**Chức năng:** Tìm kiếm nhị phân.
**Output:** Index của phần tử (nếu tìm thấy), hoặc -1 (nếu không thấy).
```java
private static int searchByBinarySearch(int searchValue, int[] array) {
    int l = 0;
    int r = array.length - 1;
    while (l <= r) {
        int mid = (l + r) / 2;
        if (array[mid] == searchValue) {
            return mid;
        } else if (array[mid] > searchValue) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }
    return -1;
}
```

### 4. `displayIndexOfSearchValue(int searchValue, int[] array)`
**Chức năng:** Hiển thị kết quả cuối cùng.
```java
private static void displayIndexOfSearchValue(int searchValue, int[] array) {
    int index = searchByBinarySearch(searchValue, array);
    if (index == -1) {
        System.out.println("NOT FOUND");
    } else {
        System.out.printf("Found %d at index: %d\n", searchValue, index);
    }
}
```
