package com.company.V6.operations;

public class OperationFactory {
    public Operations getInstance(String operator){
        Operations operations = null ;
        if (operator.equals("+")) {
            // AddOperation addOperation = new AddOperation();
            // we assign operation object reference to common object . our common object reference is  "operations"
            operations =new AddOperation();
        } else if (operator.equals("avg")) {
            // AverageOperation averageOperation = new AverageOperation();
            operations = new AverageOperation();
        } else if (operator.equals("*")) {
            //MultiplicationOperatioin multiplicationOperatioin = new MultiplicationOperatioin();
            operations = new MultiplicationOperatioin();
        }
        return operations;
    }
}
