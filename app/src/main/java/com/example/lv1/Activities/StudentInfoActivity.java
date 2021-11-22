package com.example.lv1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lv1.R;
import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Button buttonPosaljii = findViewById(R.id.buttonPosaljii);
        buttonPosaljii.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent activity2Intent = new Intent(StudentInfoActivity.this, SummaryActivity.class);
                Intent myIntent = getIntent();
                String ime = myIntent.getStringExtra("ime");
                String prezime = myIntent.getStringExtra("prezime");
                String datum_rodenja = myIntent.getStringExtra("datum_rodenja");
                TextInputEditText textInputPredmet = findViewById(R.id.textInputPredmet);
                String predmet = textInputPredmet.getText().toString();
                TextInputEditText textInputProfesor = findViewById(R.id.textInputProfesor);
                String profesor = textInputProfesor.getText().toString();
                TextInputEditText textInputAkadGod = findViewById(R.id.textInputAkadGod);
                String akad_god = textInputAkadGod.getText().toString();
                TextInputEditText textInputBrSatPred = findViewById(R.id.txtInputBrSatPred);
                String br_sat_pred = textInputBrSatPred.getText().toString();
                TextInputEditText textInputBrSatLv = findViewById(R.id.txtInputBrSatLv);
                String br_sat_lv = textInputBrSatLv.getText().toString();
                activity2Intent.putExtra("ime", ime);
                activity2Intent.putExtra("prezime", prezime);
                activity2Intent.putExtra("datum_rodenja", datum_rodenja);
                activity2Intent.putExtra("predmet", predmet);
                activity2Intent.putExtra("profesor", profesor);
                activity2Intent.putExtra("akad_god", akad_god);
                activity2Intent.putExtra("br_sat_pred", br_sat_pred);
                activity2Intent.putExtra("br_sat_lv", br_sat_lv);
                startActivity(activity2Intent);
            }
        });
    }
}