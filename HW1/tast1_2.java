// Вывести все простые числа от 1 до 1000.

public class tast1_2 {
    public static void main(String[] args) {
        int i, N, t, k;
        N = 1000;
        for (k = 2; k <= N; k++) {
            i = 2;
            t = 0;
            while (i < k) {
                if (k % i == 0) {
                    t++;
                    break;
                }
                i++;
            }
            if (t == 0) {
                System.out.println(k);
            }
        }
    }
}