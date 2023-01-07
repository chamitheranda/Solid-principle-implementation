package com.company.V5;

import com.company.V5.input.CommandLineInput;
import com.company.V5.input.Input;
import com.company.V5.input.InputException;
import com.company.V5.numberRepository.FileNumberRepository;
import com.company.V5.numberRepository.NumberRepository;
import com.company.V5.numberRepository.NumberRepositoryException;
import com.company.V5.operations.OperationFactory;
import com.company.V5.operations.Operations;

import java.io.IOException;

public class Main {

    public static  void main(String[] args)  {
        Input input = new CommandLineInput();
        String operator = null;
        try {
            operator = input.getOperator(args);
        }catch (InputException e){

        }
        //perform the operation
        NumberRepository numberRepository = new FileNumberRepository();
        int[] intnumbers = null;
        try {
            intnumbers = numberRepository.read();
        }catch (NumberRepositoryException exception){
            //System.out.println(exception); Bad practice
            //Write detail about error to log file using library like log4j .
            //Logger.error( "Exception occurring when file is reading " , exception ) ;

            return;
        }
        double results = 0 ;
        //- Using Factory design pattern
        OperationFactory operationFactory = new OperationFactory();
        Operations operations=operationFactory.getInstance(operator);

        results = operations.perform(intnumbers);


        System.out.println("Results is : " + results);

        }
    }

