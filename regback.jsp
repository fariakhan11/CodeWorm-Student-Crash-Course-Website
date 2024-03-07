<%-- 
    Document   : regback
    Created on : 1 Feb, 2023, 8:28:43 PM
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
    </head>
    <% 
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("CodeWithFaria");
        MongoCollection<Document> collection = database.getCollection("students");
        String name,email,pass;
        name = request.getParameter("myname");
        email = request.getParameter("myemail");
        pass = request.getParameter("mypass");
        
        Document doc = new Document("Name",name)
                .append("Email",email)
                .append("Password",pass);
        collection.insertOne(doc);
        response.sendRedirect("regsuccess.jsp");
        
    %>
    <body>
        
    </body>
</html>
