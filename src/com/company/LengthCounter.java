package com.company;

import java.util.ArrayList;

public class LengthCounter {
    private ArrayList<Long> arrayList;
    private double minimum = 1;
    private double mcount = 1;
    private double maximum = 1;
    private double count = 1;

    public LengthCounter(ArrayList<Long> arrayList) {
        this.arrayList = arrayList;
    }
    public void calculate(){
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
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }
}
