package com.example.jannatunnaeem.testproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSecondActiviy(View view) {
        Intent intent = new Intent(MainActivity.this, secondActivity.class);
        startActivity(intent);
    }
}
