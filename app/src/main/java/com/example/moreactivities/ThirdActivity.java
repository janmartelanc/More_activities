package com.example.moreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);

        TextView textViewThirdCounter = findViewById(R.id.textView8);
        View rootLayout = findViewById(R.id.rootLayout);
        int receivedCounter = getIntent().getIntExtra("COUNTER_VALUE", 0);
        textViewThirdCounter.setText(String.valueOf(receivedCounter));

        rootLayout.setOnTouchListener(new OnSwipeTouchListener(ThirdActivity.this) {
            @Override
            public void onSwipeLeft() {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onSwipeRight() {
                Intent intent = new Intent(ThirdActivity.this, HelloActivity.class);
                intent.putExtra("COUNTER_VALUE", receivedCounter);
                startActivity(intent);
            }
        });
    }
    public void goToActivity1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void goToActivity2(View view) {
        startActivity(new Intent(this, HelloActivity.class));
    }
}