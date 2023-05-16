package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
public class task5_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        addNumber("111", "Mother", phoneBook);
        addNumber("222", "Mother", phoneBook);
        addNumber("333", "Father", phoneBook);
        addNumber("444", "Sister", phoneBook);
        addNumber("555", "Brother", phoneBook);

        searchNumber("Father", phoneBook);
        searchPerson("111", phoneBook);
        searchNumber("Katya", phoneBook);
        System.out.println(phoneBook);
    }

    static void addNumber(String number, String person, Map<String, List<String>> book) {
        if (book.containsKey(person)) {
            book.get(person).add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            book.put(person, list);
        }
    }

    static void searchNumber(String person, Map<String, List<String>> book) {
        if (book.containsKey(person)) {
            StringBuilder str = new StringBuilder();
            str.append("number: ");
            str.append(person);
            str.append(" - ");
            str.append(book.get(person));
            System.out.println(str);
        } else {
            System.out.println("There's no number of this person in the phonebook");
        }
    }

    static void searchPerson(String number, Map<String, List<String>> book) {
        for (Entry<String, List<String>> entry : book.entrySet()) {
            if (entry.getValue().contains(number)) {
                System.out.println("Number " + number + " - " + entry.getKey());
                return;
            }
        }
        System.out.println("There's no person with this number in the phonebook");
    }
}
