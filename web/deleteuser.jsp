<%-- 
    Document   : deleteuser
    Created on : 9 Feb, 2023, 9:55:11 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
        crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
              rel="stylesheet" type="text/css" />
        <link
            href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
            rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="./CSS/bootstrap.min.css">
    </head>
    <body>
        <%@include file="adminNav.jsp" %>
        
        <br> <br> <br> <br>
         <div class="container">
      <div class="row">
         <div class="col-md-5 mx-auto">
            <div class="card">
               <div class="card-body">
                  <div class="row">
                     <div class="col">
                        <center>
                        <img src="images/dstaff1.png" height="150" width="150" />
                        </center>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col">
                        <center>
                           <h3>Delete User</h3>
                        </center>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col">
                        <hr>
                     </div>
                  </div>
                   <br>
                  <div class="row">
                      
                     <div class="col">
                       <form action="backdel.jsp" method="post">
                           <center>
            <input type="text" placeholder="Enter the id" name="id">
            <input type="submit" value="Submit" style="background-color:black;color:white">
                           </center>
                           <br>
        </form>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
        <br><br><br>
        <%@include file="footer.jsp" %>
    </body>
    
</html>
