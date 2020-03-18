package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity {

    private Button yes;
    private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        yes=(Button)findViewById(R.id.yesid);
        no=(Button)findViewById(R.id.noid);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PublicVariables.contact=true;
                openNextPage();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PublicVariables.contact=false;
                openNextPage();
            }
        });
    }
    private void openNextPage() {
        Intent intent=new Intent(this,Load.class);
        startActivity(intent);
    }
}
