/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.obrii.mit.dp2021.hairdresserproject.records.Day;





/**
 *
 * @author 38068
 */
public class FilesCrud  {

    private File file;

    public FilesCrud() {
    }

    public FilesCrud(File file) {
        this.file = file;
    }


    public void writeDays(List<Day> data) {

        try ( FileOutputStream f = new FileOutputStream(file);  ObjectOutputStream o = new ObjectOutputStream(f)) {

            data.forEach(d -> {
                try {
                    o.writeObject(d);
                } catch (IOException ex) {
                    Logger.getLogger(FilesCrud.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FilesCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public List<Day> readDays() {

        try ( FileInputStream f = new FileInputStream(file);  ObjectInputStream o = new ObjectInputStream(f)) {
            List<Day> result = new ArrayList<>();
            while (f.available() > 0) {
                result.add((Day) o.readObject());
            }

            return result;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesCrud.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<Day>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FilesCrud.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<Day>();
        }

    }

   
//    public List<Day> searchData(String s) {
//
// 
//       
//            
//            List<Day> newData = new ArrayList<>();
//        for (Day d : this.readData()) {
//            
//            if(d.getName().contains(s)){
//                newData.add(d);}
//                
//            
//        }
//        
//
//            return newData;
//
//        
//
//    }
    
    
    
   
    public void createDay(String Num) {
//        User newDay = new User(Num);
//        List<Day> data = this.readData();
//       
//        data.add(newDay);
//        this.writeData(data);

    }

 
//    public void deleteData(int id) {        
//        List<Day> newData = new ArrayList<>();
//        for (Day d : this.readData()) {
//            if (d.getTime() != id) {
//                newData.add(d);
//            }
//        }
//        this.writeData(newData);
//    }
    
 
//    public void updateData(int id, Day data) {        
//        List<Day> newData = new ArrayList<>();
//        data.setId(id);
//        for (Day d : this.readData()) {
//            if (d.getId() != id) {
//                newData.add(d);
//            } else{ newData.add(data); }
//        }
//        this.writeData(newData);
//    }

//       public void streamliningData() {        
//        List<Day> newData = new ArrayList<>();
//        int i = 0;
//        for (Day d : this.readData()) {
//            d.setId(i);
//            i++;
//                newData.add(d);
//            
//        }
//        this.writeData(newData);
//    }

    
    public File getFile() {
        return file;
    }

    public void setFileName(File file) {
        this.file = file;
    }

}
