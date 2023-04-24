import java.util.Arrays;

public class Task2_0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        char[] arr = stones.toCharArray();
        char ch1 = jewels.charAt(0);
        char ch2 = jewels.charAt(1);
        int count1, count2;
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch1)
                count1++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch2)
                count2++;
        }
        StringBuilder res = new StringBuilder();
        res.append(ch1);
        res.append(count1);
        res.append(ch2);
        res.append(count2);
        System.out.println(res);
    }

}