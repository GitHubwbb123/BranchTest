package com.mrwxb.branchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"我是version1.0分之", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"合并后悔怎样", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"我是主分之",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"到底咋呢高",Toast.LENGTH_SHORT).show();
    }
}
