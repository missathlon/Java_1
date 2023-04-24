
// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1
import java.util.Scanner;
import java.util.Arrays;

public class task1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input elements: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.print(Arrays.toString(arr));
        System.err.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] & i != j) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(arr[i]);
            }
            count = 0;
        }
        sc.close();
    }
}
