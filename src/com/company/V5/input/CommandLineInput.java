package com.company.V5.input;

public class CommandLineInput implements Input {

    public String getOperator(String args[]) throws InputException {
        if(args == null || args.length==0){
            throw new InputException("Command line argument is empty") ;
        }
        return args[0];
    }
}

// This have unchecked exception . we have to handle it using validations . If command line argument dosent have element this exception is occur .