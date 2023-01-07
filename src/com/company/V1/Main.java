package com.company.V1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        //operator read using commandline argument
        String operator = args[0];
         // read the numbers from the number find and store it list name as lines
        List<String> lines = Files.readAllLines(Paths.get("D:\\Videos\\DesktopApplication\\sc-day01\\src\\com\\company\\numbers.txt"));
        String firstline = lines.get(0);
        String[] numbers = firstline.split(",");
         // convert string array to integer array
        int [] intNumber = new int [numbers.length];
        for (int i =0 ; i< numbers.length ; i++){
            intNumber[i] = Integer.parseInt(numbers[i]);
        }
        //perform the operation
        if(operator.equals("+")){
            double result = 0 ;
            for (int i = 0; i<numbers.length ; i++){
                result += intNumber[i];
            }
            System.out.println("output : " + result);

        }else if (operator.equals("avg")){
            double result = 0 ;
            for (int i = 0; i<numbers.length ; i++){
                result += intNumber[i];

            }
            result = result/ numbers.length ;
            System.out.println("output : " + result);

        }else if(operator.equals("*")){
            double result = 1;
            for(int i=0; i<numbers.length ; i++){
                result *= intNumber[i];
            }
            System.out.println("output : "+ result);
        }

    }
}