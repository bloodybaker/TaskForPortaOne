package com.company;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        Reader reader = new Reader();
        reader.readFile();
        LengthCounter lc = new LengthCounter(reader.getArrayList());
        lc.calculate();
        SorterAndAnalizer sa = new SorterAndAnalizer(reader.getArrayList());
        sa.sort();
        timer.stop();
        ResultPrinter resultPrinter = new ResultPrinter(
                sa.getMin(),
                sa.getMax(),
                sa.getAvarage(),
                sa.getMediana(),
                lc.getMaximum(),
                lc.getMinimum(),
                timer.getTimer());
        resultPrinter.printData();
    }
}
