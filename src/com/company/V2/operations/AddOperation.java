package com.company.V2.operations;

public class AddOperation {
    public double addNumbers(int[] array){
        double result=0;
        for(int i=0 ; i<array.length ; i++) {
            result += array[i] ;
        }
        return result;
    }
}
