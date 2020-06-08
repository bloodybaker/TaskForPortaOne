package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SorterAndAnalizer {
    private ArrayList<Long> arrayList;
    private double averageValue = 0;
    public SorterAndAnalizer(ArrayList<Long> arrayList) {
        this.arrayList = arrayList;
    }
    public void sort(){
        Collections.sort(arrayList);
    }
    public double getAvarage(){
        for (double i: arrayList) {
            averageValue += i/arrayList.size();
        }
        return averageValue;
    }
    public Long getMin(){
        return arrayList.get(0);
    }
    public Long getMax(){
        return arrayList.get(arrayList.size()-1);
    }
    public Long getMediana(){
        if(arrayList.size() % 2 != 0){
            return arrayList.get(arrayList.size()/2);
        }else {
            return (arrayList.get(arrayList.size() / 2) +
                    arrayList.get(((arrayList.size() - 1) / 2) - 1));
        }
    }
}
