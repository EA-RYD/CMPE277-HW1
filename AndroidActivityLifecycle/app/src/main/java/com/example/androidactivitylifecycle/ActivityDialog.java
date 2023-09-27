package com.example.androidactivitylifecycle;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityDialog extends AlertDialog {

    protected ActivityDialog(Context context) {
        super(context, android.R.style.Theme_Material_Light_Dialog);

        // Set the title text and center-align it
        TextView title = new TextView(context);
        title.setText("Simple Dialog");
        title.setTextSize(32);
        title.setTextColor(context.getResources().getColor(android.R.color.white));
        title.setGravity(Gravity.CENTER);
        setCustomTitle(title);

        // Create a custom positive button
        Button customPositiveButton = new Button(context);
        customPositiveButton.setText("Close");
        customPositiveButton.setBackgroundColor(context.getResources().getColor(android.R.color.darker_gray));
        customPositiveButton.setTextColor(context.getResources().getColor(android.R.color.black));

        // Create a LinearLayout container
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);


        // Set layout parameters for the button
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        buttonParams.setMargins(350, 80, 350, 80); // Adjust margins as needed

        // Add the custom button to the LinearLayout
        customPositiveButton.setLayoutParams(buttonParams);
        layout.addView(customPositiveButton);

        // Add the LinearLayout to the AlertDialog's layout
        setView(layout);



        // Set the background color of the dialog window to #ff8a03
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.parseColor("#ff8a03")));


        // Set an OnClickListener for the custom positive button
        customPositiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss(); // Dismiss the dialog when the button is clicked
            }
        });
    }
}