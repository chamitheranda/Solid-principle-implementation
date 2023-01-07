package com.company.V4.operations;

public class AddOperation implements Operations {
    public double perform(int[] array){
        double result=0;
        for(int i=0 ; i<array.length ; i++) {
            result += array[i] ;
        }
        return result;
    }

}
