package com.mc74.lucchettoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText password;
    private Button sendToSecondActivity;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = findViewById(R.id.editTextPassword);
        sendToSecondActivity = findViewById(R.id.buttonLogin);

        sendToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (!password.getText().toString().equals("1234")) {
                    toast = Toast.makeText(getApplicationContext(), "Password errata",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    startIntent();
                                }
            }
        });
    }

    private void startIntent(){
        Intent intent = new Intent();
        intent.setAction("com.mc74.lucchettoapp.startSecondActivity");
        startActivity(intent);
    }

}
