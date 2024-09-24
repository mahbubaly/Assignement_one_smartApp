package com.assone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assone.R;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private TextView mLoadingText;
    private View mContentLayout;  // The layout that holds your main content (to show after loading)
    private View mLoadingLayout;  // The layout that holds your loading components

    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to buttons, image view, and text
        Button btnNext = findViewById(R.id.buttonCancel);
        Button btnPrevious = findViewById(R.id.btnPrevious);
        Button btnAssignmentTwo = findViewById(R.id.assignmentTwo);

        ImageView img = findViewById(R.id.img_cart);
        TextView textViewOne = findViewById(R.id.text_ViewOne);

        // ProgressBar, Loading text, and layouts
        mProgressBar = findViewById(R.id.progressbar);
        mLoadingText = findViewById(R.id.loadingText);
        mContentLayout = findViewById(R.id.content_layout); // Main content layout
        mLoadingLayout = findViewById(R.id.loading_layout); // Loading layout

        // Initially hide the content layout and show the loading layout
        mContentLayout.setVisibility(View.GONE); // Hide content initially
        mLoadingLayout.setVisibility(View.VISIBLE); // Show loading layout initially

        // Start the loading process
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100) {
                    mProgressStatus++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        // When the progress reaches 100%, hide the loading layout and show the content
                        mLoadingLayout.setVisibility(View.GONE);  // Hide loading layout
                        mContentLayout.setVisibility(View.VISIBLE);  // Show content layout
                    }
                });
            }
        }).start();

        // Handle button clicks
        btnNext.setOnClickListener(v -> {
            Toast.makeText(this, "Next button clicked!!!", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.mine2);
            textViewOne.setText("I'm Mahbubur Rahman Mahbub, a dedicated and professional web designer with expertise in HTML, CSS, Bootstrap, JavaScript, jQuery, React.js, Vue.js, and more...");
        });

        btnPrevious.setOnClickListener(v -> {
            Toast.makeText(this, "Previous button clicked!!!", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.mine);
            textViewOne.setText("My expertise lies in web design, development, customization, and optimization...");
        });

        btnAssignmentTwo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AssignmentTwoAcitiviy.class);
            startActivity(intent);
        });

    }
}
