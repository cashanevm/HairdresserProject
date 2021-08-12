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
            String id = user.getuserId();
    
    List<Hour> days = (List<Hour>) request.getAttribute("days");
    
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  
   <h1>Сегодня: <%=c.get(Calendar.DAY_OF_MONTH)%>-е число</h1>
    <form action="<%=request.getContextPath()%>/success" method="post">
            <input type="submit" value="Перейти на главную">
        
        </form>
 </table>
        
        <table border="1" width="100%" cellpadding="5">
            <tr>
   <th>Дата</th> <td>Ваш контакт!</td>
    
  </tr>
         <%
   
    for(int j = 0; j<days.size();j++){
    %>
         
              
   
        
        
        <%
          
            if(user.isInstagram()){
            
             if(id.equals(days.get(j).getUserid())){
            
           
            %>
 
<tr>
   <th><%=days.get(j).getDate()%>-е число||<%=days.get(j).getMonth()%> месеца||на время: <%=days.get(j).getTime()%> </th> 
   <td>
       <%=days.get(j).getUsersName()%> 
       <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">Удалить</button>
        </form> 
   </td>
    
  </tr>


<%
            
            }
            
            
            
            
            }else{
             if(email.equals(days.get(j).getUsersEmail())){
            
           
            %>
 
<tr>
   <th><%=days.get(j).getDate()%>||<%=days.get(j).getMonth()%>||<%=days.get(j).getTime()%></th> 
   <td>
       <%=days.get(j).getUsersName()%> 
       <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">Удалить</button>
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
