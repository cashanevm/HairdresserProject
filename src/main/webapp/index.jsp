<%-- 
    Document   : index
    Created on : 24.04.2021, 10:31:58
    Author     : NEVM PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>Insert title here</title>
   <script src="https://apis.google.com/js/platform.js" async defer></script>
   <meta name="google-signin-client_id" content="217334640306-cgjotu7nlpkdrdf35h4dasbntmlu9lrd.apps.googleusercontent.com">
</head>
<body>
   
     <form action="<%=request.getContextPath()%>/inst" method="post">
         <input type="submit" value="inst">
      </form>
    
    <div class="g-signin2" data-onsuccess="onSignIn" id="myP"></div>
      <img id="myImg"><br>
      <p id="name"></p>
      <div id="status"></div>
      <div id="email"></div>
      
      <form action="<%=request.getContextPath()%>/success?">
          <input type="hidden" name="img" value='+imagurl+'>
          <input type="hidden" name="name" value='+name+'>
          <input type="hidden" name="email" value="'+email+'">
      </form>
      
   <script type="text/javascript">
      function onSignIn(googleUser) {
      // window.location.href='success.jsp';
      var profile = googleUser.getBasicProfile();
      var imagurl=profile.getImageUrl();
      var name=profile.getName();
      var email=profile.getEmail();
      document.getElementById("myImg").src = imagurl;
      document.getElementById("name").innerHTML = name;
      document.getElementById("email").innerHTML = email;
      document.getElementById("myP").style.visibility = "hidden";
      document.getElementById("status").innerHTML = 'Welcome '+name+'!</p> <form action="<%=request.getContextPath()%>/success?"><input type="hidden" name="img" value="'+imagurl+'"><input type="hidden" name="name" value="'+name+'"><input type="hidden" name="email" value="'+email+'"><input type="submit" value="submit"></form>'
   }
   </script>
 
   
   
   <button onclick="myFunction()">Sign Out</button>
   <script>
      function myFunction() {
      gapi.auth2.getAuthInstance().disconnect();
      location.reload();
   }
   </script>
</body>
</html>