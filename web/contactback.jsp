<%-- 
    Document   : contactback
    Created on : 10 Feb, 2023, 3:05:34 PM
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
        MongoCollection<Document> collection = database.getCollection("feedback");
        String email,service,query;
        email = request.getParameter("myemail");
        service = request.getParameter("service");
        query = request.getParameter("query");
        
        Document doc = new Document("Email",email)
                .append("Service",service)
                .append("Query",query);
        collection.insertOne(doc);
        response.sendRedirect("contactsubmit.jsp");
        
    %>
    <body>
        
    </body>
</html>
