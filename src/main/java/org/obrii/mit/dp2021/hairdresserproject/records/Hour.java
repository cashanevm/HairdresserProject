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
    private boolean Write = false;
    private boolean Writen = false;
    private String usersName;
    private String usersEmail;
    private String phone;
    private String time;

    public Hour(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isWrite() {
        return Write;
    }

    public void setWrite(boolean Write) {
        this.Write = Write;
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
