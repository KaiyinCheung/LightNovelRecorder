package com.example.user.lightnovelrecorder;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_add_data, button_view_all;
    DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_add_data = (Button) findViewById(R.id.button_add_data);
        button_view_all = (Button) findViewById(R.id.button_view_all);
        button_add_data.setOnClickListener(this);
        button_view_all.setOnClickListener(this);

        dbHelper = new DBHelper(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_data:
                Intent intent = new Intent(this, AddNovelActivity.class);
                startActivity(intent);
                break;
            case R.id.button_view_all:
                //TODO--DELETE
                Cursor res = dbHelper.getAllData();
                if (res.getCount() == 0) {
                    // show message
                    showMessage("Error", "Nothing found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id :" + res.getString(0) + "\n");
                    buffer.append("Name :" + res.getString(1) + "\n");
                    buffer.append("Progress :" + res.getString(2) + "\n");
                    buffer.append("Other :" + res.getString(3) + "\n\n");
                }

                // Show all data
                showMessage("Data", buffer.toString());
                break;
        }
    }

    //TODO--DELETE
    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }
}
