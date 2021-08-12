<%-- 
    Document   : index
    Created on : 24.04.2021, 10:31:58
    Author     : NEVM PC
--%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.instagram.commonthings"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>Welcome!</title>
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">


    
   <script src="https://apis.google.com/js/platform.js" async defer></script>
   <meta name="google-signin-client_id" content="217334640306-cgjotu7nlpkdrdf35h4dasbntmlu9lrd.apps.googleusercontent.com">
</head>
<style>
    
    /*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : 12.08.2021, 18:13:20
    Author     : NEVM PC
*/

html,
body {
  height: 100%;
}

body {
  display: -ms-flexbox;
  display: -webkit-box;
  display: flex;
  -ms-flex-align: center;
  -ms-flex-pack: center;
  -webkit-box-align: center;
  align-items: center;
  -webkit-box-pack: center;
  justify-content: center;
  padding-top: 40px;
  padding-bottom: 40px;
  background-color: #f5f5f5;
}

.form-signin {
  width: 100%;
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .checkbox {
  font-weight: 400;
}
.form-signin .form-control {
  position: relative;
  box-sizing: border-box;
  height: auto;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

    
</style>
<body class="text-center">
    
    <div class="form-signin" >
    
  
    
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
      document.getElementById("status").innerHTML = 'Welcome '+name+'!</p> <form action="<%=request.getContextPath()%>/success?"><input type="hidden" name="img" value="'+imagurl+'"><input type="hidden" name="name" value="'+name+'"><input type="hidden" name="email" value="'+email+'"><button class="btn btn-lg btn-primary btn-block" type="submit">Ввойти как</button></form>'
   }
   </script>
 
   
   
   <button class="btn btn-lg btn-primary btn-block" onclick="myFunction()">Выбрать другую почту</button>
   <button class="btn btn-lg btn-primary btn-block">
    <a class="h4 mb-3 font-weight-normal" style="color: white" href="https://api.instagram.com/oauth/authorize/?client_id=<%=commonthings.CLIENT_ID %>&redirect_uri=https:<%=commonthings.AUTHORIZATION_REDIRECT_URI %>&scope=user_profile,user_media&response_type=code">Зайти через Instagram</a>
   </button>
   
   </div>
   <script>
      function myFunction() {
      gapi.auth2.getAuthInstance().disconnect();
      location.reload();
   }
   </script>
</body>
</html>