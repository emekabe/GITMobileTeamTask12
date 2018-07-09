package com.example.emeka.gitmobileteamtask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
    }

    public void openHome(View view)
    {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
}
