<%-- 
    Document   : myRecords
    Created on : 25.04.2021, 12:41:43
    Author     : NEVM PC
--%>

<%@page import="org.obrii.mit.dp2021.hairdresserproject.user.User"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Hour"%>
<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Day"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <%
    
    
     Calendar c = new GregorianCalendar();
     User user = (User) session.getAttribute("user");
            String name = user.getName();
            String img = user.getImg();
            String email = user.getEmail();
    
    List<Day> days = (List<Day>) request.getAttribute("days");
    
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  
   <h1>сегодня: <%=c.get(Calendar.DAY_OF_MONTH)%></h1>
 </table>
        
        <table border="1" width="100%" cellpadding="5">
            <tr>
   <th>дата</th> <td>ваш телефон</td>
    
  </tr>
         <%
   
    for(int j = 0; j<days.size();j++){
    %>
         
              
   
        
        
        <%
    
            for(Hour h : days.get(j).getTimesList()){
            
                if(email.equals(h.getUsersEmail())){
            
           
            %>
 
<tr>
   <th><%=days.get(j).getDate()%>||<%=days.get(j).getMonth()%>||<%=h.getTime()%></th> 
   <td>
       <%=h.getUsersName()%> 
       <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=h.getTime()%>">
        <button type="submit">удалити</button>
        </form> 
   </td>
    
  </tr>


<%
            
            }
            
            }
    
    
    }
   %>
        
    </body>
</html>
