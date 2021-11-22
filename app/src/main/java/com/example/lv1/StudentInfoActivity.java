package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

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
                TextInputEditText textInputLayout = findViewById(R.id.textInputPredmet);
                String predmet = textInputLayout.getText().toString();
                activity2Intent.putExtra("ime", ime);
                activity2Intent.putExtra("predmet", predmet);
                startActivity(activity2Intent);
            }
        });
    }
}