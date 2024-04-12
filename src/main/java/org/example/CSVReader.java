package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Double> readCSV(String fileName) {
        List<Double> numbers = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                numbers.add(Double.parseDouble(line.trim()));
            }
        } catch (IOException e) {
            System.err.println("erreur lors de lecture du  CSV : " + e.getMessage());
        }

        return numbers;
    }
}

