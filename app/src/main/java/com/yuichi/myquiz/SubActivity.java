package com.yuichi.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SubActivity extends AppCompatActivity {

    String stageLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        stageLevel = intent.getStringExtra("Level");
    }

    @Override
    protected void onResume(){
        super.onResume();
    }
}
