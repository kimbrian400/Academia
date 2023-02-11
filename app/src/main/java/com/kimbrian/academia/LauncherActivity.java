package com.kimbrian.academia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LauncherActivity extends AppCompatActivity {
    public static int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(LauncherActivity.this,MainActivity.class);
            LauncherActivity.this.startActivity(mainIntent);
            LauncherActivity.this.finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}
