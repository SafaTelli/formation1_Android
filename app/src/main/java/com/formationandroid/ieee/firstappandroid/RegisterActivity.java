package com.formationandroid.ieee.firstappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button btnSubmit ;
    EditText editNom , editPrenom ;
    RadioButton isMember , isNotMember ;
    CheckBox checkAndroid , checkJava , checkIos ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnSubmit = findViewById(R.id.btnSubmit);
        editNom = findViewById(R.id.editNom);
        editPrenom = findViewById(R.id.editPrenom) ;
        checkAndroid = findViewById(R.id.Interandroid);
        checkJava = findViewById(R.id.InterJava) ;
        checkIos = findViewById(R.id.InterIos) ;
        isMember = findViewById(R.id.radioMember) ;
        isNotMember = findViewById(R.id.radioNotMember);




    }

    public void greeting(View view) {

        String nom = editNom.getText().toString();
        String prenom = editPrenom.getText().toString() ;
        Boolean ieeMember = isMember.isChecked() ;
        String interests = "";

        if( checkAndroid.isChecked() )
            interests+= "Android " ;
        if( checkJava.isChecked())
            interests += " Java " ;
        if( checkIos.isChecked())
            interests+= "IOS";





     /*   Toast.makeText(RegisterActivity.this,"Hello "+
                "Nom : "+
                nom + " Prénom :"+ prenom +" IEEE member"
                +ieeMember+"" + "\n Interested in :" +interests,Toast.LENGTH_LONG).show();*/

        Intent intent = new Intent(RegisterActivity.this,MainActivity.class) ;

        intent.putExtra("nom",nom) ;
        intent.putExtra("prenom",prenom) ;
        intent.putExtra("ieee", ieeMember) ;
        intent.putExtra("interests",interests);
        startActivity(intent);



    }
}
