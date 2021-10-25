package com.example.coldcallingapp;

import android.widget.ImageView;

public class Student {
    public String name;
    public String displayName;
    public boolean called;

    public Student(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
        this.called = false;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setCalled(boolean called) {
        this.called = called;
    }
}
