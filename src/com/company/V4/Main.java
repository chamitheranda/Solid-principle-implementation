package com.company.V4;

import com.company.V4.input.CommandLineInput;
import com.company.V4.input.Input;
import com.company.V4.numberRepository.FileNumberRepository;
import com.company.V4.numberRepository.NumberRepository;
import com.company.V4.operations.OperationFactory;
import com.company.V4.operations.Operations;

import java.io.IOException;

public class Main {

    public static  void main(String[] args) throws IOException {
        Input input  = new CommandLineInput();
        String operator = input.getOperator(args);
        //perform the operation
        NumberRepository numberRepository  = new FileNumberRepository();
        int[] intnumbers = numberRepository.read();
        double results = 0 ;
        //- Using Factory design pattern
        OperationFactory operationFactory = new OperationFactory();
        Operations operations=operationFactory.getInstance(operator);
        results = operations.perform(intnumbers);
        System.out.println("Results is : " + results);

        }
    }

