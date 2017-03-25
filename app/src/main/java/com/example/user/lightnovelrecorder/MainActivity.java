package com.example.user.lightnovelrecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_add_data, button_view_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_add_data = (Button) findViewById(R.id.button_add_data);
        button_view_all = (Button) findViewById(R.id.button_view_all);
        button_add_data.setOnClickListener(this);
        button_view_all.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_data:
                Intent intent = new Intent(this, AddNovelActivity.class);
                startActivity(intent);
        }
    }
}
