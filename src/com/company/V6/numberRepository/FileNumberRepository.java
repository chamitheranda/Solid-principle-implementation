package com.company.V6.numberRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    public int[] read() throws NumberRepositoryException {
        String filePath = "D:\\Videos\\DesktopApplication\\sc-day01\\src\\com\\company\\numbers.txt";
        List<String> lines = null;
        // read the numbers from the number find and store it list name as lines
        try{
            lines =  Files.readAllLines(Paths.get(filePath));
        }catch (IOException exception){
            throw new NumberRepositoryException("File Number reading lost . file path is : " + filePath , exception);
        }
        String firstline = lines.get(0);
        String[] numbers = firstline.split(",");
        // convert string array to integer array
        int[] intNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumber[i] = Integer.parseInt(numbers[i]);
        }
        return intNumber ;
    }
}
