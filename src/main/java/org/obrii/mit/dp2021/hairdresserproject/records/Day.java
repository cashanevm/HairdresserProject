/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.records;

import java.util.ArrayList;

/**
 *
 * @author NEVM PC
 */
public class Day {
    private String time;
    private String date;
    private String month;
    private String year;
    private ArrayList<Hour> TimesList = new ArrayList<Hour>();
    
    public Day() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    

    public ArrayList<Hour> getTimesList() {
        return TimesList;
    }

    public void addTime(Hour hour) {
        TimesList.add(hour);
    }
}

