package HW4;

import java.util.LinkedList;
import java.util.ListIterator;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
public class task4_1 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("mother");
        list1.add("father");
        list1.add("sister");
        list1.add("brother");

        System.out.println(list1);
        System.out.println(reversList(list1));
    }

    static LinkedList<String> reversList(LinkedList<String> someList) {
        LinkedList<String> resultList = new LinkedList<>();
        ListIterator<String> iter = someList.listIterator(someList.size());
        while (iter.hasPrevious()) {
            resultList.add(iter.previous());
        }

        return resultList;
    }
}
