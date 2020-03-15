package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        long temptime = System.currentTimeMillis();
        double averageValue = 0;
        ArrayList<Long> arrayList = new ArrayList<>();
        try {
            File file = new File("10m.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String string;
            while ((string = bufferedReader.readLine()) != null){
                arrayList.add(Long.parseLong(string.trim()));
            }
            System.out.println("Size: " + arrayList.size());
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        double minimum = 1;
        double mcount = 1;
        double maximum = 1;
        double count = 1;
        for(int i = 1; i < arrayList.size(); i++ )
        {
            if((double)arrayList.get(i) / (double)arrayList.get(i - 1) >= 1) {
                count++;
            }
            else if(arrayList.get(i - 1) <= 0 & arrayList.get(i) >=0){
                count++;
            }
            else if(arrayList.get(i - 1) < 0 & arrayList.get(i) < 0) {
                if((double)arrayList.get(i - 1) /(double)arrayList.get(i) >= 1) {
                    count++;
                }
            }
            else if(count > maximum) {
                maximum = count;
            }else {
                count = 1;
            }
        }
        for(int i = 1; i < arrayList.size(); i++ )
        {
            if((double)arrayList.get(i - 1) / (double)arrayList.get(i) >= 1){
                mcount++;
            }
            else if (arrayList.get(i - 1) >= 0 & arrayList.get(i) <= 0){
                mcount++;
            }
            else if(arrayList.get(i - 1) < 0 & arrayList.get(i) < 0){
                if((double)arrayList.get(i) / (double)arrayList.get(i - 1) >= 1) {
                    mcount++;
                }
            }
            else if(mcount > minimum){
                minimum = mcount;
            }
            else {
                mcount = 1;
            }
        }
        Collections.sort(arrayList);
        System.out.println("Min: " + arrayList.get(0) + " Max: "
                + arrayList.get(arrayList.size()-1));
        for (double i: arrayList) {
            averageValue += i/arrayList.size();
        }
        String formattedDouble = new DecimalFormat("#0.00000").format(averageValue);
        System.out.println("Average: " + formattedDouble);
        if(arrayList.size() % 2 != 0){
            System.out.println("Mediana: " +
                    arrayList.get(arrayList.size()/2));
        }else {
            System.out.println("Mediana: " +
                    arrayList.get(arrayList.size()/2)+
                    arrayList.get(((arrayList.size()-1)/2)-1));
        }
        System.out.println("Length up: " + maximum);
        System.out.println("Length down: " + minimum);
        System.out.println("Time of execution: " + (System.currentTimeMillis()-temptime)/1000.d);
    }
}
