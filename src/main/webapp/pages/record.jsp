<%-- 
    Document   : record
    Created on : 25.04.2021, 10:56:08
    Author     : NEVM PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Make record</h1>
        
        <p><%=request.getParameter("day")%></p>
       <p><%=request.getParameter("month")%></p>
         <p><%=request.getParameter("hour")%></p>
       <form action="<%=request.getContextPath()%>/MakeRecord" method="post">
           
           <input type="hidden" value="<%=request.getParameter("day")%>" name="day">
           <input type="hidden" value="<%=request.getParameter("month")%>" name="month">
           <input type="hidden" value="<%=request.getParameter("hour")%>" name="hour">
           <input type="phone"  name="ph">
           <input type="submit" value="ok">
           
       </form>
        
        
    </body>
</html>
