package com.example.project531.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.project531.R;

public class HemyReportActivity extends AppCompatActivity {
    SQLite DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DB = new SQLite(this);


        setContentView(R.layout.activity_hemy_report);
        Intent caller = getIntent();
        String user = caller.getStringExtra("username");
        String uage = DB.getage(user);
        String usex = DB.getsex(user);
        TextView textView = (TextView) findViewById(R.id.editTextTextPersonName3);
        TextView textViewRepo = (TextView) findViewById(R.id.textView3);
        TextView age = (TextView) findViewById(R.id.editTextNumber);
        TextView sex = (TextView) findViewById(R.id.editText);
        textView.setText(user);
        age.setText(uage);
        sex.setText(usex);
        textViewRepo.setText(user+"'s Report");
    }
}