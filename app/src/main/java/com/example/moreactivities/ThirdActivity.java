package com.example.moreactivities;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private void goToActivity2(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        startActivity(intent);
    }
    private void goToActivity1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
