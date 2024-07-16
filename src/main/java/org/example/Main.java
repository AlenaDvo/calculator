package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation to calculate: + - * /");
        String operation = scanner.nextLine();
        System.out.println("Enter first operand:");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second operand (for division, zero is not acceptable):");
        int secondOperand = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "+":
                int resultAdd = add(firstOperand, secondOperand);
                System.out.println("The result of " + firstOperand + " " + operation + " " + secondOperand + " is " +  resultAdd + ".");
                break;
            case "-":
                int resultSubtract = subtract(firstOperand, secondOperand);
                System.out.println("The result of " + firstOperand + " " + operation + " " + secondOperand + " is " +  resultSubtract + ".");
                break;
            case "*":
                int resultMultiply = multiply(firstOperand, secondOperand);
                System.out.println("The result of " + firstOperand + " " + operation + " " + secondOperand + " is " +  resultMultiply + ".");
                break;
            case "/":
                int resultDivide = divide(firstOperand, secondOperand);
                System.out.println("The result of " + firstOperand + " " + operation + " " + secondOperand + " is " +  resultDivide + ".");
                break;
        }
    }

    static Integer add(int number1, int number2) {
        return number1 + number2;
    }
    static Integer subtract(int number1, int number2) {
        return number1 - number2;
    }
    static Integer multiply(int number1, int number2) {
        return number1 * number2;
    }
    static Integer divide(int number1, int number2) {
        return number1 / number2;
    }
}