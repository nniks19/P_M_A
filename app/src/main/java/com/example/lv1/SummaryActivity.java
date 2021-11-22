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
        String predmet = myIntent.getStringExtra("predmet");
        TextView textViewIme = (TextView)findViewById(R.id.textViewIme);
        textViewIme.setText(ime);
        TextView textViewPredmet = (TextView)findViewById(R.id.textViewPredmet);
        textViewPredmet.setText(predmet);

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