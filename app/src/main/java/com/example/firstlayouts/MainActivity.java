package com.example.firstlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_main);
//        TextView textView=new TextView(this);
//        textView.setText("Hello, world");
//        textView.setTextSize(22);
//        textView.setGravity(Gravity.CENTER);
//        setContentView(textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}