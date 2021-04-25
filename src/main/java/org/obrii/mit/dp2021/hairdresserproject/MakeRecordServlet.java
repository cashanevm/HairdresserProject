/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.hairdresserproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.hairdresserproject.files.Config;
import org.obrii.mit.dp2021.hairdresserproject.files.FilesCrud;
import org.obrii.mit.dp2021.hairdresserproject.user.User;

/**
 *
 * @author NEVM PC
 */
@WebServlet(name = "MakeRecordServlet", urlPatterns = {"/MakeRecord"})
public class MakeRecordServlet extends HttpServlet {
FilesCrud dataCrud = new FilesCrud(new File(Config.getFileName()));
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
        request.getParameter("day");
        request.getParameter("month");
request.getRequestDispatcher("pages/record.jsp").forward(request, response); 
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
        User user = (User) session.getAttribute("user");
       
       if (Config.getFileName().equals("")) {
            Config.setFileName(this.getServletContext().getRealPath("") + "day.txt");
            dataCrud = new FilesCrud(new File(Config.getFileName()));
        } 
        dataCrud.makeReservation(request.getParameter("hour"), request.getParameter("day"), request.getParameter("month"), user.getEmail(), String.valueOf(request.getParameter("ph")), user.getName());
    
    request.getRequestDispatcher("pages/seccessRecord.jsp").forward(request, response); 
     
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
