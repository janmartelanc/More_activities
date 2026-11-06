package com.example.moreactivities;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    public void goToActivity1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
