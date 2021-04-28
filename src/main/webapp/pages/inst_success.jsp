<%@page import="org.obrii.mit.dp2021.hairdresserproject.instagram.Insta_Profile"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.instagram.Send_Curl_Req"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String code=(String)request.getParameter("code");


Send_Curl_Req obj_Send_Curl_Req=new Send_Curl_Req();


Insta_Profile obj_Insta_Profile=new Insta_Profile();
obj_Insta_Profile=obj_Send_Curl_Req.call_me(code);



%>


Login Success<br>


<img alt="" src="<%=obj_Insta_Profile.getProfile_picture()%>"><br>

User Name : <%=obj_Insta_Profile.getUsername() %><br>
Full Name : <%=obj_Insta_Profile.getFull_name() %><br>
id : <%=obj_Insta_Profile.getId() %><br>


</body>
</html>