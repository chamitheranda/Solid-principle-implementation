package com.company.V3.numberRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{
    public int[] read() throws IOException {
        // read the numbers from the number find and store it list name as lines
        List<String> lines = Files.readAllLines(Paths.get("D:\\Videos\\DesktopApplication\\sc-day01\\src\\com\\company\\numbers.txt"));
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
