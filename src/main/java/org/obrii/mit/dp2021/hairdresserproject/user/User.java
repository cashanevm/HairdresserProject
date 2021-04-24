/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.user;

import java.util.ArrayList;

/**
 *
 * @author NEVM PC
 */
public class User {
    private String img;
    private String name;
    private String email;
    private boolean superUser = false;
    private ArrayList superUsers = new ArrayList();

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public User(String img, String name, String email) {
        this.img = img;
        this.name = name;
        this.email = email;
        if(email.equals("cashanevm@gmail.com")){
            superUser = true;
        }
    }
}
