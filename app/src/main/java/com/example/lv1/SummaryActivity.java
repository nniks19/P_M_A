package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent myIntent = getIntent();
        String ime = myIntent.getStringExtra("ime");
        String prezime = myIntent.getStringExtra("prezime");
        String datum_rodenja = myIntent.getStringExtra("datum_rodenja");
        String predmet = myIntent.getStringExtra("predmet");
        String profesor = myIntent.getStringExtra("profesor");
        String akad_god = myIntent.getStringExtra("akad_god");
        String br_sat_pred = myIntent.getStringExtra("br_sat_pred");
        String br_sat_lv = myIntent.getStringExtra("br_sat_lv");
        TextView textViewPredmet = (TextView)findViewById(R.id.textViewPredmet);
        textViewPredmet.setText(predmet);
        TextView textViewIme = (TextView)findViewById(R.id.textViewStudent);
        textViewIme.setText(ime + " " + prezime);
        TextView textViewDatumRodenja = (TextView)findViewById(R.id.textViewDatumRodenja);
        textViewDatumRodenja.setText(datum_rodenja);
        TextView textViewProfesor = (TextView)findViewById(R.id.textViewProfesor);
        textViewProfesor.setText(profesor);
        TextView textViewAkadGod = (TextView)findViewById(R.id.textViewAkadGod);
        textViewAkadGod.setText(akad_god);
        TextView textViewBrSatPred = (TextView)findViewById(R.id.textViewBrSatPred);
        textViewBrSatPred.setText(br_sat_pred);
        TextView textViewBrSatLv = (TextView)findViewById(R.id.textViewBrSatLv);
        textViewBrSatLv.setText(br_sat_lv);

        Button buttonPocetna = findViewById(R.id.buttonPocetna);
        buttonPocetna.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i =new Intent(SummaryActivity.this, PersonalInfoActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
    }
}