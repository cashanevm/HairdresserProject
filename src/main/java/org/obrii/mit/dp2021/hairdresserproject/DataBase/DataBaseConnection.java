/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NEVM PC
 */
public class DataBaseConnection {
    
    
    
    public static void connect() throws SQLException{
        Connection c = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://ec2-54-247-79-178.eu-west-1.compute.amazonaws.com:5432/d4am615tqn7fq3","ugrhebsleflarf","b1a58307a65281150d163559af0d8b3ede580b24952c424cbb738d5d48778699");
        //c = DriverManager.getConnection("jdbc:postgresql://obrii.org:5432/db2021mit21s13","s13","6746");
        
        }
        catch(Exception e){
            e.printStackTrace();       
        }
        Statement statement = c.createStatement();     
        //int rowsIdd = statement.executeUpdate("DROP TABLE files_info");
       // int rowsIаdd = statement.executeUpdate("DROP TABLE Hour");
        int rowsId = statement.executeUpdate("CREATE TABLE IF NOT EXISTS Hour (\n" +
" id serial primary key,\n" +
" written boolean default false,\n" +
"phone varchar(15),\n" +
"time varchar(10),\n" +
"date varchar(4),\n" +
"month varchar(3),\n" +
"year varchar(5),\n" +
"usersname varchar(60),\n" +
"usersemail varchar(60),\n" +
" userid varchar(60));");
        
        
        
//        int rowsId2 = statement.executeUpdate("CREATE TABLE IF NOT EXISTS super (\n" +
//" intId varchar(60) UNIQUE);");
        
        int rowsId3 = statement.executeUpdate("INSERT INTO superUsers (intId) VALUES ('1397267678')");
        //int rowsInfo = statement.executeUpdate("CREATE TABLE IF NOT EXISTS files_info(id VARCHAR(6), naming VARCHAR(60),tables_id INTEGER , line INTEGER , possition VARCHAR(6) , height VARCHAR(6) , val VARCHAR(300) , sheet VARCHAR(30) )");
         //int rowsInfo = statement.executeUpdate("CREATE TABLE IF NOT EXISTS files_info(id VARCHAR(6), naming VARCHAR(60) NOT NULL,tables_id INTEGER NOT NULL, line INTEGER NOT NULL, possition VARCHAR(6) NOT NULL, height VARCHAR(6) NOT NULL, val VARCHAR(300) NOT NULL, sheet VARCHAR(30) NOT NULL)");
        
        if(!c.isClosed()){
            c.close();             
        }
        
      
    }
    
    
    
    
    
    
    
    
    
    
}
