package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView txt_predmet = (TextView)findViewById(R.id.textViewPredmet);
        TextView txt_student = (TextView)findViewById(R.id.textViewStudent);
        TextView txt_datum = (TextView)findViewById(R.id.textViewDatumRodenja);
        TextView txt_godina = (TextView)findViewById(R.id.textViewAkadGod);
        TextView txt_satiPredavanja = (TextView)findViewById(R.id.textViewBrSatPred);
        TextView txt_satiLV = (TextView)findViewById(R.id.textViewBrSatPred);
        TextView txt_profesor = (TextView)findViewById(R.id.textViewProfesor);
        Button btn_exit = (Button)findViewById(R.id.buttonPocetna);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            txt_predmet.setText(extras.getString("predmet"));
            txt_student.setText(extras.getString("ime") + extras.getString("prezime"));
            txt_datum.setText(extras.getString("datum"));
            txt_godina.setText(extras.getString("godina"));
            txt_satiPredavanja.setText(extras.getString("satiPredavanja"));
            txt_satiLV.setText(extras.getString("satiLV"));
            txt_profesor.setText(extras.getString("profesor"));
        }

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SummaryActivity.this, StartActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Student newStudent = new Student(
                        extras.getString("ime"),
                        extras.getString("prezime"),
                        extras.getString("predmet"));
                StudentList studentList = com.example.lv1.StudentList.getInstance();
                studentList.AddStudent(newStudent);
                i.putExtra("student", newStudent);
                startActivity(i);
            }
        });
    }
}