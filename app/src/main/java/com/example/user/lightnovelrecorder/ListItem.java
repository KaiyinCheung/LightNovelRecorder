package com.example.user.lightnovelrecorder;

/**
 * Created by User on 25/3/2017.
 */

public class ListItem {
    private String name;
    private String progress;
    private String other;
    private String date;

    public void setOther(String other) {
        this.other = other;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOther() {
        return other;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
