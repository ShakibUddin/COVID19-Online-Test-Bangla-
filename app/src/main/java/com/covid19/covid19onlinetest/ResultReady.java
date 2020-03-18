package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultReady extends AppCompatActivity {

    private Button seeResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_ready);

        seeResult=(Button)findViewById(R.id.seeid);

        seeResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!PublicVariables.contact && !PublicVariables.outsider){
                    openResultSafe();
                }
                else{
                    openResultDanger();
                }
            }
        });
    }
    private void openResultSafe() {
        Intent intent=new Intent(this, ResultSafe.class);
        startActivity(intent);
    }
    private void openResultDanger() {
        Intent intent=new Intent(this, ResultDanger.class);
        startActivity(intent);
    }
}
