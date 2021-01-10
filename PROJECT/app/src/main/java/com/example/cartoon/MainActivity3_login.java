package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_login);

        TextView user = findViewById(R.id.editTextName2);
        TextView password = findViewById(R.id.editTextPassword);
        Button log_in = findViewById(R.id.gotocharacter);

        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent togo = new Intent(MainActivity3_login.this,MainActivity_Main.class);
                startActivity(togo);

            }
        });



    }
}