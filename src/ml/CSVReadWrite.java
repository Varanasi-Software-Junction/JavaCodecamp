package ml;

import java.io.*;
import java.util.*;

public class CSVReadWrite {

    // Method to read data from a CSV file
    public static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return data;
    }

    // Method to write data to a CSV file
    public static void writeCSV(String filePath, List<String[]> data) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                pw.println(String.join(",", row));
            }
            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "c:\\JavaCodecamp\\src\\ml\\input.csv";
        String outputFilePath = "output.csv";

        // Reading CSV file
        List<String[]> data = readCSV(inputFilePath);
        System.out.println("Data from CSV:");
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }

        // Writing to another CSV file
        writeCSV(outputFilePath, data);
    }
}
