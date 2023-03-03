package com.example.company;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class pfaculty extends AppCompatActivity {
ListView pfaculty;
String pstaff[] = {"Prakash","Manju","Venkatesh"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfaculty);
        pfaculty = (ListView)findViewById(R.id.lv2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView1,pstaff);
        pfaculty.setAdapter(arrayAdapter);
    }
}
