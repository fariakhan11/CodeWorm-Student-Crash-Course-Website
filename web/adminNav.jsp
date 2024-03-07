<%-- 
    Document   : adminNav
    Created on : 9 Feb, 2023, 2:31:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./CSS/bootstrap.min.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top navbar-nav mr-auto">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">CodeWorm</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto text-center mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="adminHome.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="adminview.jsp">View User</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="deleteuser.jsp">Delete User</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="viewfeedback.jsp">Feedbacks</a>
                        </li>
                        <%--
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false">
                                Operation
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="adminview.jsp">View User</a></li>
                            <li><a class="dropdown-item" href="deleteuser.jsp">Delete User</a></li>
                                
                            </ul>
                        </li>
                        --%>
                    </ul>
                    <!-- <form class="d-flex">
                      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                      <button class="btn btn-outline-light" type="submit">Search</button>
                    </form> 
                    <div class="mx-2 p-md-1">
                        <button class="btn btn-danger"><a href="index.html" style="color: white; text-decoration: none;">Log Out</a></button>
                        
                    </div>-->
                </div>
        </nav>
        
        
        <script src="./JS/bootstrap.bundle.min.js"></script>
    </body>
</html>
