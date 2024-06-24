package com.cohentsedekmultiapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cohentsedek.common.MSPV3;
import com.cohentsedek.common.PanelBaseActivity;

public class PanelActivity extends PanelBaseActivity {

    public static final String SP_KEY_SMOKING_COUNTER = "SMOKING_COUNTER";
    public static final String SP_KEY_SMOKING_START_DAY = "SMOKING_START_DAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerSmoking();
        super.onCreate(savedInstanceState);

        appManager.setCounter(MSPV3.getInstance().readInt(SP_KEY_SMOKING_COUNTER, 0));
        appManager.setStartDay(MSPV3.getInstance().readLong(SP_KEY_SMOKING_START_DAY, System.currentTimeMillis()));

        refreshUI();


    }

    @Override
    protected void onStop() {
        MSPV3.getInstance().saveInt(SP_KEY_SMOKING_COUNTER, appManager.getCounter());
        MSPV3.getInstance().saveLong(SP_KEY_SMOKING_START_DAY, appManager.getStartDay());
        super.onStop();


    }
}