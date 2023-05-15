package com.accenture.day6.javaio.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingData {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filePath = "C:\\Users\\erika.ramos\\OneDrive - Accenture\\BED\\Java Series\\FY22.56" +
                "\\FY22.56\\src\\main\\java\\com\\accenture\\day6\\javaio\\implementation\\";

        System.out.println("CSV FILE READING");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + "faculty.csv"));
        String line = "";
        List<Faculty> faculties = new ArrayList<>();

        while ((line =bufferedReader.readLine()) != null){
            String[] value = line.split(",");

            int id = Integer.parseInt(value[0]);
            String clearanceLevel = value[1];
            String name = value[2];
            //Faculty faculty = new Faculty(id, value[1], value[2] );
            Faculty faculty = new Faculty(id, clearanceLevel, name);

            faculties.add(faculty);
        }
        System.out.println("Faculties: \n" + faculties);
        bufferedReader.close();

        System.out.println("TEXT FILE READING");
        BufferedReader br = new BufferedReader(new FileReader(filePath + "faculty.txt"));
        String data = "";
        List<Faculty> facultyList = new ArrayList<>();

        while ((data =br.readLine()) != null){
            int id = Integer.parseInt(data.substring(0,5));
            String clearanceLevel = data.substring(5,9);
            String name = data.substring(9);
            Faculty faculty = new Faculty(id, clearanceLevel, name);

            facultyList.add(faculty);
        }
        System.out.println("Faculties: \n" + facultyList);
        br.close();
    }
}
