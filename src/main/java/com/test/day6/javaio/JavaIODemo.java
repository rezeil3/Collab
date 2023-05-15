package com.accenture.day6.javaio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaIODemo {

    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\erika.ramos\\OneDrive - Accenture\\BED\\Java Series\\FY22.56" +
                "\\FY22.56\\src\\main\\java\\com\\accenture\\day6\\javaio\\cars.txt";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("Toyota\n");
            bufferedWriter.write("Mazda\n");
            bufferedWriter.write("Lexus\n");
            bufferedWriter.write("Suzuki");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            List<String> cars = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null){
                cars.add(line);
            }
            System.out.println("Cars: " + cars);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
