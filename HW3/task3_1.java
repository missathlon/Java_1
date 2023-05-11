package HW3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();
        List<Integer> list1 = generateRandomArray(n);
        System.out.println(list1);
        System.out.println(filterNumbers(list1));
    }

    static List<Integer> generateRandomArray(int n) {
        List<Integer> list1 = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list1.add(random.nextInt(100));
        }
        return list1;
    }

    static List<Integer> filterNumbers(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }
}
