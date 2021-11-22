package com.example.lv1.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lv1.Adapters.MyRecyclerAdapter;
import com.example.lv1.R;
import com.example.lv1.Models.Student;
import com.example.lv1.Models.StudentList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity implements Serializable {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mRecyclerView = (RecyclerView) findViewById(R.id.rview);

        Student student = (Student)getIntent().getSerializableExtra("student");

        StudentList studentList = StudentList.getInstance();
        ArrayList<Student> studentiSingleton;
        studentiSingleton = (ArrayList<Student>) studentList.ReturnList();

        List<Object> myDataSet = new ArrayList<>();
        myDataSet.add("Studenti:");
        myDataSet.addAll(studentiSingleton);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerAdapter(myDataSet);
        mRecyclerView.setAdapter(mAdapter);

        Button btnHomeActivitiy = (Button)findViewById(R.id.btnDalje);

        btnHomeActivitiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, PersonalInfoActivity.class));
            }
        });
    }
}