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
import com.example.alexandrecardoso.projetowimpetfei.Model.Usuario;
import com.example.alexandrecardoso.projetowimpetfei.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class menuLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);

        /*
        Aqui eu crio um novo nó ao banco, chamado de child(Filho) ou seja, abaixo do raiz eu vou
        criar uma nova "tabela" com o nome dentro de (). o setValue informa o valor que será atribuido
        isso pode ser tanto quanto string, int etc quando objts.
         */
        //referencia.child("pontos").setValue("300");
        //referencia.child("usuarioTeste").child("001").child("nome").setValue("Lucas");

        //DatabaseReference usuarios = referencia.child("usuarios");


    }
    public void login(View view){

    }

}
