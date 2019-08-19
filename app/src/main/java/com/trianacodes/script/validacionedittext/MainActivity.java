package com.trianacodes.script.validacionedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.et_Nombre);
        password = findViewById(R.id.et_password);
    }

    public void Registrar(View view){

        String nombre1 = nombre.getText().toString();
        String pass = password.getText().toString();

        if(nombre1.length() == 0){

            Toast.makeText(this,"El nombre no puede estar vacío", Toast.LENGTH_LONG).show();

        }

        if (pass.length() == 0){

            Toast.makeText(this,"La contraseña no puede estar vacía", Toast.LENGTH_LONG).show();

        }

        if (nombre1.length() != 0 && pass.length() != 0 ){

            Toast.makeText(this,"Comenzando el registro...", Toast.LENGTH_LONG).show();

        }

    }

}
