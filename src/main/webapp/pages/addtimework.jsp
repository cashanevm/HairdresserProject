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
   int Step = Integer.parseInt(request.getParameter("step"));
   
    
   
   %>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>addtimework</title>
    </head>
    <body>
        <h1>Заданый шаг в <%=Step%> минут</h1>
        <%
        
        
        
        %>
        
        
        <form action="<%=request.getContextPath()%>/success" method="post">
            <input type="submit" value="Перейти на главную">
        
        </form>
        <form action="<%=request.getContextPath()%>/addtimework" method="post">
            <input  type="hidden" value="<%=request.getParameter("day")%>" name="day">
        <input  type="hidden" value="<%=request.getParameter("month")%>" name="month">
        <input  type="hidden" value="<%=request.getParameter("year")%>" name="year">
            <%for(int i = 0 ; i<1440;i=i+Step){%>
        <input type="checkbox" name="hours" value="<%if(i==0){out.println(0);}else{out.println(i/60);}%>:<%if(i==0){out.println(0);}else{out.println(i%60);}%>"/><%if(i==0){out.println(0);}else{out.println(i/60);}%>:<%if(i==0){out.println(0);}else{out.println(i%60);}%><br>
        
     <%}%>
  <input type="submit" value="Добавить Выбранные часы" />
        
        
        </form>
  
        <form action="<%=request.getContextPath()%>/addtimework" method="get">
        <input  type="range" list="tickmarks" name="step" min="35" max="85" step="5" style="width: 100%">
       
        <datalist id="tickmarks" style="display: flex; justify-content: space-around">
            <option value="35" label="35 хв" >
            
            <option value="40">
            <option value="45">
            <option value="50">
            <option value="55">
            <option value="60" label="60" >
            <option value="65">
            <option value="70">
            <option value="75">
            <option value="80">
            <option value="85" label="85" >
        </datalist>
        
        
        <input  type="hidden" value="<%=request.getParameter("day")%>" name="day">
        <input  type="hidden" value="<%=request.getParameter("month")%>" name="month">
        <input  type="hidden" value="<%=request.getParameter("year")%>" name="year">
            
  <input type="submit" value="Задать шаг" />
        
        
        </form>
    </body>
</html>
