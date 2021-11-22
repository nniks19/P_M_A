package com.example.lv1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lv1.R;
import com.google.android.material.textfield.TextInputEditText;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPosalji = findViewById(R.id.buttonPosalji);
        buttonPosalji.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent activity2Intent = new Intent(getApplicationContext(), StudentInfoActivity.class);
               TextInputEditText textInputIme = findViewById(R.id.textInputIme);
               TextInputEditText textInputPrezime = findViewById(R.id.textInputPrezime);
               TextInputEditText textInputGodRod = findViewById(R.id.textInputGodRod);
               String ime= textInputIme.getText().toString().trim();
               String prezime= textInputPrezime.getText().toString().trim();
               String datum_rodenja = textInputGodRod.getText().toString().trim();
               activity2Intent.putExtra("ime", ime);
               activity2Intent.putExtra("prezime", prezime);
               activity2Intent.putExtra("datum_rodenja", datum_rodenja);
               startActivity(activity2Intent);
           }
        });

    }
}