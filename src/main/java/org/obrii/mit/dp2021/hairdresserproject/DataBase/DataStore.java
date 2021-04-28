/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.obrii.mit.dp2021.hairdresserproject.records.Hour;

/**
 *
 * @author NEVM PC
 */
public class DataStore {
    
    
    public DataStore() {
        
    }
    
    public List<Hour> getData() throws SQLException, ClassNotFoundException{
        List<Hour> data = new ArrayList<>();
        
        Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://ec2-54-247-79-178.eu-west-1.compute.amazonaws.com:5432/d4am615tqn7fq3","ugrhebsleflarf","b1a58307a65281150d163559af0d8b3ede580b24952c424cbb738d5d48778699");
       
            Statement statement = connection.createStatement();
           
            ResultSet resultSet = statement.executeQuery("select * from hour");            
            while( resultSet.next()){
           
            if(resultSet.getString(2).equals("f")){
               System.out.println("false");
            data.add(new Hour(false, resultSet.getString(8), resultSet.getString(9), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7))
        );
            }else if(resultSet.getString(2).equals("t")){
             System.out.println("true");
             data.add(new Hour(true, resultSet.getString(8), resultSet.getString(9), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7))
        );
            }else{data.add(new Hour(resultSet.getString(8), resultSet.getString(9), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7))
        );}
            
            }
        connection.close();
        
    return data;
    }
    
//    public List<Data> sortingData(List<Data> dataBase, String s){       
//        List<Data> newData = new ArrayList<>();
//        for (Data d : dataBase) {            
//            if(d.getName().contains(s)){
//                newData.add(d);}                           
//        }
//        return newData;
//    } 
    
    

    
    
    
    
    
    
    
}
