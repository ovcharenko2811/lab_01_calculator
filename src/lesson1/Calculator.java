package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    /*To calculate integers "a" and "b" */
    public static void main(String[] args) {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        while (!"q".equals(userInput)) {
            try {
                System.out.println("Введите первое число!");
                int firstNumber = Integer.parseInt(scanner.readLine());
                System.out.println("Введите второе число!");
                int secondNumber = Integer.parseInt(scanner.readLine());
                System.out.println("Введите оператор!");
                userInput = scanner.readLine();
                double result;

                switch (userInput) {
                    case "+" -> result = plus(firstNumber, secondNumber);
                    case "-" -> result = minus(firstNumber, secondNumber);
                    case "*" -> result = ymn(firstNumber, secondNumber);
                    case "/" -> {
                        if (secondNumber == 0) {
                            System.out.println("На ноль делить нельзя!");
                            continue;
                        }
                        result = del(firstNumber, secondNumber);
                    }
                    case "!" -> result = fact(firstNumber);
                    default -> {
                        System.out.println("Неправильный оператор!");
                        result = 0;
                    }
                }


                System.out.println("Результат операции: " + result);
            } catch (InputMismatchException | IOException | NumberFormatException ex) {
                System.out.println("Неправильный инпут!");

            }

        }
    }

    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int fact(int numberOne) {
        int res = 1;
        for (int i = 1; i < numberOne; i++) {
            res *= i;
        }

        return res;
    }

}