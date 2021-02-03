package kg.megacom;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

    public static void main(String[] args) {
        calc();


    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите первое число");
            double first = scanner.nextDouble();
            System.out.println("Введите знак арифметической операции:\n" +
                    "sin найти синус угла\n" +
                    "< найти меньшее число\n" +
                    "> найти большее число\n" +
                    "cbrt извлечение кубического корня\n" +
                    "sqrt - извлечение квадратного корня\n");

            String sign = scanner.next();
            if (sign.equals("sqrt")) {
                System.out.println(sqrt(first)); // sqrt() извлекает квадратный корень
            } else if (sign.equals("crbt")) {
                System.out.println(cbrt(first)); // cbrt() извлекает кубический корень
            } else if (sign.equals("sin")) {
                System.out.println(sin(first)); // sin() - возвращает тригонометрический синус угла
            } else if (sign.equals(">")) {
                System.out.println("введите второе число для сравнения");
                double second = scanner.nextDouble();
                System.out.println(max(first, second)); // max() возвращает большее из двух чисел
            } else if (sign.equals("<")) {
                System.out.println("введите второе число для сравнения");
                double second = scanner.nextDouble();
                System.out.println(min(first, second)); // min() возвращает меньшее из двух чисел
            } else {
                System.out.println("Что то пошло не так");
            }
            System.out.println("повторить? Y/N");
            String repeat = scanner.next();
            if (repeat.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }

}




