package com.assone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.assone.R;

public class AssignmentTwoAcitiviy extends AppCompatActivity {

    private CheckBox checkBoxBookAvailable;
    private RadioButton radioButtonFiction, radioButtonNonFiction;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch switchLibraryOpen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignment_two_acitiviy);


        checkBoxBookAvailable = findViewById(R.id.checkBoxBookAvailable);
        radioButtonFiction = findViewById(R.id.radioButtonFiction);
        radioButtonNonFiction = findViewById(R.id.radioButtonNonFiction);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        switchLibraryOpen = findViewById(R.id.switchLibraryOpen);
        Button submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Library Management:\n");
                result.append("Book Available: ").append(checkBoxBookAvailable.isChecked() ? "Yes" : "No").append("\n");
                result.append("Genre: ").append(radioButtonFiction.isChecked() ? "Fiction" : "Non-Fiction").append("\n");
                result.append("Rating: ").append(ratingBar.getRating()).append("\n");
                result.append("Seek Bar Value: ").append(seekBar.getProgress()).append("\n");
                result.append("Library Open: ").append(switchLibraryOpen.isChecked() ? "Yes" : "No").append("\n");

                Toast.makeText(AssignmentTwoAcitiviy.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}