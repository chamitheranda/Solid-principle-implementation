package com.company.V2;

import com.company.V2.operations.AddOperation;
import com.company.V2.operations.AverageOperation;
import com.company.V2.operations.MultiplicationOperatioin;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CommandLineInput commandLineInput = new CommandLineInput();
        String operator = commandLineInput.getOperator(args);
        //perform the operation
        FileNumberRepository fileNumberRepository = new FileNumberRepository();
        int[] intnumbers = fileNumberRepository.read();
            if (operator.equals("+")) {
                AddOperation addOperation = new AddOperation();
                double results = addOperation.addNumbers(intnumbers);
                System.out.println("Summention is : " + results);
            } else if (operator.equals("avg")) {
                AverageOperation averageOperation = new AverageOperation();
                double results = averageOperation.getAverage(intnumbers);
                System.out.println("Multiplication is : " + results);
            } else if (operator.equals("*")) {
                MultiplicationOperatioin multiplicationOperatioin = new MultiplicationOperatioin();
                double results = multiplicationOperatioin.multipleNumbers(intnumbers);
                System.out.println("Multiplication is : " + results);
            }

        }
    }

