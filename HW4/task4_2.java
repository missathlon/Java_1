package HW4;

import java.util.LinkedList;
import java.util.Queue;

//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class task4_2 {
    public static void main(String[] args) {
        Queue<String> array = new LinkedList();
        array.add("one");
        array.add("two");
        array.add("three");
        System.out.println(array);
        enqueue(array, "four");
        enqueue(array, "five");
        System.out.println(array);
        dequeue(array);
        System.out.println(array);
        System.out.println(first(array));

    }

    static void enqueue(Queue<String> array, String element) {
        array.add(element);
    }

    static String dequeue(Queue<String> array) {
        String arrayDeq = array.remove();
        return arrayDeq;
    }

    static String first(Queue<String> array) {
        String element = array.element();
        return element;
    }
}
