package HW4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class task4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list1.add(random.nextInt(20));
        }
        System.out.println(list1);
        sumOfEl(list1);
    }

    static Integer sumOfEl(LinkedList<Integer> array) {
        Integer sum = 0;
        ListIterator<Integer> iter = array.listIterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println("Sum of elements: " + sum);
        return sum;
    }

}
