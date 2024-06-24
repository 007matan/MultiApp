package com.cohentsedek.sweetdrink;

import android.os.Bundle;


import com.cohentsedek.common.MSPV3;
import com.cohentsedek.common.PanelBaseActivity;

public class PanelActivity extends PanelBaseActivity {

    public static final String SP_KEY_SWEET_DRINKS_COUNTER = "SWEET_DRINKS_COUNTER";
    public static final String SP_KEY_SWEET_DRINKS_START_DAY = "SWEET_DRINKS_START_DAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerSweetDrinks();
        super.onCreate(savedInstanceState);
        appManager.setCounter(MSPV3.getInstance().readInt(SP_KEY_SWEET_DRINKS_COUNTER, 0));
        appManager.setStartDay(MSPV3.getInstance().readLong(SP_KEY_SWEET_DRINKS_START_DAY, System.currentTimeMillis()));

        refreshUI();



    }

    @Override
    protected void onStop() {
        super.onStop();

        MSPV3.getInstance().saveInt(SP_KEY_SWEET_DRINKS_COUNTER, appManager.getCounter());
        MSPV3.getInstance().saveLong(SP_KEY_SWEET_DRINKS_START_DAY, appManager.getStartDay());
    }
}