package com.example.weijunhao.launchmode;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("wjh", "MainActivity.onCreate");

        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            finish();
            return;
        }
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            startActivity(intent);
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        int taskId = getTaskId();
        Log.i("wjh", "MainActivity" +"所在的任务的id为: " +  taskId);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("wjh","MainActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("wjh","MainActivity.onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("wjh","MainActivity.onRestart");
    }
}
