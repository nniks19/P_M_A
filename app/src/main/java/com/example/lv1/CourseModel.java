package com.example.lv1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.io.Serializable;

public class CourseModel implements Serializable{

    public String title;
    public ArrayList<Instructor> instructors;
    @SerializedName("expected_duration")
    public int expectedDuration;

    @Override
    public String toString() {
        return this.title; // What to display in the Spinner list.
    }
}