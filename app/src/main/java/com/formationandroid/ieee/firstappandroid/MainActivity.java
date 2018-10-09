package com.formationandroid.ieee.firstappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtNom, txtPrenom , txtMember , txtInter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNom = findViewById(R.id.nom) ;
        txtPrenom = findViewById(R.id.prenom) ;
        txtMember = findViewById(R.id.membre) ;
        txtInter = findViewById(R.id.interets) ;
        Intent intent = getIntent() ;
        String nom = intent.getStringExtra("nom");
        txtNom.setText(nom);
        txtPrenom.setText(intent.getStringExtra("prenom"));
        txtMember.setText(intent.getBooleanExtra("member",true)+"");
        txtInter.setText(intent.getStringExtra("inter"));


    }
}
