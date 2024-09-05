package com.assone;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


import com.example.assone.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = findViewById(R.id.buttonCancel);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        ImageView img = findViewById(R.id.img_cart);

        btnNext.setOnClickListener(v->{
            Toast.makeText(this, "Next button clicked!!!", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.mine);

        });

        btnPrevious.setOnClickListener(v->{
            Toast.makeText(this, "previous button clicked!!!", Toast.LENGTH_SHORT).show();

            img.setImageResource(R.drawable.coverpic);
        });


    }
}