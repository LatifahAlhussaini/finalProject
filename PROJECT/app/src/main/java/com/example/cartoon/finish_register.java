package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class finish_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_register);

        Handler f = new Handler(getMainLooper());
        f.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent F = new Intent(finish_register.this,MainActivity3_login.class);
                startActivity(F);

            }
        },4000);

    }
}