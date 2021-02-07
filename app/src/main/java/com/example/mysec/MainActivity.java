package com.example.mysec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText pname;
Button b;
TextView V;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pname=(EditText)findViewById(R.id.personalname);
                b = (Button)findViewById(R.id.Hbutton);
                V= (TextView)findViewById(R.id.TV);
                b. setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String st = pname.getText().toString();
                        V.setText("Hello "+st);
                    }
                });
    }
}