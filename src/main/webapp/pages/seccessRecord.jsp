<%-- 
    Document   : seccessAdd
    Created on : 25.04.2021, 8:56:46
    Author     : NEVM PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Успех!</title>
    </head>
    <body>
        <h1>Вы успешно записались!</h1>
        <p>На главной страничке можите пересмотреть свою запись или же удалить.</p>
        <form action="<%=request.getContextPath()%>/success" method="post">
        
            <input type="submit" value="Хорошо,я понял.">
        </form>
    </body>
</html>
