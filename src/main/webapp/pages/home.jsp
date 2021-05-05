<%-- 
    Document   : home
    Created on : 24.04.2021, 10:43:22
    Author     : NEVM PC
--%>

<%@page import="org.obrii.mit.dp2021.hairdresserproject.user.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>Insert title here</title>
   
</head>
<body>
   
     <% User user = (User) session.getAttribute("user");
            String name = user.getName();
            String img = user.getImg();
            String email = user.getEmail();
           String id = user.getuserId();
         
        %>
        
      
       <h1><%=name%></h1>
        
         <%
                     
            if(user.isInstagram()){
            
            
           
            %>
 

 
        <img src="../img/user-icon.png">
        <p><%=id%></p>


<%
            
            
            
            
            
            
            }else{
             
            
           
            %>
 

        <img src="<%=img%>">
        <p><%=email%></p>

<%
            
            
            
            
            
            }
        %>
        
        
        
        
        <p><%if(user.isSuperUser()){
            %> superUser 
           <hr> 
            <form action="<%=request.getContextPath()%>/AddTime">
            <input type="submit" value="добавить время работы">
        </form>
            
            
            
            <form action="<%=request.getContextPath()%>/AddSuperUser">
            <input type="submit" value="добавить суперюзера">
        </form>
           <hr> 
           <form action="<%=request.getContextPath()%>/Clean">
            <input type="submit" value="Очистить базу от мусора">
        </form>
           <hr> 
            
            <%
            }%></p>
        
        <hr>
        <form action="<%=request.getContextPath()%>/Appointment">
            <input type="submit" value="записаться">
        </form>
        
        <hr>
        
        
        <form action="<%=request.getContextPath()%>/MyRecords">
            <input type="submit" value="мої броні">
        </form>
        
        <hr>
        
        
        
        
        
        
        
   <form id="form" action="<%=request.getContextPath()%>/"> 
   <button>Sign Out</button>
   </form>
   
   
   
   <hr>
   

</body>
</html> 