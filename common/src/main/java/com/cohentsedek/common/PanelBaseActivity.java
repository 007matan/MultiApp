package com.cohentsedek.common;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class PanelBaseActivity extends AppCompatActivity {


    private AppCompatTextView id_TXT_VEW_counter;
    private AppCompatTextView id_TXT_VEW_days;
    private AppCompatImageButton id_BTN_plus;
    private AppCompatImageView id_IMG_main;
    private AppCompatTextView id_TXT_VEW_avg;
    protected AppManager appManager;
    protected DataManagerBase dataManagerBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_panel);

        appManager = new AppManager(dataManagerBase);

        findViews();
        initViews();



    }

    protected void refreshUI(){
        id_TXT_VEW_days.setText(String.valueOf(appManager.getNumberOfDays()));
        id_TXT_VEW_counter.setText(String.valueOf(appManager.getCounter()));
        Glide.with(this).load(appManager.getImageUrl()).into(id_IMG_main);
        String avgFormat = String.format("%.1f",(double)appManager.getCounter() / (appManager.getNumberOfDays()));
        id_TXT_VEW_avg.setText(avgFormat);
    }
    private void initViews() {
        id_BTN_plus.setOnClickListener(v->performPlusClick());
    }

    private void performPlusClick() {
        appManager.addToCounter();
        refreshUI();
        Toast.makeText(this, "" + appManager.getSentence(), Toast.LENGTH_LONG).show();

    }

    private void findViews() {
        id_IMG_main = findViewById(R.id.id_IMG_main);
        id_TXT_VEW_counter = findViewById(R.id.id_TXT_VEW_counter);
        id_TXT_VEW_days = findViewById(R.id.id_TXT_VEW_days);
        id_BTN_plus = findViewById(R.id.id_BTN_plus);
        id_TXT_VEW_avg = findViewById(R.id.id_TXT_VEW_avg);
    }
}