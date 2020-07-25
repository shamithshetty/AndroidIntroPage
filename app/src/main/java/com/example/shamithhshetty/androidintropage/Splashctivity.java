package com.example.shamithhshetty.androidintropage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Splashctivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashctivity);

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.white));
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Homeintent;
                Homeintent=new Intent(Splashctivity.this,IntroActivity.class);
                overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
                startActivity(Homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
