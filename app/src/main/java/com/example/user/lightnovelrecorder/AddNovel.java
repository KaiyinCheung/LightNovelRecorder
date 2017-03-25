package com.example.user.lightnovelrecorder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNovel extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {

    Button button_confirm, button_cancel;
    EditText edit_name, edit_progress, edit_other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_novel);

        setTitle("新增小說");

        button_confirm = (Button) findViewById(R.id.button_confirm);
        button_cancel = (Button) findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(this);
        button_confirm.setOnClickListener(this);
        edit_name = (EditText) findViewById(R.id.edit_name);
        edit_other = (EditText) findViewById(R.id.edit_other);
        edit_progress = (EditText) findViewById(R.id.edit_progress);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_cancel:
                if (edit_other.getText().length() + edit_name.getText().length() + edit_progress.getText().length() > 0) {
                    new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_menu_edit)
                            .setMessage("你要離開編輯嗎?")
                            .setPositiveButton("返回編輯頁面", this)
                            .setNegativeButton("離開(不保存)", this)
                            .setCancelable(true)
                            .show();
                } else finish();
                break;
            case R.id.button_confirm:
                //TODO -- insert data into database
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                return;
            case DialogInterface.BUTTON_NEGATIVE:
                finish();
                return;
        }
    }
}

