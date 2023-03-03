package com.example.company;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String departments[] = {"Production","Finance","Marketing","H.R"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView1,departments);
        simplelist.setAdapter(arrayAdapter);
        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = simplelist.getItemAtPosition(i).toString();
                if(s=="Production")
                {
                    Intent intent = new Intent(MainActivity.this,production.class);
                    startActivity(intent);
                }
                else if(s=="Finance")
                {
                    Intent intent = new Intent(MainActivity.this,Finance.class);
                    startActivity(intent);
                }
                else if(s=="Marketing")
                {
                    Intent intent = new Intent(MainActivity.this,Marketing.class);
                    startActivity(intent);
                }
                else if(s=="H.R")
                {
                    Intent intent = new Intent(MainActivity.this,HR.class);
                    startActivity(intent);
                }
            }
        });
    }
}