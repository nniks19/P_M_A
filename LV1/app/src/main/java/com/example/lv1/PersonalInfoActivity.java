package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

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
               String ime= textInputIme.getText().toString().trim();
               activity2Intent.putExtra("ime", ime);
               startActivity(activity2Intent);
           }
        });

    }
}