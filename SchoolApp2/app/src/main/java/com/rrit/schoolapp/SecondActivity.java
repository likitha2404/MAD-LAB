package com.rrit.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView first,second,department,student_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        first = findViewById(R.id.txt_firstname);
        second = findViewById(R.id.txt_secondname);
        department = findViewById(R.id.txt_department);
        student_id = findViewById(R.id.txt_studentid);

        String name = getIntent().getStringExtra("keyfname");
        String l_name = getIntent().getStringExtra("keylname");
        String s_depart = getIntent().getStringExtra("keydepart");
        String s_id = getIntent().getStringExtra("keystudid");

        first.setText(name);
        second.setText(l_name);
        department.setText(s_depart);
        student_id.setText(s_id);
    }
}
