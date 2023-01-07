package com.company.V5.operations;

public class MultiplicationOperatioin implements Operations {
    public double perform(int[] array) {
        double result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }
}
