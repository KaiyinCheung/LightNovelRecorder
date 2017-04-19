package com.example.user.lightnovelrecorder.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.user.lightnovelrecorder.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setTitle("詳情");


        Bundle bundle = getIntent().getBundleExtra("Extra");

        ((TextView) findViewById(R.id.text_nameDetail)).setText(bundle.getString("Name"));
        ((TextView) findViewById(R.id.text_progressDetail)).setText(bundle.getString("Progress"));
        ((TextView) findViewById(R.id.text_otherDetail)).setText(bundle.getString("Other"));
        ((TextView) findViewById(R.id.text_dateDetail)).setText(bundle.getString("Date"));


    }
}
