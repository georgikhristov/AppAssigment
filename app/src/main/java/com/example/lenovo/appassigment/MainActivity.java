package com.example.lenovo.appassigment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



        Button diet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diet=(Button)findViewById(R.id.button2);
    }
    public void onClicked(View v){
        Intent intent = new Intent(MainActivity.this,DietActivity.class);
        startActivity(intent);
    }

}
