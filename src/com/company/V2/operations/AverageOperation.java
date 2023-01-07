package com.company.V2.operations;

public class AverageOperation {
    public double getAverage(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }
}
