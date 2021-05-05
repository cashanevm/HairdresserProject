/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject.instagram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.hairdresserproject.user.User;
import org.obrii.mit.dp2021.hairdresserproject.DataBase.DataBaseConnection;
import org.obrii.mit.dp2021.hairdresserproject.DataBase.DataBaseInteraction;
import org.obrii.mit.dp2021.hairdresserproject.DataBase.DataStore;
import org.obrii.mit.dp2021.hairdresserproject.records.Hour;

/**
 *
 * @author NEVM PC
 */
@WebServlet(name = "SuccessLoginServletInstagram", urlPatterns = {"/inst"})
public class SuccessLoginServletInstagram extends HttpServlet {


     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session  = request.getSession();
               String code=(String)request.getParameter("code");


Send_Curl_Req obj_Send_Curl_Req=new Send_Curl_Req();


        try {
           User user =  obj_Send_Curl_Req.call_me(code);
           
          
           session.setAttribute("user",user);
        } catch (Exception ex) {
            Logger.getLogger(SuccessLoginServletInstagram.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
                
                DataBaseConnection con = new DataBaseConnection();
              
        try {
            con.connect();
        } catch (SQLException ex) {
            Logger.getLogger(SuccessLoginServletInstagram.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                request.getRequestDispatcher("pages/home.jsp").forward(request, response); 
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
               request.getRequestDispatcher("pages/home.jsp").forward(request, response); 
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
