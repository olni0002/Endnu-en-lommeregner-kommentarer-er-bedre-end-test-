package com.example.anothercalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        char op = '0';

        while (op != 'q') {
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for substraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            op = input.next().charAt(0);

            switch (op) {
                case '+', '-', '*', '/':
                    System.out.println(calculator.calculation(op, calculator, input));
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("ugyldig operator (regne tegn)");
            }
        }
    }

    public String calculation(char op, Calculator calculator, Scanner input) {
        double num1 = calculator.inputDouble("write first number: ", input);
        double num2 = calculator.inputDouble("Write second number: ", input);

        double result = 0;

        switch (op) {
            case '+':        
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':                
                result = calculator.divide(num1, num2);
        }

        return "RESULT = " + result;
    }

    public double inputDouble(String promt, Scanner input) {
        boolean ok = false;
        double num = 0;

        while (!ok) {
            try {
                System.out.print(promt);
                num = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
            }
            input.nextLine();
        }
        return num;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}