package Semi_2;

import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
public class HW_2 {
    public static void main(String[] args) throws Exception {
        int[] arr = { 3, 4, 8, 12, 2, 123, 15, 1, -3 };
        FileWriter log = new FileWriter(".\\Semi_2\\log.txt");
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i -1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i-1] = temp;
                    flag = false;
            }
            log.append(Arrays.toString(arr));
            log.append("\n");
            }       
        }
        log.close();
    }
}
