package com.fisei.paul_jimenez_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClickShowthirdActivity(View view){
        Intent intent = new Intent(this, thirdActivity.class);
        startActivity(intent);
    }
}