# Code Reference - Bubble Sort (J1.S.P0001)

## 📋 Tổng quan 5 Steps
```java
public static void main(String[] args) {
    // Step 1: User enters a positive decimal number for array size
    int sizeArray = inputSizeOfArray();

    // Step 2: Create array with input values
    int[] array = createArray(sizeArray);

    // Step 3: Display the array before sorting
    displayArrayUnsorted(array);

    // Step 4: Sort the array using Bubble sort algorithm
    bubbleSort(array);

    // Step 5: Display the array after it has been sorted
    displayArraySorted(array);
}
```

---

## 🔧 Chi tiết các hàm

### Step 1: `inputSizeOfArray()`
**Chức năng:** Nhận và validate kích thước mảng từ người dùng.

**Logic validation:**
1. Kiểm tra input rỗng → `"Input is empty"`
2. Parse thành Double để check số thực
3. Kiểm tra có phải số nguyên không → `"Input is not a whole number"`
4. Kiểm tra số âm → `"Input is a negative number"`
5. Kiểm tra bằng 0 → `"Input must be greater than zero"`

```java
private static int inputSizeOfArray() {
    double sizeArray;
    String input;
    
    while (true) {
        input = sc.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Input is empty. Please enter again.");
            continue;
        }
        
        try {
            sizeArray = Double.parseDouble(input);
            
            if (sizeArray != (int) sizeArray) {
                System.out.println("Input is not a whole number. Please enter again.");
                continue;
            }
            if (sizeArray < 0) {
                System.out.println("Input is a negative number. Please enter again.");
                continue;
            }
            if (sizeArray == 0) {
                System.out.println("Input must be greater than zero. Please enter again.");
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number. Please enter again.");
        }
    }
    return (int) sizeArray;
}
```

---

### Step 2: `createArray(int sizeArray)`
**Chức năng:** Tạo mảng và đọc các giá trị từ input.

```java
private static int[] createArray(int sizeArray) {
    int[] array = new int[sizeArray];
    for (int i = 0; i < sizeArray; i++) {
        array[i] = sc.nextInt();
    }
    return array;
}
```

---

### Step 3: `displayArrayUnsorted(int[] array)`
**Chức năng:** Hiển thị mảng với prefix "Unsorted array: ".

```java
private static void displayArrayUnsorted(int[] array) {
    System.out.print("Unsorted array: ");
    displayArray(array);
    System.out.println();
}
```

---

### Step 4: `bubbleSort(int[] array)`
**Chức năng:** Sắp xếp mảng bằng Bubble Sort, hiển thị từng bước.

**Flow:**
1. In `[array]	unsorted`
2. So sánh từng cặp liền kề:
   - Nếu `arr[j] > arr[j+1]` → swap và in `X > Y, swap`
   - Nếu `arr[j] <= arr[j+1]` → in `X < Y, ok`
3. Nếu không có swap nào trong 1 vòng lặp → `break` sớm (optimization)
4. In `[array]	sorted`

```java
private static void bubbleSort(int[] array) {
    boolean swapped;

    displayArray(array);
    System.out.println("\tunsorted");

    for (int i = 0; i < array.length; i++) {
        swapped = false;

        for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                displayArray(array);
                System.out.println("\t" + array[j] + " > " + array[j + 1] + ", swap");

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                swapped = true;
            } else {
                displayArray(array);
                System.out.println("\t" + array[j] + " < " + array[j + 1] + ", ok");
            }
        }

        if (!swapped) break;
    }

    displayArray(array);
    System.out.println("\tsorted");
}
```

---

### Step 5: `displayArraySorted(int[] array)`
**Chức năng:** Hiển thị mảng đã sắp xếp với prefix "Sorted array: ".

```java
private static void displayArraySorted(int[] array) {
    System.out.print("Sorted array: ");
    displayArray(array);
}
```

---

### Helper: `displayArray(int[] array)`
**Chức năng:** Format mảng dạng `[e1, e2, e3]`.

```java
private static void displayArray(int[] array) {
    if (array.length == 0) {
        System.out.print("[]");
        return;
    }
    System.out.print("[");
    for (int i = 0; i < array.length - 1; i++) {
        System.out.print(array[i] + ", ");
    }
    System.out.print(array[array.length - 1] + "]");
}
```

---

## 📊 Output Format
```
Unsorted array: [5, 1, 12, -5, 16]
[5, 1, 12, -5, 16]	unsorted
[5, 1, 12, -5, 16]	5 > 1, swap
...
[-5, 1, 5, 12, 16]	sorted
Sorted array: [-5, 1, 5, 12, 16]
```
