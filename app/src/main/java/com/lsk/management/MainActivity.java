package com.lsk.management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText idText = null;
    private EditText passwordText = null;
    private Button loginButton = null;
    private TextView registerButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = (EditText) findViewById(R.id.idText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        loginButton = (Button) findViewById((R.id.loginButton));
        registerButton = (TextView) findViewById(R.id.registerButton);

        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent registerIntent = new Intent(MainActivity.this, com.lsk.management.RegisterActivity.class);
        MainActivity.this.startActivity(registerIntent);
    }
}