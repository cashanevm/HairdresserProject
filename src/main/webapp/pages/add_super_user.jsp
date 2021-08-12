<%-- 
    Document   : add_super_user
    Created on : 12.08.2021, 11:59:47
    Author     : NEVM PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add sUser</title>
    </head>
    <body>
        <h1>Введите Instagram Id пользователя</h1>
        <form action="<%=request.getContextPath()%>/AddSuperUser" method="post">
            <input type="text" name="id">
            <input type="submit" value="Добавить нового администратора">            
        </form>
        
    </body>
</html>
