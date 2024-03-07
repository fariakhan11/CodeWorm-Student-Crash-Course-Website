<%-- 
    Document   : contact
    Created on : 1 Feb, 2023, 7:40:11 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <!-- Bootstrap CSS -->
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

    <title>CodeWorm | The Best app to Crack</title>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">CodeWorm</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="index.html">Home</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="about.jsp">About</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Courses
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="videos.jsp">C++</a></li>
                            <li><a class="dropdown-item" href="videospython.jsp">Python</a></li>
                            <li><a class="dropdown-item" href="videosds.jsp">Data Structures</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">And Many More...</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="contact.jsp">Contact Us</a>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>

    <div class="container my-4">
        <h2>Contact Us</h2>
        <form action="contactback.jsp">
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" name="myemail">
            </div>
            <div class="formgroup">
                <label for="form-select-lg example" class="form-label">Choose Your Query</label>
                <select class="form-select form-select-sm" aria-label=".form-select-lg example" name="service">
                    <option value="About Our Service" selected>About Our Service</option>
                    <option value="Technology News">Technology News</option>
                    <option value="Web Hosting">Web Hosting</option>
                    <option value="Any topic of your Course">Any topic of your Course</option>
                </select>
                <br>
            </div>
            <div class="mb-3">
                <label for="exampleFormControlTextarea1" class="form-label">Elaborate your Concern</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="query"></textarea>
            </div>

            <button class="btn btn-primary">Submit</button>
        </form>
    </div>

    <footer style="background-color: #000" class="footer text-center">
            <div style="background-color: #000" class="container">
                <br>
                <div class="row">
                    
                    <!--                    Footer Location-->
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        
                        <h4 style="color:white" class="text-uppercase">Location</h4>
                        <p style="color:white" class="lead mb-0">
                            Mumbai
                        </p>
                        <br>
                    </div>
                    <!--                    Footer Social Icons-->
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h4 style="color:white" class="text-uppercase">Find Us At</h4>
                        <a class="btn btn-outline-light btn-social mx-1" href="#!"><i
                                class="fab fa-fw fa-facebook-f"></i></a> <a
                            class="btn btn-outline-light btn-social mx-1" href="#!"><i
                                class="fab fa-fw fa-twitter"></i></a> <a
                            class="btn btn-outline-light btn-social mx-1" href="#!"><i
                                class="fab fa-fw fa-linkedin-in"></i></a> <a
                            class="btn btn-outline-light btn-social mx-1" href="#!"><i
                                class="fab fa-fw fa-dribbble"></i></a>
                    </div>
                    <!--                    Footer About Text-->
                    <div class="col-lg-4">
                        <h4 style="color:white" class="text-uppercase">Owned By</h4>
                        <p style="color:white" class="lead mb-0">
                            SYCS23 Faria Khan
                        </p>
                    </div>
                    
                </div>
                
                        <p class="float-end"><a href="#">Back to top</a></p>
                        <p align="left" style="color: whitesmoke">© 2020–2021 CodeWorm, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>
                        
            </div>
        </footer>


    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="./JS/bootstrap.bundle.min.js"></script>
</body>
</html>
