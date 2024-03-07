<%-- 
    Document   : viewfeedback
    Created on : 10 Feb, 2023, 3:21:04 PM
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
                <th>Email</th>
                <th>Service</th>
                <th>Query</th>
            </tr>
            <%
                MongoClient mongoClient;
                mongoClient = new MongoClient("localhost", 27017);
                MongoDatabase database = mongoClient.getDatabase("CodeWithFaria");
                MongoCollection<Document> collection = database.getCollection("feedback");

                for (Document d : collection.find()) {
                    out.println("<tr>");
                    out.println("<td>" + d.getObjectId("_id") + "</td>");
                    out.println("<td>" + d.get("Email") + "</td>");
                    //            out.print("<br> <br>");
                    out.println("<td>" + d.get("Service") + "</td>");
                    out.println("<td>" + d.get("Query") + "</td>");
                    //            out.print("<br> <br>");

                    //            out.print("<br> <br>");
                    out.println("</tr>");
                    out.println(" ");
                }
            %>

        </table>
            <br><br><br><br>
            <br><br><br><br>
            <br><br><br><br>
    </body>
</html>

<%@include file="footer.jsp" %>
