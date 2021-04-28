<%-- 
    Document   : addtime
    Created on : 24.04.2021, 12:24:47
    Author     : NEVM PC
--%>
<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Day"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Hour"%>
<%@page import="java.io.File"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%
    Calendar c = new GregorianCalendar();
    boolean canDeleteDay;
    
    //List<Day> days = (List<Day>) request.getAttribute("days");
    List<Hour> days = (List<Hour>) request.getAttribute("days");
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
    
            
  
  <%canDeleteDay = false;
      for(int j = 0; j<days.size();j++){
                
                if(days.get(j).getDate().equals(String.valueOf(c.get(Calendar.DAY_OF_MONTH))) && days.get(j).getMonth().equals(String.valueOf(c.get(Calendar.MONTH))) ){
                 // if(true){
                 canDeleteDay = true;   
                 System.out.println(days.get(j).getDate());
                     System.out.println(String.valueOf(c.get(Calendar.DAY_OF_MONTH)));
                 
                  
            %>
            <tr>
                <td>
            <%=days.get(j).getTime()%>||
            <%=days.get(j).getDate()%>            
                   
           <% 
               if(days.get(j).isWriten()){
                   %>
          || <%=days.get(j).getPhone()%> ||
            <%=days.get(j).getUsersEmail()%> ||
            <%=days.get(j).getUsersName()%> 
            <form action="<%=request.getContextPath()%>/SDeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">удалити резервацію</button>
        </form> 
            <%
                   
                   
                   
               }    
                    
                    
                    %>
                    <form action="<%=request.getContextPath()%>/SDeleteRecord" method="post"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">удалити час роботи</button>
        </form> 
                </td>
            </tr>
            
            
            <%
                        
                    
                }
                    
            }
            
   %>
            
            
            
            
            
            
       
    
    <tr>
    <td> <form action="<%=request.getContextPath()%>/addtimework"> 
        <input type="hidden" name="day" value="<%= c.get(Calendar.DAY_OF_MONTH)%>">
        <input type="hidden" name="month" value="<%=c.get(Calendar.MONTH)%>">
        <input type="hidden" name="year" value="<%= c.get(Calendar.YEAR)%>">
        <button type="submit">добавити час на <%= c.get(Calendar.DAY_OF_MONTH)%> <%=c.get(Calendar.MONTH)%> <%= c.get(Calendar.YEAR)%></button>
        </form>  
     
     
     <%if(canDeleteDay){%>
        <form action="<%=request.getContextPath()%>/DeleteDay"> 
        <input type="hidden" name="day" value="<%= c.get(Calendar.DAY_OF_MONTH)%>">
        <input type="hidden" name="month" value="<%=c.get(Calendar.MONTH)%>">
        <input type="hidden" name="year" value="<%= c.get(Calendar.YEAR)%>">
        <button type="submit">видалити <%= c.get(Calendar.DAY_OF_MONTH)%> <%=c.get(Calendar.MONTH)%> <%= c.get(Calendar.YEAR)%> з робочого графіку</button>
        </form>
         <%}%>
    </td>
    
  </tr>
    <%c.add(Calendar.DAY_OF_YEAR, 1);
      canDeleteDay = false;  
      }%>
   
  
  
 </table>
   
     
    </body>
</html>



