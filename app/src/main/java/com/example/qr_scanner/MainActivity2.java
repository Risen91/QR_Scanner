package com.example.qr_scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button button_mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button_mainMenu = (Button) findViewById(R.id.button_mainMenu);
        button_mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}