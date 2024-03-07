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
                    <video src="DS/video1.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">The Introduction to Data Structures</h5>
                        <p class="card-text">Topics discussed: What is Data?, The difference between Data and Information, What is Data Structure? and Real-life examples of Data Structures.</p>
                        <!--<a href="#" class="btn btn-primary">Go somewhere</a>-->

                        <input type="checkbox" name="checkbox1" id="chk1"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="DS/video2.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Data Types vs. Abstract Data Types in Data Structures</h5>
                        <p class="card-text">Topics discussed: Data types, Difference between data type and abstract data type and The use of abstract data types.</p>
                        <input type="checkbox" name="checkbox2" id="chk2"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="DS/video3.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Advantages and Definition of Data Structures</h5>
                        <p class="card-text">Topics discussed: Definition of Data Structures, Which Data Structure to choose and Advantages of Data Structures.</p>
                        <input type="checkbox" name="checkbox3" id="chk3"> Mark as Done... 
                    </div>
                </div>
            </div>
            <br>
            <div class="myclass">
                <div class="card" style="width: 25rem;">
                    <video src="DS/video4.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Types of Data Structures</h5>
                        <p class="card-text">Topics discussed: Linear and non-linear data structures, Static and dynamic data structures.</p>
                        <input type="checkbox" name="checkbox4" id="chk4"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="DS/video5.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Understanding the Null Pointers</h5>
                        <p class="card-text">Topics discussed: What is a Null pointer?, The use of Null pointers and Facts related to Null pointer.</p>
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
