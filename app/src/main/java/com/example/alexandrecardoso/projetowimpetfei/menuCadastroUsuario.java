package com.example.alexandrecardoso.projetowimpetfei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.alexandrecardoso.projetowimpetfei.Model.Usuario;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class menuCadastroUsuario extends AppCompatActivity {
    EditText etNome,etEmail,etTelefone,etEndereco,etCEP,etCPF,etLogin,etSenha;

    /* Aqui declaro uma referencia ao banco de dados do Firebase.
    em getReference, como parametro eu aponto de onde eu quero começar a buscar os dados
    como o parametro está vazio, ele irá começar na raiz do banco.
     */
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    /* Direciono a referencia para a "tabela" usuarios*/
    DatabaseReference usuarios = referencia.child("usuarios");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cadastro_usuario);
        etNome = findViewById(R.id.etNome);
        etEmail = findViewById(R.id.etEmail);
        etTelefone = findViewById(R.id.etTelefone);
        etEndereco = findViewById(R.id.etEndereco);
        etCEP = findViewById(R.id.etCEP);
        etCPF = findViewById(R.id.etCPF);
        etLogin = findViewById(R.id.etLogin);
        etSenha = findViewById(R.id.etSenha);
    }

    public void criarUsuario(View view){
        Usuario usuario = new Usuario();
        usuario.setNome(etNome.getText().toString());
        usuario.setEmail(etEmail.getText().toString());
        usuario.setTelefone(etTelefone.getText().toString());
        usuario.setEndereco(etEndereco.getText().toString());
        usuario.setCEP(etCEP.getText().toString());
        usuario.setCPF(etCPF.getText().toString());
        usuario.setLogin(etLogin.getText().toString());
        usuario.setPassword(etSenha.getText().toString());
        //Insero o objeto usuario no banco.
        usuarios.child("001").setValue(usuario);
    }
}
