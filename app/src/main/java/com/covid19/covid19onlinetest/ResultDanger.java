package com.covid19.covid19onlinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultDanger extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_danger);

        textView=(TextView)findViewById(R.id.textid);
        textView2=(TextView)findViewById(R.id.text2id);

        if(PublicVariables.outsider && PublicVariables.contact){
            if(PublicVariables.fever || PublicVariables.cough || PublicVariables.cold || PublicVariables.breathing){
                textView.setText("কভিড-১৯ এর সম্ভাব্য সন্দেহভাজন");
                textView2.setText("আপনার দেয়া তথ্যের ভিত্তিতে, এটি অত্যন্ত সম্ভব যে আপনি কভিড-১৯ দ্বারা আক্রান্ত হতে পারেন।");
            }
            else{
                textView.setText("কোনো লক্ষণ নেই, কিন্তু আপনি হয়তো কভিড-১৯ রোগীর সংস্পর্শে এসেছেন");
                textView2.setText("যেহেতু আপনি সবেমাত্র উচ্চ ঝুঁকিপূর্ণ অঞ্চলগুলি থেকে ফিরে এসেছেন, অন্যের কাছ থেকে আক্রান্ত হওয়ার ঝুঁকি হ্রাস করতে আপনাকে ১৪ দিনের জন্য নিজস্ব-কোয়ারান্টাইনের মধ্য দিয়ে যেতে হবে");
            }
        }
        else if(PublicVariables.outsider ){
            if(PublicVariables.fever || PublicVariables.cough || PublicVariables.cold || PublicVariables.breathing){
                textView.setText("কভিড-১৯ এর সম্ভাব্য সন্দেহভাজন");
                textView2.setText("আপনার দেয়া তথ্যের ভিত্তিতে, এটি অত্যন্ত সম্ভব যে আপনি কভিড-১৯ দ্বারা আক্রান্ত হতে পারেন।");
            }
            else{
                textView.setText("কোন লক্ষণ নেই; নিজস্ব-কোয়ারান্টাইন আবশ্যক");
                textView2.setText("যেহেতু আপনি সবেমাত্র উচ্চ ঝুঁকিপূর্ণ অঞ্চলগুলি থেকে ফিরে এসেছেন, অন্যের কাছ থেকে আক্রান্ত হওয়ার ঝুঁকি হ্রাস করতে আপনাকে ১৪ দিনের জন্য নিজস্ব-কোয়ারান্টাইনের মধ্য দিয়ে যেতে হবে।");
            }
        }
        else if(PublicVariables.contact){
            if(PublicVariables.fever || PublicVariables.cough || PublicVariables.cold || PublicVariables.breathing){
                textView.setText("কভিড-১৯ এর সম্ভাব্য সন্দেহভাজন");
                textView2.setText("আপনার দেয়া তথ্যের ভিত্তিতে, এটি অত্যন্ত সম্ভব যে আপনি কভিড-১৯ দ্বারা আক্রান্ত হতে পারেন।");
            }
            else{
                textView.setText("কোনো লক্ষণ নেই, কিন্তু আপনি হয়তো কভিড-১৯ রোগীর সংস্পর্শে এসেছেন");
                textView2.setText("যদিও আপনার থেকে কোনো লক্ষণ প্রকাশ পাই নি, সম্ভবত আপনি কভিড -১৯ রোগীর সংস্পর্শে এসেছেন।");

            }
        }
        again=(Button)findViewById(R.id.again);
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
