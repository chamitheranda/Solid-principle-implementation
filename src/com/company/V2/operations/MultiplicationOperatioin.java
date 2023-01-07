package com.company.V2.operations;

public class MultiplicationOperatioin {
    public double multipleNumbers(int[] array) {
        double result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }
}
