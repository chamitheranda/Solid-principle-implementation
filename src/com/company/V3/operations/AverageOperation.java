package com.company.V3.operations;

public class AverageOperation implements Operations {

    public double perform(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

}
