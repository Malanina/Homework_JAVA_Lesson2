/*
 * Написать метод, который приводит строку к нормальному виду:

строка на вход
Добрый день Как дела Все хорошо

выход
Добрый день. Как дела. Все хорошо.
 */


import java.util.Scanner;

public class task {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scan.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scan.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scan.nextLine();
        String str4 = String.join(".", str1, str2, str3);
        char ch = '.';
        str4 += ch;
        System.out.println(str4);
        scan.close();
    }
}
