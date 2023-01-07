package com.company.V3;

import com.company.V3.input.CommandLineInput;
import com.company.V3.input.Input;
import com.company.V3.numberRepository.FileNumberRepository;
import com.company.V3.numberRepository.NumberRepository;
import com.company.V3.operations.*;
import com.company.V5.numberRepository.NumberRepositoryException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {
        Input input = new CommandLineInput();
        String operator = input.getOperator(args);
        //perform the operation
        NumberRepository numberRepository = new FileNumberRepository();
        int[] intnumbers = new int[0];
        intnumbers = numberRepository.read();
        double results = 0 ;
        //- Using Factory design pattern

        Operations operations = null;
        if (operator.equals("+")) {
            // AddOperation addOperation = new AddOperation();
            // we assign operation object reference to common object . our common object reference is  "operations"
            operations = new AddOperation();
        } else if (operator.equals("avg")) {
            // Average Operation averageOperation = new AverageOperation();
            operations = new AverageOperation();
        } else if (operator.equals("*")) {
            // multiplicationOperation = new MultiplicationOperation();
            operations = new MultiplicationOperatioin();
            results = operations.perform(intnumbers);
            System.out.println("Results is : " + results);

        }
    }
}

