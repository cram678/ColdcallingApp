package com.example.coldcallingapp;

import android.widget.ImageView;

public class Student {
    public String name;
    public String displayName;
    public long time_called = 0;

    public Student(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean fourty_min_called() {
        if (time_called==0) return false;
        if (System.currentTimeMillis()-time_called <= 2400000) return true;
        return false;
    }

    public boolean day_uncalled() {
        if (time_called==0) return true;
        if (System.currentTimeMillis()-time_called >= 86400000) return true;
        return false;
    }

    public void setTime_called(long time_called) {
        this.time_called = time_called;
    }
}
