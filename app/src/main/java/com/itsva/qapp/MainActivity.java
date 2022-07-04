package com.itsva.qapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    EditText mat1;
    EditText mat2;
    EditText mat3;
    MaterialButton btn;
    MaterialButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo=(TextView) findViewById(R.id.titulo);
        mat1=(EditText) findViewById(R.id.mat1);
        mat2=(EditText) findViewById(R.id.mat2);
        mat3=(EditText) findViewById(R.id.mat3);
        btn=(MaterialButton) findViewById(R.id.btn);
        btn2=(MaterialButton) findViewById(R.id.btn2);

    }

    public void evaluar(View v){
        if (!mat1.getText().toString().isEmpty() && !mat2.getText().toString().isEmpty() && !mat3.getText().toString().isEmpty()){
            float mat1eval= Float.valueOf(mat1.getText().toString().trim());
            float mat2eval= Float.valueOf(mat2.getText().toString().trim());
            float mat3eval= Float.valueOf(mat3.getText().toString().trim());
            float prom= (mat1eval+mat2eval+mat3eval)/3;
            if(prom>=70){
                titulo.setText("Aprobaste con "+prom);
            }else{
                titulo.setText("Reprobaste con "+prom);
            }
        }else {
            Toast.makeText(this,R.string.msj, Toast.LENGTH_LONG).show();
        }
    }

    public void limpiar(View v){
        titulo.setText(R.string.titulo);
        mat1.setText("");
        mat2.setText("");
        mat3.setText("");
    }
}