<%-- 
    Document   : appointment
    Created on : 24.04.2021, 12:02:17
    Author     : NEVM PC
--%>

<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Hour"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.user.User"%>
<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.hairdresserproject.records.Day"%>

<%@page import="java.io.File"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%
    Calendar c = new GregorianCalendar();
    
    
    List<Hour> days = (List<Hour>) request.getAttribute("days");
    
   %>
  <% User user = (User) session.getAttribute("user");
            String name = user.getName();
            String img = user.getImg();
            String email = user.getEmail();
           String id = user.getuserId();
         
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddTime</title>
         <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">


    </head>
    
    <style type="text/css">
 html,
body {
  overflow-x: hidden; /* Prevent scroll on narrow devices */
}

body {
  padding-top: 56px;
}

@media (max-width: 767.98px) {
  .offcanvas-collapse {
    position: fixed;
    top: 56px; /* Height of navbar */
    bottom: 0;
    width: 100%;
    padding-right: 1rem;
    padding-left: 1rem;
    overflow-y: auto;
    background-color: var(--gray-dark);
    transition: -webkit-transform .3s ease-in-out;
    transition: transform .3s ease-in-out;
    transition: transform .3s ease-in-out, -webkit-transform .3s ease-in-out;
    -webkit-transform: translateX(100%);
    transform: translateX(100%);
  }
  .offcanvas-collapse.open {
    -webkit-transform: translateX(-1rem);
    transform: translateX(-1rem); /* Account for horizontal padding on navbar */
  }
}

.nav-scroller {
  position: relative;
  z-index: 2;
  height: 2.75rem;
  overflow-y: hidden;
}

.nav-scroller .nav {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: nowrap;
  flex-wrap: nowrap;
  padding-bottom: 1rem;
  margin-top: -1px;
  overflow-x: auto;
  color: rgba(255, 255, 255, .75);
  text-align: center;
  white-space: nowrap;
  -webkit-overflow-scrolling: touch;
}

.nav-underline .nav-link {
  padding-top: .75rem;
  padding-bottom: .75rem;
  font-size: .875rem;
  color: var(--secondary);
}

.nav-underline .nav-link:hover {
  color: var(--blue);
}

.nav-underline .active {
  font-weight: 500;
  color: var(--gray-dark);
}

.text-white-50 { color: rgba(255, 255, 255, .5); }

.bg-purple { background-color: var(--purple); }

.border-bottom { border-bottom: 1px solid #e5e5e5; }

.box-shadow { box-shadow: 0 .25rem .75rem rgba(0, 0, 0, .05); }

.lh-100 { line-height: 1; }
.lh-125 { line-height: 1.25; }
.lh-150 { line-height: 1.5; }

  </style>
    
    <body>
        <h1>График работы парикмахера</h1>
        
        <form action="<%=request.getContextPath()%>/success" method="post">
            <input type="submit" value="Перейти на главную">
        
        </form>
        
        
   
            
            
            <div class="my-3 p-3 bg-white rounded box-shadow">
        <h6 class="border-bottom border-gray pb-2 mb-0">число</h6>
        
        
        
        <div class="media text-muted pt-3">
          <img data-src="holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1" alt="32x32" class="mr-2 rounded" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17b3b2d4de7%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17b3b2d4de7%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.5390625%22%20y%3D%2216.9%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true" style="width: 32px; height: 32px;">
          <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
            <div class="d-flex justify-content-between align-items-center w-100">
              <strong class="text-gray-dark">час</strong>
              <a href="https://getbootstrap.com/docs/4.0/examples/offcanvas/#">Follow</a>
            </div>
            <span class="d-block">день</span>
          </div>
        </div>
        
        
        
    
       
        <small class="d-block text-right mt-3">
          <a href="https://getbootstrap.com/docs/4.0/examples/offcanvas/#">All suggestions</a>
        </small>
      </div>
            
            
            <table>
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    <%for(int i = 0 ; i<14; i++){%>
  <tr>
    <th><%= c.get(Calendar.DAY_OF_MONTH)%> <%=c.get(Calendar.MONTH)%> <%= c.get(Calendar.YEAR)%></th>
  </tr>
    
   <%%>
    
            <%for(int j = 0; j<days.size();j++){
                
                if(days.get(j).getDate().equals(String.valueOf(c.get(Calendar.DAY_OF_MONTH))) && days.get(j).getMonth().equals(String.valueOf(c.get(Calendar.MONTH))) ){
                //if(true){
                
                    
                  
            %>
            <tr>
                <td>
            <%=days.get(j).getTime()%> время ||
            <%=days.get(j).getDate()%>   число         
            <% 
           if(user.isInstagram() && days.get(j).isWriten() && days.get(j).getUserid().equals(id)){
           
           
           
           %>
            
            Забронировано вами!
            
            <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">Удалить резервацию</button>
        </form> 
          
            
            
            
            <%
           
           
           
           
           }
                else if (days.get(j).isWriten() && days.get(j).getUsersEmail().equals(email)){
            
            %>
            
            Забронировано вами!
            
            <form action="<%=request.getContextPath()%>/DeleteRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">Удалить резервацию</button>
        </form> 
          
            
            <%
               } else if (days.get(j).isWriten()){
                        
                        %>
            
            Забронировано!  
            
            
            
            <%
                        
                        }
            
            
            else{

%>
            
            <form action="<%=request.getContextPath()%>/MakeRecord"> 
        <input type="hidden" name="day" value="<%=days.get(j).getDate()%>">
        <input type="hidden" name="month" value="<%=days.get(j).getMonth()%>">
       <input type="hidden" name="hour" value="<%=days.get(j).getTime()%>">
        <button type="submit">Записаться</button>
        </form> 
            
            
            
            <%


} 
            
            
            %>      
           
                    
                </td>
            </tr>
            
            
            <%
                        
                    
                }
                    
            }
   %>
            
            
            
            
            
            
       
    
    
    <%c.add(Calendar.DAY_OF_YEAR, 1);}%>
   
  
  
 </table>
   
     
    </body>
</html>

