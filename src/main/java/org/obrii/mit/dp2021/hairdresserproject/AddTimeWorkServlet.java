/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.hairdresserproject.records.Day;
import org.obrii.mit.dp2021.hairdresserproject.records.Hour;

/**
 *
 * @author NEVM PC
 */
@WebServlet(name = "AddTimeWorkServlet", urlPatterns = {"/addtimework"})
public class AddTimeWorkServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
               request.getRequestDispatcher("pages/addtimework.jsp").forward(request, response); 
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
       
        HttpSession session  = request.getSession();
       
        System.out.println(session.getAttribute("month"));
        session.getAttribute("year");
        //String str = request.getParameter("hours");
       // System.out.println(request.getParameter("hours"));
        String[] words = request.getParameterValues("hours");
        Day day = new Day();
        day.setDate(String.valueOf(session.getAttribute("day")));
            day.setMonth(String.valueOf(session.getAttribute("month")));      
            day.setYear(String.valueOf(session.getAttribute("year") ));
            
        for (String word : words) {
            System.out.println(word);
            Hour hour = new Hour(word);
            day.addTime(hour);
            
            
        }
            
                
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
