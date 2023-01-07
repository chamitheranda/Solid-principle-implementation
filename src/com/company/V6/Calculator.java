package com.company.V6;

import com.company.V6.input.Input;
import com.company.V6.input.InputException;
import com.company.V6.numberRepository.NumberRepository;
import com.company.V6.numberRepository.NumberRepositoryException;
import com.company.V6.operations.OperationFactory;
import com.company.V6.operations.Operations;
import com.company.V6.output.CommandLineOutput;
import com.company.V6.output.Output;

public class Calculator {
    private Input input;
    private NumberRepository numberRepository;
    private OperationFactory operationFactory;
    private Output output;

    public Calculator(
            Input input,
            NumberRepository numberRepository,
            OperationFactory operationFactory,
            Output output
            ) {
        this.input = input;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.output = output;
    }



    public void execute(){
        String operator = null;
        try {
            operator = input.getOperator();
        }catch (InputException e){

        }
        //perform the operation
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
        Operations operations=operationFactory.getInstance(operator);
        results = operations.perform(intnumbers);
        output.show(results);
    }
}
