package com.cohentsedek.common;

public class AppManager {

    private DataManagerBase dataManagerBase;
    private int counter = 0;
    private long startDay = -1;

    public AppManager(){}
    public AppManager(DataManagerBase dataManagerBase){
        this.dataManagerBase = dataManagerBase;
    }
    public int avgPerDay(){
        return 0;
    }
    public int addToCounter(){
        return ++counter;
    }
    public void setStartDay(long startDate){
        startDay = startDate;
        //callback
    }
    public int getNumberOfDays(){
        //if(startDay == -1)
        //this.startDay = System.currentTimeMillis();
        long timeDifference = Math.abs(System.currentTimeMillis() - startDay);
        return (int)(timeDifference / (1000 * 60 * 60 * 24) + 1);
    }

    public String getSentence(){
        return dataManagerBase.getSentences();
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter){
        this.counter = counter;
        //callback
    }

    public long getStartDay() {
        return startDay;
    }

    public String getImageUrl(){
        return dataManagerBase.getImage();
    }
}
