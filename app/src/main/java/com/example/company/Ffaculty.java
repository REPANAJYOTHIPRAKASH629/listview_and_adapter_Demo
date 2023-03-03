package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ffaculty extends AppCompatActivity {
    ListView ffaculty;
    String fstaff[] = {"Akash","Amrutha","Vijay"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffaculty);
        ffaculty = (ListView)findViewById(R.id.lv3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView1,fstaff);
        ffaculty.setAdapter(arrayAdapter);
    }
}