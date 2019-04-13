package com.example.alexandrecardoso.projetowimpetfei;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexandrecardoso.projetowimpetfei.Controller.Conexao;
import com.example.alexandrecardoso.projetowimpetfei.Model.Usuario;
import com.example.alexandrecardoso.projetowimpetfei.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class menuLogin extends AppCompatActivity {
    TextView tvUsuario,tvSenha;

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    /*Recupera o objeto que permite eu manipular os usuarios.*/
    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    DatabaseReference usuarios = referencia.child("usuarios");
    // pegar usario 001DatabaseReference usuarios = referencia.child("usuarios").child("001");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);
        tvUsuario = findViewById(R.id.tvUsuario);
        tvSenha   = findViewById(R.id.tvSenha);

        /*
        Aqui eu crio um novo nó ao banco, chamado de child(Filho) ou seja, abaixo do raiz eu vou
        criar uma nova "tabela" com o nome dentro de (). o setValue informa o valor que será atribuido
        isso pode ser tanto quanto string, int etc quando objts.
         */
        //referencia.child("pontos").setValue("300");
        //referencia.child("usuarioTeste").child("001").child("nome").setValue("Lucas");

        //DatabaseReference usuarios = referencia.child("usuarios");


    }

    public  void geraToast(String texto){
        Toast.makeText(getApplicationContext(),texto,
                Toast.LENGTH_SHORT).show();
    }
    public void login(View view){
        /* Buscando dados
        usuarios.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.i("FIREBASE", dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/

        //Logar usuário//
        usuario.signInWithEmailAndPassword(tvUsuario.getText().toString(),
                tvSenha.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Log.i("signIn","Sucesso ao logar!");
                    geraToast("Sucesso,usuário logado!");
                    Intent it = new Intent(menuLogin.this, menuOpcoes.class);
                    startActivity(it);
                }
                else
                    Log.i("signIn","Erro ao logar!");
            }
        });

        //Deslogar usuario
        //usuario.signOut();
        /*Verifica usuario logado*/
        if(usuario.getCurrentUser() != null)
            Log.i("CurrentUser", "Usuario logado");
        else
            Log.i("CurrentUser", "Usuario não logado");




    }

}
