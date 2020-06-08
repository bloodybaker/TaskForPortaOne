package com.company;

import java.text.DecimalFormat;

public class ResultPrinter {
    private long minValue;
    private long maxValue;
    private double average;
    private long mediana;
    private double minimum;
    private double maximum;
    private long timer;

    public ResultPrinter(long minValue, long maxValue, double average, long mediana, double minimum, double maximum, long timer) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.average = average;
        this.mediana = mediana;
        this.minimum = minimum;
        this.maximum = maximum;
        this.timer = timer;
    }

    public void printData(){
        System.out.println("Min: " + minValue  + " Max: " + maxValue);
        String formattedDouble = new DecimalFormat("#0.00000").format(average);
        System.out.println("Average: " + formattedDouble);
        System.out.println("Mediana: " + mediana);
        System.out.println("Length up: " + maximum);
        System.out.println("Length down: " + minimum);
        System.out.println("Time of execution: " + timer/1000.0);
    }
}
