<%-- 
    Document   : certificate1
    Created on : 10 Feb, 2023, 1:32:13 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Certificate Generator using javascript</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://fonts.googleapis.com/css2?family=Archivo+Narrow&display=swap" rel="stylesheet">
    <link rel="icon" type="image/png" href="images/favicon.png"/>
    
    <style>
        *{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
   
    /* font-size: 1.5em; */
}

header{
    padding: 150px;
    background-image: url('images/bg_header.jfif');
    background-position: 50% 50%;
    background-repeat: no-repeat;
    background-size: cover;
    color: #fff;
   
    text-align: center;
    position: relative;
}
 .heading_text h1{
    text-align: center;
    font-size: 54px;
    margin-bottom:10px
    /* font-weight: 900; */
} 
main {
    padding: 20px;
    display: flex;
    flex-direction: column;
    align-items: center;
  }
  main form button{
      margin-top:25px ;
  }
  button {
    background: #8bc34a;
    color: #fff;
    border: none;
    font-size: 0.8em;
    padding: 15px 15px;
    /* margin: 20px; */
    border-radius: 5px;
    cursor: pointer;
  }
input,
span,
label{
  font-family: 'Ubuntu', sans-serif;
  display: block;
  margin: 10px;
  padding: 5px;
  border: none;
  font-size: 22px;
}
input:focus {
    outline: 0;
  }
input.question{
  font-size: 48px;
  font-weight: 300;
  border-radius: 2px;
  margin: 0;
  border: none;
  width: 80%;
  background: rgba(0, 0, 0, 0);
  transition: padding-top 0.2s ease, margin-top 0.2s ease;
  overflow-x: hidden;
}
input.question + label{
  display: block;
  position: relative;
  white-space: nowrap;
  padding: 0;
  margin: 0;
  width: 10%;
  border-top: 1px solid red;
  -webkit-transition: width 0.4s ease;
  transition: width 0.4s ease;
  height: 0px;
}
input.question:focus + label{
  width: 80%;
}
input.question:focus,
input.question:valid {
  padding-top: 35px;
}

input.question:focus + label > span,
input.question:valid + label > span {
  top: -100px;
  font-size: 22px;
  color: #333;
}



input.question:valid + label {
  border-color: green;
}

input.question:invalid{
  box-shadow: none;
}

input.question + label > span{
  font-weight: 300;
  margin: 0;
  position: absolute;
  color: #8F8F8F;
  font-size: 48px;
  top: -66px;
  left: 0px;
  z-index: -1;
  -webkit-transition: top 0.2s ease, font-size 0.2s ease, color 0.2s ease;
  transition: top 0.2s ease, font-size 0.2s ease, color 0.2s ease;
}

input[type="submit"] {
    background: #8bc34a;
    color: #fff;
    border: none;
    font-size: 0.8em;
    padding: 15px 15px;
    /* margin: 20px; */
    border-radius: 5px;
    cursor: pointer;
}
    </style>
    
</head>
<body>

    <header>
        <div class="heading_text">
            <h1>Congratulations Student For Completing The Course!</h1><br>
            <h2>We hope you had a great experience with CodeWorm</h2>
            <h3>        -CodeWithFaria</h3>
        </div>
      
    </header>
    <main>
        <div>
            <form action="certificateback.jsp">
            <input type="text" name="name" class="question" id="name" required autocomplete="off" />
            <label for="name"><span>What's your name?</span></label>
            <input type="submit" id="submitBtn" value="Get Certificate"/>
            </form>
        </div>
    </main>
    <script src="https://unpkg.com/pdf-lib/dist/pdf-lib.min.js"></script>
    <script src="https://unpkg.com/@pdf-lib/fontkit@0.0.4"></script>
    <script src="filesaver.js"></script>
    <script src="index.js"></script>
    
     <br>
    
</body>

</html>
