package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {
    private final ArrayList<Long> arrayList = new ArrayList<>();
    public void readFile(){
        try {
            File file = new File("10m.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String string;
            while ((string = bufferedReader.readLine()) != null){
                arrayList.add(Long.parseLong(string.trim()));
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<Long> getArrayList() {
        return arrayList;
    }
}
