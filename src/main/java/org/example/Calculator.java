package org.example;

import java.util.List;

public class Calculator {
    public static double calculate(List<Double> numbers, char operation) {
        double result = 0;

        if (operation == '+') {
            for (double num : numbers) {
                result += num;
            }
        } else if (operation == '*') {
            result = 1;
            for (double num : numbers) {
                result *= num;
            }
        } else {
            System.err.println("que les opérations + et * sont autorisés.");
        }

        return result;
    }
}

