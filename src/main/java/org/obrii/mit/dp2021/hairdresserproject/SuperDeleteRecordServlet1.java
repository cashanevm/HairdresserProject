/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.dp2021.hairdresserproject.DataBase.DataBaseInteraction;
import org.obrii.mit.dp2021.hairdresserproject.DataBase.DataStore;


/**
 *
 * @author NEVM PC
 */
@WebServlet(name = "SuperDeleteRecordServlet1", urlPatterns = {"/SDeleteRecord"})
public class SuperDeleteRecordServlet1 extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
                DataBaseInteraction bd = new DataBaseInteraction("jdbc:postgresql://ec2-54-247-79-178.eu-west-1.compute.amazonaws.com:5432/d4am615tqn7fq3","ugrhebsleflarf","b1a58307a65281150d163559af0d8b3ede580b24952c424cbb738d5d48778699");
        try {
           if(request.getParameter("hour") == null){
                request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            bd.deleteRecord(request.getParameter("hour"), request.getParameter("day"), request.getParameter("month"));
        } catch (SQLException ex) {
            Logger.getLogger(SuperDeleteRecordServlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
                request.getRequestDispatcher("pages/seccessSDelete.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                DataBaseInteraction bd = new DataBaseInteraction("jdbc:postgresql://ec2-54-247-79-178.eu-west-1.compute.amazonaws.com:5432/d4am615tqn7fq3","ugrhebsleflarf","b1a58307a65281150d163559af0d8b3ede580b24952c424cbb738d5d48778699");
               if(request.getParameter("hour") == null){
                request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                bd.deleteTime(request.getParameter("hour"), request.getParameter("day"), request.getParameter("month"));
                request.getRequestDispatcher("pages/seccessSDelete.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
