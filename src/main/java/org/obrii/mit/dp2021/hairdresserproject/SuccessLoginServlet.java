/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject;

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
@WebServlet(name = "SuccessLoginServlet", urlPatterns = {"/success"})
public class SuccessLoginServlet extends HttpServlet {


     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session  = request.getSession();
                User user = new User(request.getParameter("img"),request.getParameter("name"),request.getParameter("email"));
                session.setAttribute("user",user);
                DataBaseConnection con = new DataBaseConnection();
//                DataBaseInteraction bdd = new DataBaseInteraction("jdbc:postgresql://ec2-54-247-79-178.eu-west-1.compute.amazonaws.com:5432/d4am615tqn7fq3","ugrhebsleflarf","b1a58307a65281150d163559af0d8b3ede580b24952c424cbb738d5d48778699");
//         
//                DataStore bd = new DataStore();
//           
//                try {
//            Calendar c = new GregorianCalendar();
//            for(Hour h : bd.getData()){
//            
//            Calendar c2 = new GregorianCalendar(c.get(Calendar.YEAR), Integer.parseInt(h.getMonth()), Integer.parseInt(h.getDate()));
//            if(c2.before(c)){
//             bdd.deleteDay(h.getMonth(), h.getDate());
//            }
//            }
//            
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(SuccessLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(SuccessLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
                
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
