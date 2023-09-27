package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class ActivityC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        MainActivity.threadCounter += 10;
    }

    @Override
    protected void onRestart() {
        MainActivity.threadCounter += 10;
        super.onRestart();
    }

    public void onFinishActivityC(View view) {
        finish();
    }
}
