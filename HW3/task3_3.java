package HW3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
public class task3_3 {
    public static void main(String[] args) {
        String planets = "Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto";
        String[] planetsArr = planets.split(", ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of planets: ");
        int n = input.nextInt();
        System.out.println(randArrStr(planetsArr, n));
        countRepeat(planetsArr, randArrStr(planetsArr, n));

    }

    static List<String> randArrStr(String[] data, int num) {
        List<String> list1 = new ArrayList<String>(num);
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            list1.add(data[random.nextInt(data.length)]);
        }
        return list1;
    }

    static void countRepeat(String[] substrings, List<String> dataArray) {
        for (int i = 0; i < substrings.length; i++) {
            int count = 0;
            for (int j = 0; j < dataArray.size(); j++) {
                if (substrings[i].equals(dataArray.get(j))) {
                    count++;
                }
            }
            System.out.println(substrings[i] + " --- " + count);
        }
    }
}
