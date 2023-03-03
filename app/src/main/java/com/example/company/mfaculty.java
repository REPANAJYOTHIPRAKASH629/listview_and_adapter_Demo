package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mfaculty extends AppCompatActivity {
    ListView mfaculty;
    String mstaff[] = {"Paramesh","Rudra","Verendra"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mfaculty);
        mfaculty = (ListView)findViewById(R.id.lv4);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView1,mstaff);
        mfaculty.setAdapter(arrayAdapter);
    }
}