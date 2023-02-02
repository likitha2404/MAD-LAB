package com.rrit.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText firstname,lastname,department,studentid;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        firstname = findViewById(R.id.textFieldFirstname);
        lastname = findViewById(R.id.textFieldLastname);
        department = findViewById(R.id.textFieldDeptname);
        studentid = findViewById(R.id.textFieldUSN);
        submit = findViewById(R.id.ButtonSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();
                String depart = department.getText().toString();
                String studid = studentid.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("keyfname",fname);
                intent.putExtra("keylname",lname);
                intent.putExtra("keydepart",depart);
                intent.putExtra("keystudid",studid);
                startActivity(intent);
            }
        });

    }
}
