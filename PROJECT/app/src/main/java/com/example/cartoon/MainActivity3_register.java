package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_register2);

        TextView name = findViewById(R.id.editTextEmail);
        TextView usre = findViewById(R.id.editTextName);
        TextView password = findViewById(R.id.editTextPassword);
        TextView bdate = findViewById(R.id.editTextbday);
        Button register = findViewById(R.id.register2);
        TextView login = findViewById(R.id.login2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toregister2 = new Intent(MainActivity3_register.this,finish_register.class);
                startActivity(toregister2);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tologin2 = new Intent(MainActivity3_register.this,MainActivity3_login.class);
                startActivity(tologin2);

            }
        });
    }
}