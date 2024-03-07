<%-- 
    Document   : adminview
    Created on : 9 Feb, 2023, 1:20:10 PM
    Author     : DELL
--%>

<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="./CSS/bootstrap.min.css">
        
        <style>
            table,tr, th, td {
                border-style: dotted;
            }
        </style>

    </head>
    <body>
        
        <%@include file="adminNav.jsp" %>
        
        <br> <br> <br>
        <table style="width:100%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <%
                MongoClient mongoClient;
                mongoClient = new MongoClient("localhost", 27017);
                MongoDatabase database = mongoClient.getDatabase("CodeWithFaria");
                MongoCollection<Document> collection = database.getCollection("students");

                for (Document d : collection.find()) {
                    out.println("<tr>");
                    out.println("<td>" + d.getObjectId("_id") + "</td>");
                    out.println("<td>" + d.get("Name") + "</td>");
                    //            out.print("<br> <br>");
                    out.println("<td>" + d.get("Email") + "</td>");
                    //            out.print("<br> <br>");

                    //            out.print("<br> <br>");
                    out.println("</tr>");
                    out.println(" ");
                }
            %>

        </table>
            <br>
    </body>
</html>

<%@include file="footer.jsp" %>
