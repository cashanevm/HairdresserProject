<%-- 
    Document   : addtime
    Created on : 24.04.2021, 12:24:47
    Author     : NEVM PC
--%>

<%@page import="org.obrii.mit.dp2021.hairdresserproject.files.FilesCrud"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.files.Config"%>
<%@page import="java.io.File"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%

   Calendar c = new GregorianCalendar();
   FilesCrud dataCrud = new FilesCrud(new File(Config.getFileName()));
   if (Config.getFileName().equals("")) {
            Config.setFileName(this.getServletContext().getRealPath("") + "data.txt");
            dataCrud = new FilesCrud(new File(Config.getFileName()));
        }
        

session.setAttribute("day",c.get(Calendar.DAY_OF_MONTH));
        session.setAttribute("month",c.get(Calendar.MONTH));
        session.setAttribute("year",Calendar.YEAR);

   %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddTime</title>
    </head>
    <body>
        <h1>Date</h1>
    <%for(int i = 0 ; i<14; i++){
        
        
    %>
    <form action="<%=request.getContextPath()%>/addtimework"> 
        <input type="hidden" name="day" value="<%= c.get(Calendar.DAY_OF_MONTH)%>">
        <input type="hidden" name="month" value="<%=c.get(Calendar.MONTH)%>">
        <input type="hidden" name="year" value="<%= c.get(Calendar.YEAR)%>">
        <button type="submit"><%= c.get(Calendar.DAY_OF_MONTH)%> <%=c.get(Calendar.MONTH)%> <%= c.get(Calendar.YEAR)%></button>
        </form>       
        
        
        <%c.add(Calendar.DAY_OF_YEAR, 1);}%>
     
    </body>
</html>
