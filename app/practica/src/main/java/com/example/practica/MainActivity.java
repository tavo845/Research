package com.example.practica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnOne, btnTwo, btntree, btnmas, btnfive, btnsix, btnseven, btnmenos, btneig, btnnine, btnten, btnpor, btnclear, btnigual, btndivi;
    double numero1, numero2, resultado;
    TextView txtResult;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        txtResult = findViewById(R.id.txtResult);
        Button btnOne = findViewById(R.id.btnone);
        Button btnTwo = findViewById(R.id.btntwo);
        Button btntree = findViewById(R.id.btntree);
        Button btnmas = findViewById(R.id.btnmas);
        Button btnfive = findViewById(R.id.btnfive);
        Button btnsix = findViewById(R.id.btnsixe);
        Button btnseven = findViewById(R.id.btnseven);
        Button btnmenos = findViewById(R.id.btnmenos);
        Button btneig = findViewById(R.id.btneig);
        Button btnnine = findViewById(R.id.btnnine);
        Button btnten = findViewById(R.id.btnten);
        Button btnpor = findViewById(R.id.btnpor);
        Button btnclear = findViewById(R.id.btnclear);
        Button btnigual = findViewById(R.id.btnigual);
        Button btndivi = findViewById(R.id.btndivi);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("1");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("2");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btntree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("3");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("+");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);

            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("4");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);

            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("5");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("6");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("-");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btneig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("7");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("8");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("9");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("*");
                mostrar = txtResult.getText().toString();
                txtResult.setText(mostrar);
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("CLEAR");
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append("=");
            }
        });
        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = txtResult.getText().toString();
                mostrar = mostrar + "/";
                txtResult.setText(mostrar);
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                txtResult.setText(mostrar);
                operador = "";
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = txtResult.getText().toString();
                mostrar = txtResult + "1";
                if(txtResult.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(txtResult.getText().toString());
                    btnigual.setText(String.valueOf(txtResult));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(txtResult.getText().toString());
                    txtResult.setText(String.valueOf(txtResult));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(txtResult.getText().toString());
                    txtResult.setText(String.valueOf(txtResult));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(txtResult.getText().toString());
                    txtResult.setText(String.valueOf(txtResult));
                }
            }
        });

    }

    }