package com.example.moreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_activity);

        TextView textViewHelloCounter = findViewById(R.id.textView5);
        int receivedCounter = getIntent().getIntExtra("COUNTER_VALUE", 0);
        textViewHelloCounter.setText(String.valueOf(receivedCounter));
    }
    public void goToActivity1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}