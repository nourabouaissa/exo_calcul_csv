package org.example;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        String fileName = "numbers.csv";
        char operation = '+';

        List<Double> numbers = CSVReader.readCSV(fileName);
        double result = Calculator.calculate(numbers, operation);

        Output.displayResults(result, operation);
    }
}


