// +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 
// 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
class task1_4 {
    public static void main(String[] args) {
        String str1 = "2? + ?5 = 69";

        char[] a1 = new char[2];
        str1.getChars(0, 2, a1, 0);
        String a = new String(a1);
        char[] b1 = new char[2];
        str1.getChars(5, 7, b1, 0);
        char[] c1 = new char[2];
        str1.getChars(10, 12, c1, 0);

        String aaa = new String(a1);
        String b = new String(b1);
        String c = new String(c1);
        System.out.println(aaa);
        MyCalc(aaa, b, c);
    }

    private static void MyCalc(String a, String b, String r) {

        boolean flag = false;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int q = 0; q <= 9; q++) {
                    if (Integer.parseInt(a.replace("?", String.valueOf(i))) +
                            Integer.parseInt(b.replace("?", String.valueOf(j))) == Integer
                                    .parseInt(r.replace("?", String.valueOf(j)))) {
                        System.out.println(a.replace("?", String.valueOf(i)) + " + "
                                + b.replace("?", String.valueOf(j)) + " = "
                                + r.replace("?", String.valueOf(j)));
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("no results :(");
        }
    }
}