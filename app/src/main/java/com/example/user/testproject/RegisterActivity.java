package com.example.user.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText edtTni = (EditText)findViewById(R.id.edtTni_Id);
        final EditText edtPassword = (EditText)findViewById(R.id.edtPassword);
        final EditText edtName = (EditText)findViewById(R.id.edtName);
        final Button btnRegister = (Button)findViewById(R.id.btnRegister);
    }
}
