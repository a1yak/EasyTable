package com.example.easytableapp.Models;

import java.time.LocalDate;

public class DatePicker {

    private String shortDate;
    private LocalDate date;

    public DatePicker(String shortDate, LocalDate date) {
        this.shortDate = shortDate;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getShortDate() {
        return shortDate;
    }

    public void setShortDate(String shortDate) {
        this.shortDate = shortDate;
    }
}
