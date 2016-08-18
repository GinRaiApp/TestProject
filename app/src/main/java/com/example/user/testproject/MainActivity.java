package com.example.user.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtTni = (EditText)findViewById(R.id.edtUser);
        final EditText edtPassword = (EditText)findViewById(R.id.edtPass);

        final Button btnLogin = (Button)findViewById(R.id.btnLogin);
        final TextView RegisterLink = (TextView)findViewById(R.id.btnNewRegister);

        RegisterLink.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}
