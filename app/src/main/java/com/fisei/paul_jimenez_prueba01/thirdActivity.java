package com.fisei.paul_jimenez_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void onClickCloseThirdActivity(View view){
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
}