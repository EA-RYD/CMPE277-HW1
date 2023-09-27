package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        MainActivity.threadCounter += 5;
    }

    @Override
    protected void onRestart() {
        MainActivity.threadCounter += 5;
        super.onRestart();
    }

    public void onFinishActivityB(View view) {
        finish();
    }
}