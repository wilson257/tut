package com.example.tut;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText fname;
    EditText lname;
    EditText email;
    TextView fnam;
    TextView lnam;
    TextView mail;
    String q,w,e;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.editTextTextPersonName4);
        lname=(EditText) findViewById(R.id.editTextTextPersonName5);
        email=(EditText) findViewById(R.id.editTextTextEmailAddress2);
        fnam= (TextView) findViewById(R.id.textView4);
        lnam= (TextView) findViewById(R.id.textView5);
        mail= (TextView) findViewById(R.id.textView6);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        q=fname.getText().toString();
        w=lname.getText().toString();
        e=email.getText().toString();
        fnam.setText(q);
        lnam.setText(w);
        mail.setText(e);
    }
}