package com.cohentsedekmultiapp;

import com.cohentsedek.common.DataManagerBase;

import java.util.ArrayList;
import java.util.Random;

public class DataManagerSmoking extends DataManagerBase {
    @Override
    public String getImage() {
        return "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiBhLud6gnPs6tdrFz1NYYocbu5HB2VGRnHkIotK6ZwGO5R_bsH8tWZsHgl-k7D5eFiGg&usqp=CAU";
    }

    @Override
    public String getSentences() {
        ArrayList<String> sentences = new ArrayList<String>();
        sentences.add("Smoking kills");
        sentences.add("Smoking seriously harms you and others around you");
        sentences.add("Quitting smoking now greatly reduce serious risks tou your health");
        Random rand = new Random();
        int randVal = rand.nextInt(sentences.size());
        return sentences.get(randVal);
    }
}
