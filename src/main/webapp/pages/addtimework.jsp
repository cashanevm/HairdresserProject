<%-- 
    Document   : addtimework
    Created on : 24.04.2021, 12:50:36
    Author     : NEVM PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <%
   session.setAttribute("day",request.getParameter("day"));
    session.setAttribute("month",request.getParameter("month"));
    session.setAttribute("year",request.getParameter("year"));
   
   
   
   %>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>addtimework</title>
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/success" method="post">
            <input type="submit" value="home">
        
        </form>
        <form action="<%=request.getContextPath()%>/addtimework" method="post">
            <input  type="hidden" value="<%=request.getParameter("day")%>" name="day">
        <input  type="hidden" value="<%=request.getParameter("month")%>" name="month">
        <input  type="hidden" value="<%=request.getParameter("year")%>" name="year">
            <%for(int i = 0 ; i<24;i++){%>
        <input type="checkbox" name="hours" value="<%=i%>"/><%=i%>
     <%}%>
  <input type="submit" value="submit" />
        
        
        </form>
    </body>
</html>
