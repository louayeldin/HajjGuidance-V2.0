package com.example.louayeldin.hajjguidance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HajjSigninActivity extends AppCompatActivity implements View.OnClickListener{

    Button nxt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hajj_activity_signin);

        nxt_btn = (Button)findViewById(R.id.nxt_btn);
        nxt_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(HajjSigninActivity.this,QrReaderActivity.class);
        startActivity(intent);
        finish();
    }
}
