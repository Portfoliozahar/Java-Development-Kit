package org.example;

//TASK 1

public class Calculator {

    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }



    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Double.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public static <T extends Number> T mult(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public static void main(String[] args) {

        int intSumResult = Calculator.sum(100, 5);
        int intSubtractResult = Calculator.subtract(20, 233);
        double doubleDivideResult = Calculator.divide(100.2, 2.5);
        double doubleMultiplyResult = Calculator.mult(3.7, 2.21);

        System.out.println("Сумма: " + intSumResult);
        System.out.println("Разность: " + intSubtractResult);
        System.out.println("Деление: " + doubleDivideResult);
        System.out.println("Произведение: " + doubleMultiplyResult);
    }
}