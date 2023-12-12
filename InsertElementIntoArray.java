import java.util.Arrays;
import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên
        int[] array = new int[10];

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập giá trị cần chèn (X): ");
        int x = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí index có hợp lệ
        if (index < 0 || index >= array.length) {
            System.out.println("Không thể chèn phần tử vào vị trí này.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào mảng
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn phần tử " + x + " vào vị trí " + index + ": " + Arrays.toString(array));
        }
    }
    }

