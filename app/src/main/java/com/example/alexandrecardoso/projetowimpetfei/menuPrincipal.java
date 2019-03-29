package com.example.alexandrecardoso.projetowimpetfei;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void abreTela(View view){
        Intent it = new Intent(menuPrincipal.this, menuLogin.class);
        startActivity(it);
    }

}


