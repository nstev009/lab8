package com.example.lab8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText passwordInput = findViewById(R.id.passwordInput);
        Button checkButton = findViewById(R.id.validateButton);
        TextView resultText = findViewById(R.id.resultText);

        checkButton.setOnClickListener(v -> {
            String password = passwordInput.getText().toString();
            if (PasswordValidator.isValidPassword(password)) {
                resultText.setText("Password is valid.");
            } else {
                resultText.setText("Password is invalid.");
            }
        });
    }
}
