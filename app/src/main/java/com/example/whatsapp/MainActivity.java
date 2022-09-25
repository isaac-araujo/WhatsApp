package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText phone;
    private EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.phone_input);
        button = findViewById(R.id.button);
        msg = findViewById(R.id.msg);

        button.setOnClickListener(view -> {
            String phoneNumber = phone.getText().toString();
            String message = msg.getText().toString();

            if (!phoneNumber.isEmpty() && !message.isEmpty()){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/" + phoneNumber + "?text=" + message));
                startActivity(intent);
            }
        });


    }
}