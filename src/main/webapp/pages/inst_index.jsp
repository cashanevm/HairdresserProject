<%@page import="org.obrii.mit.dp2021.hairdresserproject.instagram.commonthings"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<a href="https://api.instagram.com/oauth/authorize/?client_id=<%=commonthings.CLIENT_ID %>&redirect_uri=https:<%=commonthings.AUTHORIZATION_REDIRECT_URI %>&scope=user_profile,user_media&response_type=code">Login With Instagram</a>

</body>
</html>