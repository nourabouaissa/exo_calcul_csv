package org.example;

public class Output {
    public static void displayResults(double result, char operation) {
        System.out.println("       " + result);
        System.out.println("       " + operation + result + " (= " + result + ")");
        System.out.println("a-------");
        System.out.println("total = " + result + " (" + (operation == '+' ? "addition" : "multiplication") + ")");
    }
}




