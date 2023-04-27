import java.util.Arrays;

public class task2_1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей
    // строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        String s = "cbaasd";
        int[] index = { 3, 2, 1, 4, 6, 5 };
        char[] s1 = s.toCharArray();
        System.out.println(s1);
        char[] index1 = new char[index.length];
        for (int i = 0; i < index.length; i++) {
            char temp;
            temp = s1[index[i] - 1];
            index1[i] = temp;
        }
        String myStr = new String(index1);
        System.out.println(myStr);
    }

}
