package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int threadCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();


        TextView threadCounterText = findViewById(R.id.thread_counter_txt);
        String newText = String.format("Thread Counter: %04d", threadCounter);
        threadCounterText.setText(newText);
    }

    public void onStartActivityB (View view) {
        Intent activityBIntent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(activityBIntent);
    }

    public void onStartActivityC (View view) {
        Intent activityCIntent = new Intent(MainActivity.this, ActivityC.class);
        startActivity(activityCIntent);
    }

    public void onTriggerDialog (View view) {
        ActivityDialog customDialog = new ActivityDialog(this);
        customDialog.show();
    }

    public void onCloseApp (View view) {
        finish();
        System.exit(0);
    }
}