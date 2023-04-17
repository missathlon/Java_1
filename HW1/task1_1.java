// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)
// Формула для нахождения треугольного числа Тn =(n+1)•n:2=1/2•(n+1)•n

import java.util.Scanner;

class task1_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input n: ");
        int n = sc.nextInt();
        int t;
        t = (n + 1) * n / 2;
        System.out.println(t);

        int f = 1; // factorial
        while (n > 1) {
            f *= n;
            n--;
        }
        System.out.println(f);

    }
}