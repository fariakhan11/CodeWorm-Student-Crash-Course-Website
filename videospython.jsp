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
                    <video src="Python/video1.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Introduction to Python</h5>
                        <p class="card-text">In this video we will talk about What is python? Why should we use it and what are it's benefits and features?</p>                       
                        <input type="checkbox" name="checkbox1" id="chk1"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="Python/video2.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Python IDLE</h5>
                        <p class="card-text">In this video we will talk about What is python IDLE? How do we use it and What libraries does it contain?</p>
                        <input type="checkbox" name="checkbox2" id="chk2"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="Python/video3.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Break, Continue & Pass</h5>
                        <p class="card-text">The above video explains the difference between break, continue and pass in python and how to implement each.</p>
                        <input type="checkbox" name="checkbox3" id="chk3"> Mark as Done... 
                    </div>
                </div>
            </div>
            <br>
            <div class="myclass">
                <div class="card" style="width: 25rem;">
                    <video src="Python/video4.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Python Functions</h5>
                        <p class="card-text">A function is a block of code which only runs when it is called. You can pass data, known as parameters, into a function.</p>
                        <input type="checkbox" name="checkbox4" id="chk4"> Mark as Done... 
                    </div>
                </div>
                <div class="card" style="width: 25rem;">
                    <video src="Python/video5.mp4" controls ></video>
                    <div class="card-body">
                        <h5 class="card-title">Passing Lists in Functions</h5>
                        <p class="card-text">In this video we will see how to pass a list of elements in a function and also count the number of even and odd numbers in a list.</p>
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
