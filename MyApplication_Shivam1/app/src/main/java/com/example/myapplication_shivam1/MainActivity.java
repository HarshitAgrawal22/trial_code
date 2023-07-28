package com.example.myapplication_shivam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeWindow();
            }
        });

    }

    private void changeWindow() {
        Intent newWindow = new Intent(this, secondWindow.class);
        EditText pass1 = findViewById(R.id.passwordInput1);
        EditText pass2 = findViewById(R.id.passwordInput2);
        EditText name1 = findViewById(R.id.NameInput1);
        EditText email = findViewById(R.id.emailInput1);
        if(pass1.getText().toString().equals(pass2.getText().toString())){
            newWindow.putExtra("name", name1.getText().toString());
            newWindow.putExtra("email", email.getText().toString());
            startActivity(newWindow);
        }

    }
}