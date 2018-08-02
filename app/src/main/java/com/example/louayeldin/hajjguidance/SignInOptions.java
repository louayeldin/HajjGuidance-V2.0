package com.example.louayeldin.hajjguidance;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignInOptions extends AppCompatActivity implements View.OnClickListener {

    ImageView hajjSignin, regSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_options);

        hajjSignin = (ImageView) findViewById(R.id.hajj_signin);
        regSignin = (ImageView) findViewById(R.id.reg_signin);

        hajjSignin.setOnClickListener(this);
        regSignin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            /** Comments **/
            case R.id.hajj_signin:
                Intent intent_opt1 = new Intent(SignInOptions.this,HajjSigninActivity.class) ;
                this.startActivity(intent_opt1);
                break;

            case R.id.reg_signin:
                Intent intent_opt2 = new Intent(SignInOptions.this, RegSigninActivity.class);
                this.startActivity(intent_opt2);
                break;
        }
    }
}
