package com.example.icu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        onBackPressed();

    }
    public void onBackPressed() {

    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intent intent=new Intent(LastActivity.this,PlayerActivity.class);
        startActivity(intent);
        return super.dispatchTouchEvent(ev);
    }
}
