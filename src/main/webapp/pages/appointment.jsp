<%-- 
    Document   : appointment
    Created on : 24.04.2021, 12:02:17
    Author     : NEVM PC
--%>

<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Hour"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.user.User"%>
<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Day"%>

<%@page import="java.io.File"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%
    Calendar c = new GregorianCalendar();
    
    
    List<Hour> days = (List<Hour>) request.getAttribute("days");
    
   %>
  <% User user = (User) session.getAttribute("user");
            String name = user.getName();
            String img = user.getImg();
            String email = user.getEmail();
           
         
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddTime</title>
    </head>
    
    <style type="text/css">
   TABLE {
       width: 100%;
    background: white; /* Цвет фона таблицы */
    color: white; /* Цвет текста */
   }
   TD, TH {
    background: maroon; /* Цвет фона ячеек */
    padding: 5px; /* Поля вокруг текста */
   }
  </style>
    
    <body>
        <h1>Date</h1>
        
        <form action="<%=request.getContextPath()%>/success" method="post">
            <input type="submit" value="home">
        
        </form>
        
        <table>
   
    <%for(int i = 0 ; i<14; i++){%>
  <tr>
    <th><%= c.get(Calendar.DAY_OF_MONTH)%> <%=c.get(Calendar.MONTH)%> <%= c.get(Calendar.YEAR)%></th>
  </tr>
    
   <%%>
    
            <%for(int j = 0; j<days.size();j++){
                
                if(days.get(j).getDate().equals(String.valueOf(c.get(Calendar.DAY_OF_MONTH))) && days.get(j).getMonth().equals(String.valueOf(c.get(Calendar.MONTH))) ){
                //if(true){
                
                    
                  
            %>
            <tr>
                <td>
            <%=days.get(j).getTime()%> година||
            <%=days.get(j).getDate()%>   число         
            <% 
            System.out.println(days.get(j).isWriten());
            System.out.println(days.get(j).getPhone());
            System.out.println(days.get(j).getTime());
            System.out.println(days.get(j).getUsersEmail());
            System.out.println(days.get(j).getUsersName());
           
                if (days.get(j).isWriten() && days.get(j).getUsersEmail().equals(email)){
            
            %>
            
            Заброньовано вами!
            
            <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">удалити</button>
        </form> 
          
            
            <%
               } else if (days.get(j).isWriten()){
                        
                        %>
            
            Заброньовано  
            
            
            
            <%
                        
                        }
            
            
            else{

%>
            
            <form action="<%=request.getContextPath()%>/MakeRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">записаться</button>
        </form> 
            
            
            
            <%


} 
            
            
            %>      
           
                    
                </td>
            </tr>
            
            
            <%
                        
                    
                }
                    
            }
   %>
            
            
            
            
            
            
       
    
    
    <%c.add(Calendar.DAY_OF_YEAR, 1);}%>
   
  
  
 </table>
   
     
    </body>
</html>

