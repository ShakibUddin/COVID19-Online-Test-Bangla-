package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class Age extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    private NumberPicker numberPicker;
    private Button next;
    private TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        numberPicker=(NumberPicker)findViewById(R.id.agepickerid);
        age=(TextView)findViewById(R.id.age);

        numberPicker.setMinValue(5);
        numberPicker.setMaxValue(80);
        numberPicker.setOnValueChangedListener(this);

        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextPage();
            }
        });
    }

    private void openNextPage() {
        Intent intent=new Intent(this,Fever.class);
        startActivity(intent);
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
        age.setText(newVal+" বছর");
    }
}
