package com.meriem.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText _txtLogin, _txtPassword;
    Button _btnConnexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtLogin = (EditText) findViewById(R.id.txtLogin);
        _txtPassword = (EditText) findViewById(R.id.txtPwd);
        _btnConnexion = (Button) findViewById(R.id.btnConnexion);
        _btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _Login = _txtLogin.getText().toString();
                String _pwd = _txtPassword.getText().toString();
                if (_Login.equals("toto") && _pwd.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Bienvenue", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Erreur de connexion", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
