package com.example.alexandrecardoso.projetowimpetfei;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexandrecardoso.projetowimpetfei.Controller.Conexao;
import com.example.alexandrecardoso.projetowimpetfei.R;

public class menuLogin extends AppCompatActivity {
    EditText inputUsuario, inputSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);
        inputUsuario = findViewById(R.id.tvUsuario);
        inputSenha = findViewById(R.id.tvSenha);
    }
    public void login(View view){
        if(Conexao.Conectar()){
            Toast toast = Toast.makeText(this, "a", Toast.LENGTH_LONG);
            toast.show();
        }

        String buscaNome = inputUsuario.getText().toString();
        String buscaSenha = inputSenha.getText().toString();
        if(Conexao.login(buscaNome, buscaSenha)){
            Toast toast = Toast.makeText(this, "a", Toast.LENGTH_LONG);
            toast.show();
        }

    }

}
