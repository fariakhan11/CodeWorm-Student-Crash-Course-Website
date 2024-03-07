<%-- 
    Document   : adminHome
    Created on : 9 Feb, 2023, 2:28:34 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>
            img{
                height:100%;
            }

            .carousel img {
                /*position: absolute;*/
                top: 0;
                left: 0;
                min-width: 100%;
                min-height: 100%;
            }
        </style>
    </head>
    <body>
        <%@include file="adminNav.jsp" %>
        <h1>WelCome Admin</h1>
        <script src="./JS/bootstrap.bundle.min.js"></script>

             <br>
        
        <div id="carouselExampleCaptions" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                        aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                        aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                        aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="imgs/opt.jpg" class="d-block w-100 h-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2>Welcome to CodeWorm</h2>
                        <h5>
                            <p>Get your Coding Academics in a Fun and Cool Way !</p>
                        </h5>
                        <button class="btn btn-danger">Tech News</button>
                        <button class="btn btn-primary">Web Development</button>
                        <button class="btn btn-success">Tech Fun</button>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="imgs/2.jpg" class="d-block w-100" alt="..." height="450">
                    <div class="carousel-caption d-none d-md-block">
                        <h2>Get LatestTech News Quickly</h2>
                        <h5>
                            <p>Get Daily Blogs related to Tech Daily</p>
                        </h5>
                        <button class="btn btn-danger">Tech News</button>
                        <button class="btn btn-primary">Web Development</button>
                        <button class="btn btn-success">Tech Fun</button>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="imgs/option.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2>Good Coding Editors and Interface</h2>
                        <h5>
                            <p>Get Syntax's and Quick Cheat Sheets for Free</p>
                        </h5>
                        <button class="btn btn-danger">Tech News</button>
                        <button class="btn btn-primary">Web Development</button>
                        <button class="btn btn-success">Tech Fun</button>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <br>      
    </body>

    <script src="./JS/bootstrap.bundle.min.js"></script>
</html>

<%@include file="footer.jsp" %>
