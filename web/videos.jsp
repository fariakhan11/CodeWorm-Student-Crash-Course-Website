<%-- 
    Document   : videos
    Created on : 8 Feb, 2023, 12:54:40 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="./CSS/bootstrap.min.css">

        <style>
            .myclass{
                display: flex;
                align-items: center;
                justify-content: space-around;
            }
        </style>


    </head>
    <body>

        <%@include file="navbar.jsp" %>
        <br><br><br><br>

       
            <div class="myclass">
                <div class="card" style="width: 25rem;">
                    <video src="CPP/video1.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Introduction to C++</h5>
                        <p class="card-text">A very simple and easy introduction to the basics of c++, it's pre processor directories, explanation of the syntax etc...</p>
                        <!--<a href="#" class="btn btn-primary">Go somewhere</a>-->

                        <input type="checkbox" name="checkbox1" id="chk1"> Mark as Done... 
                    </div>
                </div>

                <div class="card" style="width: 25rem;">
                    <video src="CPP/video2.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">If Else Statement</h5>
                        <p class="card-text">The if...else statement executes two different codes depending upon whether the test expression is true or false.</p>
                        <input type="checkbox" name="checkbox2" id="chk2"> Mark as Done... 
                    </div>
                </div>

                <div class="card" style="width: 25rem;">
                    <video src="CPP/video3.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Greedy Technique</h5>
                        <p class="card-text">A greedy algorithm is an approach for solving a problem by selecting the best option available at the moment.</p>
                        <input type="checkbox" name="checkbox3" id="chk3"> Mark as Done... 
                    </div>
                </div>
            </div>
            <br>
            <div class="myclass">
                <div class="card" style="width: 25rem;">
                    <video src="CPP/video4.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Switch Case Statement</h5>
                        <p class="card-text">Switch case statement evaluates a given expression and based on the evaluated value, it executes the statements associated with it.</p>
                        <input type="checkbox" name="checkbox4" id="chk4"> Mark as Done... 
                    </div>
                </div>


                <div class="card" style="width: 25rem;">
                    <video src="CPP/video5.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Loops in C++</h5>
                        <p class="card-text">In this video we will be lookin into the basic fundamentals of loops in C++, Types of Loops: for, while, do while </p>
                        <input type="checkbox" name="checkbox5" id="chk5"> Mark as Done... 
                    </div>
                </div>
            </div>

            <div class="myclass">
                <a href="#" id="mylink">
                <button class="btn btn-secondary" onclick="getCount()">Generate Report</button>
                </a>
            </div>
       
        
        
        <script src="./JS/bootstrap.bundle.min.js"></script>
        
        <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
        <script>
            function getCount(){
                var c1 = document.getElementById("chk1");
                var c2 = document.getElementById("chk2");
                var c3 = document.getElementById("chk3");
                var c4 = document.getElementById("chk4");
                var c5 = document.getElementById("chk5");
            
            
            if(c1.checked && c2.checked && c3.checked && c4.checked && c5.checked){
//                alert("All are checked...");
//                window.location.replace("https://www.tutorialrepublic.com/");
                   window.location.replace("http://localhost:8080/StudentCourse/certificate1.jsp");
            }
            else{
               alert("Please check all the checkboxes");
            }
            
    } 
        </script>


    </body>
    <br>
<%@include file="footer.jsp" %>


</html>
