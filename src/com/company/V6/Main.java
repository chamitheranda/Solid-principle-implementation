package com.company.V6;

import com.company.V6.input.CommandLineInput;
import com.company.V6.input.Input;
import com.company.V6.numberRepository.FileNumberRepository;
import com.company.V6.numberRepository.NumberRepository;
import com.company.V6.operations.OperationFactory;
import com.company.V6.output.CommandLineOutput;
import com.company.V6.output.Output;

public class Main {

    public static  void main(String[] args)  {
        Input input = new CommandLineInput(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        Output output =  new CommandLineOutput();
        Calculator calculator = new Calculator
                (
                        input,
                        numberRepository,
                        operationFactory,
                        output
                );
        calculator.execute();

        }
    }

