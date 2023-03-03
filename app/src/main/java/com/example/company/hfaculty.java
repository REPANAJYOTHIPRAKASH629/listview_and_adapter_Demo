package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hfaculty extends AppCompatActivity {
    ListView hfaculty;
    String hstaff[] = {"Bhanu","Jyothi","Harish"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hfaculty);
        hfaculty = (ListView)findViewById(R.id.lv5);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView1,hstaff);
        hfaculty.setAdapter(arrayAdapter);
    }
}