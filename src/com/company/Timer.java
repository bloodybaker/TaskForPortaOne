package com.company;

public class Timer {
    private long timer;
    public void start(){
        timer = System.currentTimeMillis();
    }
    public void stop(){
        timer = System.currentTimeMillis() - timer;
    }
    public long getTimer(){
        return timer;
    }
}
