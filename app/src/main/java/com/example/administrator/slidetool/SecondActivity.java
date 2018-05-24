package com.example.administrator.slidetool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.slide_libray.swipeback.SwipeBackActivity;

/**
 * Created by Administrator on 2018/5/24 0024.
 */

public class SecondActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView= (TextView) findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,SecondActivity.class));
            }
        });
    }
}
