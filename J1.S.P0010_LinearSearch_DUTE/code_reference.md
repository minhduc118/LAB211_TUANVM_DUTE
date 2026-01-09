# Code Reference - Linear Search (J1.S.P0010)

## 📋 Tổng quan Steps
```java
public static void main(String[] args) {
    // Step 1: User enters a positive decimal number for array size
    int sizeOfArray = inputPositiveNumber();

    // Step 2: Enter search value
    int searchValue = inputSearchValue();

    // Step 3: Create array with input values
    int[] array = createArray(sizeOfArray);

    // Step 4: Display array
    displayArray(array, "The array: ");

    // Step 5: Display index of search value using Linear Search
    displayIndexOfSearchValue(searchValue, array);
}
```

---

## 🔧 Chi tiết các hàm

### Step 1: `inputPositiveNumber()`
**Chức năng:** Nhận và validate kích thước mảng từ người dùng.

**Logic validation:**
1. Kiểm tra input rỗng → `"Input is empty"`
2. Parse thành Double để check số thực
3. Kiểm tra có phải số nguyên không → `"Input is not a whole number"`
4. Kiểm tra số âm → `"Input is a negative number"`
5. Kiểm tra bằng 0 → `"Input must be greater than zero"`

```java
private static int inputPositiveNumber() {
    double sizeOfArray;
    String input;
    
    while (true) {
        System.out.println("Enter number of array:");
        input = sc.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Input is empty. Please enter again.");
            continue;
        }
        
        try {
            sizeOfArray = Double.parseDouble(input);
            
            if (sizeOfArray != (int) sizeOfArray) {
                System.out.println("Input is not a whole number. Please enter again.");
                continue;
            }
            if (sizeOfArray < 0) {
                System.out.println("Input is a negative number. Please enter again.");
                continue;
            }
            if (sizeOfArray == 0) {
                System.out.println("Input must be greater than zero. Please enter again.");
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number. Please enter again.");
        }
    }
    return (int) sizeOfArray;
}
```

---

### Step 2: `inputSearchValue()`
**Chức năng:** Nhận và validate giá trị cần tìm từ người dùng.

```java
private static int inputSearchValue() {
    double searchValue;
    String inputValue;

    while (true) {
        System.out.println("Enter search value:");
        inputValue = sc.nextLine().trim();

        if (inputValue.isEmpty()) {
            System.out.println("Input is empty. Please enter again.");
            continue;
        }

        try {
            searchValue = Double.parseDouble(inputValue);

            if (searchValue < 0) {
                System.out.println("Input is a negative number. Please enter again.");
                continue;
            }
            if (searchValue != (int) searchValue) {
                System.out.println("Input is not a whole number. Please enter again.");
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number. Please enter again.");
        }
    }
    return (int) searchValue;
}
```

---

### Step 3: `createArray(int sizeOfArray)`
**Chức năng:** Tạo mảng và đọc các giá trị từ input.

```java
private static int[] createArray(int sizeOfArray) {
    int[] array = new int[sizeOfArray];
    for (int i = 0; i < sizeOfArray; i++) {
        array[i] = sc.nextInt();
    }
    return array;
}
```

---

### Step 4: `displayArray(int[] array, String message)`
**Chức năng:** Hiển thị mảng với prefix message.
**Format:** `message[e1, e2, ..., en]`

```java
private static void displayArray(int[] array, String message) {
    if (array.length == 0) {
        System.out.println(message + "[]");
        return;
    }
    System.out.print(message + "[");
    for (int i = 0; i < array.length - 1; i++) {
        System.out.print(array[i] + ", ");
    }
    System.out.println(array[array.length - 1] + "]");
}
```

---

### Step 5: `linearSearch(int searchValue, int[] array)`
**Chức năng:** Tìm kiếm tuyến tính.
**Output:** Index của phần tử (nếu tìm thấy), hoặc -1 (nếu không thấy).

```java
private static int linearSearch(int searchValue, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == searchValue) {
            return i;
        }
    }
    return -1;
}
```

---

### Step 6: `displayIndexOfSearchValue(int searchValue, int[] array)`
**Chức năng:** Hiển thị kết quả cuối cùng.

```java
private static void displayIndexOfSearchValue(int searchValue, int[] array) {
    int index = linearSearch(searchValue, array);
    if (index == -1) {
        System.out.println("NOT FOUND");
    } else {
        System.out.printf("Found %d at index: %d\n", searchValue, index);
    }
}
```

---

## 📊 Output Format
```
Enter number of array:
Enter search value:
The array: [5, 1, 4, 3, 2]
Found 3 at index: 3
```

**Nếu không tìm thấy:**
```
Enter number of array:
Enter search value:
The array: [1, 2, 3, 4, 5]
NOT FOUND
```
