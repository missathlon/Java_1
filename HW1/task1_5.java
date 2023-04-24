// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3

import java.util.Scanner;

public class task1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input amount of elements: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int index = 0; index < arr.length; index += 2) {
            sum += arr[index];
        }
        System.out.println(sum);
        for (int index = 0; index < arr.length; index += 2) {
            System.out.println(arr[index]);
        }
    }
}
