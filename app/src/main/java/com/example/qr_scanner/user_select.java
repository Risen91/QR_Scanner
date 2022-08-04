package com.example.qr_scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user_select extends AppCompatActivity implements View.OnClickListener {
    private Button buttonActivity2;
    private Button button_user_Lewis;
    private Button button_user_Frank;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select);

        buttonActivity2 = findViewById(R.id.buttonActivity2);
        button_user_Lewis = findViewById(R.id.button_user_Lewis);
        button_user_Frank = findViewById(R.id.button_user_Frank);

        buttonActivity2.setOnClickListener(this);
        button_user_Lewis.setOnClickListener(this);
        button_user_Frank.setOnClickListener(this);

    }
    public void openActivity2() {
        Intent intent = new Intent(this, scan.class);
        startActivity(intent);
    }

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonActivity2:
                        openActivity2();
                        break;
                    case R.id.button_user_Lewis:
                        TextView text = findViewById(R.id.userName);
                        String user = String.format("Hello, Lewis");
                        text.setText(user);
                        break;
                    case R.id.button_user_Frank:
                        text = findViewById(R.id.userName);
                        user = String.format("Hello, Frank");
                        text.setText(user);
                        break;
                }
            }
        }