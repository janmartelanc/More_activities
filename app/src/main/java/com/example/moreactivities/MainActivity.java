package com.example.moreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textViewCounter = findViewById(R.id.textView);
        Button buttonCount = findViewById(R.id.button3);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textViewCounter.setText(String.valueOf(count));
            }
        });
    }

    public void goToActivity2(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("COUNTER_VALUE", count);
        startActivity(intent);
    }

    public void goToActivity3(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("COUNTER_VALUE", count);
        startActivity(intent);
    }
}