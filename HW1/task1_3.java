
// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить
import java.util.Scanner;

class task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input 1st digit: ");
        int a = sc.nextInt();
        System.out.printf("Input 2nd digit: ");
        int b = sc.nextInt();
        System.out.printf("What will we do?\n 1-sum\n 2-subtr\n 3-multipl\n 4-div\n");
        int act = sc.nextInt();
        switch (act) {
            case 1:
                System.out.println(sum(a, b));
                break;
            case 2:
                System.out.println(sub(a, b));
                break;
            case 3:
                System.out.println(mult(a, b));
                break;
            case 4:
                if (b == 0) {
                    while (b == 0) {
                        System.out.printf("Can't divide by zero, input 2nd digit again: ");
                        b = sc.nextInt();
                        System.out.println(div(a, b));
                    }
                } else {
                    System.out.println(div(a, b));
                }
                break;
            default:
                System.out.println("mistake");
                break;
        }
        sc.close();
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int mult(int x, int y) {
        return x * y;
    }

    static double div(int x, int y) {
        return x / y;
    }
}
