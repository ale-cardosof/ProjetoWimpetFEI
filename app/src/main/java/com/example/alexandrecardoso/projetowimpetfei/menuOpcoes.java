package com.example.alexandrecardoso.projetowimpetfei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alexandrecardoso.projetowimpetfei.Model.Usuario;

public class menuOpcoes extends AppCompatActivity {
    EditText etNome,etEmail,etTelefone,etEndereco,etCEP,etCPF,etLogin,etSenha;
    Button btnBuscarAnimal, btnRegistrarAnimal, btnProcurase, btnListarAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opcoes);

        btnBuscarAnimal = findViewById(R.id.btnBuscarAnimal);
        btnRegistrarAnimal = findViewById(R.id.btnRegistrarAnimal);
        btnProcurase = findViewById(R.id.btnProcurase);
        btnListarAnimal = findViewById(R.id.btnListarAnimais);

        btnBuscarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRegistrarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnProcurase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnListarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
