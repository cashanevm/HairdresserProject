/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.records;

import java.io.Serializable;

/**
 *
 * @author NEVM PC
 */
public class Hour implements Serializable{
  
    private boolean Writen = false;
    private String usersName;
    private String usersEmail;
    private String phone;
    private String time;
    private String date;
    private String month;
    private String year;
        private String userid;

    public Hour(String time, String date, String month) {
        this.time = time;
        this.date = date;
        this.month = month;
    }

    public Hour(boolean Writen, String usersName, String usersEmail, String phone, String time, String date, String month, String year , String userid) {
        this.Writen = Writen;
        this.usersName = usersName;
        this.usersEmail = usersEmail;
        this.phone = phone;
        this.time = time;
        this.date = date;
        this.month = month;
        this.year = year;
        this.userid = userid;
    }
    public Hour( String usersName, String usersEmail, String phone, String time, String date, String month, String year , String userid) {
       
        this.usersName = usersName;
        this.usersEmail = usersEmail;
        this.phone = phone;
        this.time = time;
        this.date = date;
        this.month = month;
        this.year = year;
         this.userid = userid;
    }

    public Hour(String time) {
        this.time = time;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isWriten() {
        return Writen;
    }

    public void setWriten(boolean Writen) {
        this.Writen = Writen;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
