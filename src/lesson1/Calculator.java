package lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    /*To calculate integers "a" and "b" */
    public static void main(String[] args) throws Exception {
        int a ;
        int b ;
        int result;
        String operator;

        Scanner sc = new Scanner(System.in);

        try {
            a = sc.nextInt();
        } catch (InputMismatchException | IllegalStateException  e) {
            System.out.println("Некорректное первое значение. Введите целое число");
            return;
        }

        try {
            operator = sc.nextLine();
        } catch (InputMismatchException | IllegalStateException  e) {
            System.out.println("Некорректное значение. Введите один из допустимых оператор (+-*/)");
            return;
        }
        try {
            b = sc.nextInt();
        } catch (InputMismatchException | IllegalStateException  e) {
            System.out.println("Некорректное второе значение. Введите целое число");
            return;
        }

        result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new Exception("Некорректный инпут. Введите один из допустимых операторов (+-*/)");
        };

        System.out.println(result);
    }
}
