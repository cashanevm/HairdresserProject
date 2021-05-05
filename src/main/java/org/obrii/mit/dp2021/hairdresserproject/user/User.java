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
    private String userid;
    private String img;
    private String name;
    private String email;
     private boolean instagram;
    private boolean superUser = false;
    private ArrayList superUsers = new ArrayList();

    public String getuserId() {
        return userid;
    }


    public boolean isInstagram() {
        return instagram;
    }

    public void setInstagram(boolean instagram) {
        this.instagram = instagram;
    }

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
        this.instagram = false;
        this.img = img;
        this.name = name;
        this.email = email;
        if(email.equals("cashanevm@gmail.com")){
            superUser = true;
        }
    }
    public User(String id, String name) {
        this.instagram = true;
        this.userid = id;
        this.name = name;
        if(id.equals("1397267678")){
            superUser = true;
        }
    }
    
    
    
}
