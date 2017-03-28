package com.example.weijunhao.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("wjh","SecondActivity.onCreate");
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("wjh","SecondActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("wjh","SecondActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("wjh","SecondActivity.onRestart");
    }
}
