<%-- 
    Document   : loginback
    Created on : 9 Feb, 2023, 12:43:37 PM
    Author     : DELL
--%>

<%@page import="com.mongodb.DBCursor"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("myemail");
            String password = request.getParameter("mypass");

            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("CodeWithFaria");
            DBCollection collection = db.getCollection("students");

            BasicDBObject query = new BasicDBObject();
            query.put("Email", username);
            query.put("Password", password);

            DBCursor cursor = collection.find(query);
            if (cursor.hasNext()) {
                // Login successful
                // Redirect the user to a welcome page
                response.sendRedirect("success.jsp");
            } else {
                // Login failed
                // Show an error message on the login page
                response.sendRedirect("error.jsp");
            }

        %>
    </body>
</html>
