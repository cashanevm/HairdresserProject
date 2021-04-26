/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.obrii.mit.dp2021.hairdresserproject.records.Hour;

/**
 *
 * @author NEVM PC
 */
public class DataBaseInteraction {
        private String url;
        private String username;
        private String password;
    
   
        
        
        
    
    public DataBaseInteraction(String url,String username,String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

   
    
    
    
    
    
    public void addData(Hour h){
        //data=('iPhone X', 76000)
        //table=Products(ProductName, Price)
        try{
             //(written ,'phone' ,'time' ,'date' ,'month' ,'year ,'usersname' ,'usersemail');
            //hour (id ,written ,phone ,time ,date ,month ,year ,usersname ,usersemail);
            //String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
             //String username = "root";
             //String password = "password";
             Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
             try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("INSERT INTO hour (written ,phone ,time ,date ,month ,year ,usersname ,usersemail) VALUES ("+h.isWriten() +" ,'"+h.getPhone() +"' ,'"+h.getTime() +"' ,'"+h.getDate() +"' ,'"+h.getMonth() +"' ,'"+h.getYear() +"' ,'"+h.getUsersName() +"' ,'"+h.getUsersEmail() +"')" );
                System.out.printf("Added %d rows", rows);
                if(!conn.isClosed()){
                    conn.close();             
                }
             }
             
             
             
            }
         catch(Exception ex){
             System.out.println("Connection failed...");
             System.out.println(ex);
         }
            
        
    }
    
     public void updataData(String nameData, String nameRow , String time, String date,String month ){
        //nameData=Price - 5000
        //nameRow=Price
         try{
             //String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
             //String username = "root";
             //String password = "password";
             Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
             try (Connection conn = DriverManager.getConnection(url, username, password)){                  
                Statement statement = conn.createStatement();                
               if(nameData.equals("false")){
               int rows = statement.executeUpdate("UPDATE hour SET " + nameRow + " = "+ nameData + " WHERE time='"+time+"' AND date='"+date +"' AND month='"+month +"'");
               System.out.printf("Updated %d rows", rows);
               }
               else if  (nameData.equals("true")) {
                    int rows = statement.executeUpdate("UPDATE hour SET " + nameRow + " = "+ nameData + " WHERE time='"+time+"' AND date='"+date +"' AND month='"+month +"'");
               System.out.printf("Updated %d rows", rows);   
                       }
               else{
               int rows = statement.executeUpdate("UPDATE hour SET " + nameRow + " = '"+ nameData + "' WHERE time='"+time+"' AND date='"+date +"' AND month='"+month +"'");
               System.out.printf("Updated %d rows", rows);
               
               }
                 
                if(!conn.isClosed()){
                    conn.close();             
                }
             }
         }
         catch(Exception ex){
             System.out.println("Connection failed...");              
             System.out.println(ex);
         }        
    }
     
      public void deleteData(int id){
    try{
            //String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
            // String username = "root";
            //String password = "password";
             Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
              
             try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                Statement statement = conn.createStatement();
                 
                int rows = statement.executeUpdate("DELETE FROM users WHERE Id = "+id);
                System.out.printf("%d row(s) deleted", rows);
             if(!conn.isClosed()){
                    conn.close();             
                }
             }
         }
         catch(Exception ex){
             System.out.println("Connection failed...");
              
             System.out.println(ex);
         }    
    }

    

  
    
    
    
    
    
    
    
    
    
    
    
}

