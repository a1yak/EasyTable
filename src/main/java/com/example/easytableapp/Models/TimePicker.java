package com.example.easytableapp.Models;

import java.time.LocalTime;

public class TimePicker {
    private String shortTime;
    private LocalTime longTime;

    public TimePicker(String shortTime, LocalTime longTime) {
        this.shortTime = shortTime;
        this.longTime = longTime;
    }

    public String getShortTime() {
        return shortTime;
    }

    public void setShortTime(String shortTime) {
        this.shortTime = shortTime;
    }

    public LocalTime getLongTime() {
        return longTime;
    }

    public void setLongTime(LocalTime longTime) {
        this.longTime = longTime;
    }
}
