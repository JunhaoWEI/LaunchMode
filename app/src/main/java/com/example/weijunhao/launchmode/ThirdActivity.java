package com.example.weijunhao.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.i("wjh","ThirdActivity.onCreate");

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("wjh","ThirdActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("wjh","ThirdActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("wjh","ThirdActivity.onRestart");
    }
}
