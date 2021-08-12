<%-- 
    Document   : deleteRecord
    Created on : 25.04.2021, 13:15:05
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
         <h1>Вы успешно удалили!</h1>
        <form action="<%=request.getContextPath()%>/success" method="post">
        
            <input type="submit" value="Я Понял!">
        </form>
    </body>
</html>
