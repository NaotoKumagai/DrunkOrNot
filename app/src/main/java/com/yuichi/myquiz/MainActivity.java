package com.yuichi.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.stage_select);
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    View.OnClickListener button1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    View.OnClickListener button2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    View.OnClickListener button3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    View.OnClickListener button4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    View.OnClickListener button5Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    View.OnClickListener button6Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("Level", ((Button) view).getText());
            startActivity(intent);
        }
    };

    public void onClick(View view){
        switch(view.getId()){
            case R.id.button1:
                view.findViewById(R.id.button1).setOnClickListener(button1Listener);
                break;
            case R.id.button2:
                view.findViewById(R.id.button2).setOnClickListener(button2Listener);
                break;
            case R.id.button3:
                view.findViewById(R.id.button3).setOnClickListener(button3Listener);
                break;
            case R.id.button4:
                view.findViewById(R.id.button4).setOnClickListener(button4Listener);
                break;
            case R.id.button5:
                view.findViewById(R.id.button5).setOnClickListener(button5Listener);
                break;
            case R.id.button6:
                view.findViewById(R.id.button6).setOnClickListener(button6Listener);
                break;
        }
    }
}
