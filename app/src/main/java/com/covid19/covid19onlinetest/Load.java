package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Load extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        progressBar=(ProgressBar)findViewById(R.id.progressid);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();
    }

    private void openResultReady() {
        Intent intent=new Intent(this,ResultReady.class);
        startActivity(intent);
    }

    public void doWork(){
        for(progress=10;progress<100;progress+=10){
            try {
                Thread.sleep(500);
                progressBar.setProgress(progress);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        openResultReady();
    }
}
