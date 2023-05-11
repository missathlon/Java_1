package HW3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class task3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();
        List<Integer> list1 = generateRandomArray(n);
        System.out.println(list1);
        System.out.println("Max value is: " + Collections.max(list1));
        System.out.println("Min value is: " + Collections.min(list1));
        double result = 0;
        for (int m : list1) {
            result += m;
        }
        System.out.println("Avarage value is: " + result / list1.size());
    }

    static List<Integer> generateRandomArray(int n) {
        List<Integer> list1 = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list1.add(random.nextInt(100));
        }
        return list1;
    }
}
