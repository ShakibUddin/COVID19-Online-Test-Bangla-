package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultSafe extends AppCompatActivity {

    private Button again;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_safe);

        again=(Button)findViewById(R.id.again);
        textView2=(TextView)findViewById(R.id.text2id);
        if(!PublicVariables.fever && !PublicVariables.cough && !PublicVariables.cold && !PublicVariables.breathing){
            textView2.setText("আপনার স্বাস্থ্যের অবস্থা ভাল আছে");
        }
        else{
            textView2.setText("আপনার লক্ষণগুলি অন্য অসুস্থতার সাথে সম্পর্কিত হতে পারে। \nআপনার অবস্থার অবনতি ঘটলে বা দীর্ঘায়িত হয়ে থাকলে় অনুগ্রহ করে আপনার লক্ষণগুলি নিরীক্ষণ করুন এবং নিকটস্থ হাসপাতালের সাথে তাত্ক্ষণিক যোগাযোগ করুন");
        }
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
    }
    private void goHome() {
        Intent intent=new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
