package com.cohentsedek.sweetdrink;

import com.cohentsedek.common.DataManagerBase;

import java.util.ArrayList;
import java.util.Random;

public class DataManagerSweetDrinks extends DataManagerBase {
    @Override
    public String getImage() {
        return "https://149449860.v2.pressablecdn.com/wp-content/uploads/2016/10/16212-No-sugary-drinks-logo.jpg";
    }

    @Override
    public String getSentences() {
        ArrayList<String> sentences = new ArrayList<String>();
        sentences.add("High sugar intake increases the risk of obesity and diabetes");
        sentences.add("Drinking sugary beverages regularly harms your teeth and gums");
        sentences.add("Excessive sugar consumption can lead to heart disease and metabolic disorders");
        Random rand = new Random();
        int randVal = rand.nextInt(sentences.size());
        return sentences.get(randVal);
    }
}
