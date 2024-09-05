package com.assone;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
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

        TextView textViewOne = findViewById(R.id.text_ViewOne);

        btnNext.setOnClickListener(v->{
            Toast.makeText(this, "Next button clicked!!!", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.mine2);
            textViewOne.setText("I'm Mahbubur Rahman Mahbub, a dedicated and professional web designer with expertise in HTML, CSS, Bootstrap, JavaScript, jQuery, React.js, Vue.js, and more. With over two years of experience in frontend development and a passion for creating stunning web applications, I've successfully completed numerous projects for satisfied clients");

        });

        btnPrevious.setOnClickListener(v->{
            Toast.makeText(this, "previous button clicked!!!", Toast.LENGTH_SHORT).show();

            img.setImageResource(R.drawable.mine);
            textViewOne.setText("My expertise lies in web design, development, customization, and optimization. I specialize in crafting visually appealing and user-friendly websites using the latest technologies like HTML, CSS, Bootstrap, JavaScript, and React.js. Whether you need a new design from scratch, a responsive website, a landing page, or fixes for an existing site, I'm here to help.\n");
        });


    }
}