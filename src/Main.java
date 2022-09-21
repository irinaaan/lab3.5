import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку А: ");
        String a = in.nextLine();
        System.out.println("Введите строку Б: ");
        String b = in.nextLine();
        System.out.println("Итоговая строка: " + stringExchange(a, b));
    }

    public static String stringExchange(String a, String b) {
        String c = ""; //итоговая строка
        int ln = Math.min(a.length(), b.length()); //находим длину самой короткой строки (это для цикла)
        for (int i = 0; i < ln; i++) { //поочередно перебираем буквы в двух строках, добавляя в итоговую
            c = c + a.charAt(i) + b.charAt(i);
        }
        c = c + a.substring(ln) + b.substring(ln);  //добавляем остаток
        return c;
    }
}