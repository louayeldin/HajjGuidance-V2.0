package com.example.louayeldin.hajjguidance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private final int PRIVATE_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,SignInOptions.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        }, PRIVATE_DISPLAY_LENGTH);


    }
}
