package com.example.myapplication_shivam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_window);

        TextView newname = findViewById(R.id.newName);
        TextView newemail = findViewById(R.id.newEmail);

        String str = getIntent().getStringExtra("name").toUpperCase();
        String str1 = getIntent().getStringExtra("email");

        newname.setText("hello "+str);
        newemail.setText(str1);
    }
}